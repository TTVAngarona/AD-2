import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database;
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url;
	private static String username = "root";
	private static String password = "root";
	
	private Connection conecta;
	
	public AccesoBDatos (String s) {
		database = s;
		url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	}
	//Conectar a la base de datos
	public void conectar() {
		try {
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
			System.out.println("Se ha conectado correctamente.");
		}catch(SQLException sql) {
			sql.printStackTrace();
		}catch (ClassNotFoundException cnfe) {
			System.out.println("No encuentro el fichero.");
		}
	}
	
	public boolean exportarJson() {
		ArrayList<Socio> lista = new ArrayList<Socio>();
		String consulta = "Select * from socio";
		try {
			PreparedStatement ps = conecta.prepareStatement(consulta);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				lista.add(new Socio(rs.getInt(1),rs.getString(1),rs.getInt(1),rs.getInt(0),rs.getString(0)));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		
	
		
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Desconectar a la base de datos
	public void desconectar(){
		try {
			if (conecta !=null) {
				conecta.close();
				System.out.println("Se ha desconectado correctamente.");
			}
			
		}catch (SQLException sql) {
			System.out.println("Hay algun error.");
		}
	}
}
