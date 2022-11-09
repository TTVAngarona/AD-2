package Sesion2_Ej1;

public class ComentarioTransacciones {

	/// Transacciones para ejecutar diferentes sentencias a la vez. Por ejemplo, un poner y sacar dinero.

	/*para poder ejecutar comodamente las transacciones usamos
		
		Class.forName(driver); hola soy mario
		Connection conn = DriverManager.getConnection(url, username, password);
		
	----->	conn.setAutoCommit(false); /// lo ponemos en false para poder ejecutar dos sentencias a la vez.
		
		Statement stmt = conn.createStatement();
		
		stmt.execute("Update etc");	--|
						--|--> Las dos a la vez.
		stmt.execute("Update etc");	--|

		stmt.close();
	----->	conn.commit(); /// Hacemos el commit para ejecutar las sentencias dentro del Try
		conn.close	

		/// Si entramos en el catch usaremos
	-----> conn.rollback /// Para volver atras y no ejecuar las transacciones
	*/
	
}
