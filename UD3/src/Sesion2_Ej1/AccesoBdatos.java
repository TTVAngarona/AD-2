package Sesion2_Ej1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBdatos {

	/*
	 * rs.next()
	 * rs.first()
	 * rs.last()
	 * rs.absolute(posicion)
	 * rs.getRow()
	 * */
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	
	private Connection conecta; //Atributo conexion, muy importante. Solo declarado sin valor, para utilizarlo en el metodo conecta 
	

	public void conectar() {
		try {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password); //Cuando ejecutemos conectar, iniciaremos todos los pasos para conectar
		
		conecta.setAutoCommit(false);
		}catch (ClassNotFoundException cnf) {
			System.out.println("Clase driver no encontrada");
		}catch (SQLException sqle) {
			System.out.println("Error SQL en la conexion");
		}
	}
	
	public void desconectar() {
		try {
		if (conecta !=null) { //Si en conecta hay algo, entonces desconecta. Con esto tenemos un metodo que cierre la conexion
			conecta.setAutoCommit(true);
			conecta.close();
		}
		}catch (SQLException sqle) {
			System.out.println("Error al desconectar");
		}
	}
	
	
	
	//Creamos un metodo que primero mire si la localidad que nos da esta vacia, devuelva un ResultSet con todos los socios.
	//Y si nos manda una localidad que existe, nos devuelva un ResultSet con solo los socios de esa Localidad.
	//Ademas despues contaremos el numero de socios(filas) del ResultSet en la interfaz
		
	public ResultSet consultaLocalidad(String localidad){
		ResultSet salida = null;
		if(localidad.isEmpty()==false) { //Si localidad es distinto de vacio ejecuta lo de dentro
			try {
			/* Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery ("SELECT * FROM socio WHERE localidad like '" + localidad +"'"); */
				 
				 CallableStatement proc = conecta.prepareCall(" CALL buscar(?) ");
				 proc.setString(1, localidad);
				 ResultSet reg =proc.executeQuery();
				 
			if (reg.next()) {//Si hay siguiente quiere decir que ha encontrado coincidencias asi que devuelve el result set de esos socios
				salida = reg;
			}else {//Si no hay siguiente, quiere decir que no ha encontrado coincidencias, en ese caso devuelve null y pondremos que no hay coincidencias
				salida = null;
			}
			}catch(SQLException sqle) {
				System.out.println("Error en la consulta para mostrar socios que coincidan en localidad");
			}
		}else {//Si esta vacio ejecuta consulta que devuelva todos los usuarios
			try {
				Statement consulta = conecta.createStatement();
				ResultSet reg = consulta.executeQuery ("SELECT * FROM socio");
					
				if (reg.next()) { //Si hay siguiente devolvera un result set con todos los socios
					salida = reg;
				}else {
					salida = null; //Si no encuentra resultados, devolvera null (en este caso nunca se vera esto, por que en el unico caso de que devolviera null, seria que no funcionara la conexion, o la consulta este mal, en cuyo caso saltara un error)
				}
				}catch(SQLException sqle) {
					System.out.println("Error en la consulta para mostrar todos los socios");
				}
		}
		return salida;
	} 
	
	
	public int actualizar(int socioID, String nombre, int estatura, int edad, String localidad){
		try {
			String sql="update socio set nombre=?, estatura=?, edad =?, localidad=? where socioID=?";
			PreparedStatement actualiza = conecta.prepareStatement(sql);
			
			
			actualiza.setString(1,nombre);
			actualiza.setInt(2,estatura);
			actualiza.setInt(3,edad);
			actualiza.setString(4,localidad);
			actualiza.setInt(5, socioID);
			conecta.commit();
			return actualiza.executeUpdate();
			
		} catch(SQLException e){
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		return 0;
		}
	}
	public int borrar (int socioId){
		int filas=0; // 
		try {
			PreparedStatement borrar = conecta.prepareStatement("DELETE FROM socio WHERE socioID=?");
			borrar.setInt(1, socioId);
			filas = borrar.executeUpdate ();
			borrar.close ();
			conecta.commit();
		return filas;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return e.getErrorCode(); // En caso de error en la consulta devuelve el c�digo de error MySQL
		}
	}
	
	public int nuevo(String nombre, int estatura, int edad, String localidad) {
		try {
			String sql="insert into socio values (?,?,?,?,?)";
			PreparedStatement inserta=conecta.prepareStatement(sql);
			inserta.setInt(1, nuevoId());
			inserta.setString(2,nombre);
			inserta.setInt(3, estatura);
			inserta.setInt(4, edad);
			inserta.setString(5,localidad);
			conecta.commit();
			return inserta.executeUpdate();
		} catch(SQLException e){
			
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return e.getErrorCode();
		}
		
	}
	public int nuevoId() {
		int nuevoId = 0;
		try {
			String sql="SELECT * FROM socio order by socioID desc limit 1";
			PreparedStatement inserta =conecta.prepareStatement(sql);
			ResultSet rs = inserta.executeQuery();
			if(rs.next()) {
				nuevoId = rs.getInt(1);
			}
			return nuevoId + 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return e.getErrorCode();
		}
		
		
	}
	
	
	
}
