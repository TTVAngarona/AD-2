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
import org.hibernate.Transaction;

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
	
	
	public int actualizar(Socio socio){
		Transaction tx = session.beginTransaction();
		Socio socio2 = (Socio) session.load(Socio.class,(int)socio.getSocioId());
		socio2.setNombre(socio.getNombre());
		socio2.setEstatura(socio.getEstatura());
		socio2.setEdad(socio.getEdad());
		socio2.setLocalidad(socio.getLocalidad());
		
		session.update(socio2); // modifica el objeto
		tx.commit();
		System.out.println("Nombre nuevo: " + socio.getNombre());
		return 0;
		
	}
	public int borrar (int socioId){
		Transaction tx = session.beginTransaction();
		
		Socio socio = (Socio) session.get(Socio.class, (Integer) socioId);
		session.delete(socio);
		tx.commit();		
		return 0;
	}
	public int nuevo(Socio socio) {
		Transaction tx = session.beginTransaction();
		
		
		
		return 1;
	}
	/*public int nuevoId() {
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
		
		
	}*/
	
	
}
