package Ejercicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Clases.Socio;
import Ejercicios.SessionFactoryUtil;

public class AccesoBdatos {	
	private SessionFactory sesionFactory; //Atributo conexion, muy importante. Solo declarado sin valor, para utilizarlo en el metodo conecta 
	private Session session; 

	public void conectar() {
		sesionFactory =SessionFactoryUtil.getSessionFactory();
		session = sesionFactory.openSession();
	}
	
	public void desconectar() {
		sesionFactory.close();
		sesionFactory = null;
		
	}
	
	
	
	//Creamos un metodo que primero mire si la localidad que nos da esta vacia, devuelva un ResultSet con todos los socios.
	//Y si nos manda una localidad que existe, nos devuelva un ResultSet con solo los socios de esa Localidad.
	//Ademas despues contaremos el numero de socios(filas) del ResultSet en la interfaz
		
	public List consultaLocalidad(String localidad){
		Query salida = null;
		if(localidad.isEmpty()==false) { //Si localidad es distinto de vacio ejecuta lo de dentro
			salida = session.createSQLQuery("call buscar(:loca)").addEntity(Socio.class).setParameter("loca", localidad);
			 List<Socio> socios = salida.list();
			return socios;
		}else {//Si esta vacio ejecuta consulta que devuelva todos los usuarios
			//Statement consulta = conecta.createStatement();
			//ResultSet reg = consulta.executeQuery ("SELECT * FROM socio");
			Query proc = session.createQuery("FROM Socio");
			 List<Socio> socios = proc.list();
			 return socios;
		}
	} 
	
	
	/*public int actualizar(int socioID, String nombre, int estatura, int edad, String localidad){
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
	*/
	
	
}
