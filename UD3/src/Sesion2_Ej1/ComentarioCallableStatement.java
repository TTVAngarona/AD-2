package Sesion2_Ej1;

public class ComentarioCallableStatement {
	/// CallableStatement se usa para las funciones y los procedimientos hay 3 tipos segun el in, out o inout.

/*	1. Funciones con IN

		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);	

		CallableStatement proc = conn.prepareCall("Select funcion(?)"); /// Para llamar a la función totalEmpleados.
		proc.setInt(1,110); /// entero el cual vamos a usar en la funcion
		
		ResultSet rs = proc.executeQuery(); /// Devuelve la fila o filas pedidas en la funcion.

		int numero = 0 /// Para regoer el valor de la columna (se puede hacer sin variable)
		
		if(rs.next()){ /// Hacemos un if para recorer el resultSet
			Syso(rs.getInt(1)); /// Imprimimos los datos del resultSet
		}else{
			Syso("No se puede recuperar); /// Si no hay nada para recuperar te devuelve k no se puede
		}
		rs.close; /// Cerramos el ResultSet
		proc.close; /// Cerramos el CallableStatement
		conn.close; /// Cerramos la conexion

	CREATE FUNCTION totalEmpleados (p_departamento INTEGER)

	2. Procedimiento con OUT

		Class.forName(driver); /// iniciamos el driver
		Connection conn = DriverManager.getConnection(url, username, password); /// Iniciamos la conexion
		
		CallableStatement proc = conn.prepareCall( "CALL procedimiento(?,?,?)" ); /// Usamos el callable para llamar el procedimiento
		proc.setInt(1,120); /// dato de entrada
		proc.registerOutParameter(2, Types.INTEGER); /// dato de salida
		proc.registerOutParameter(3, Types.INTEGER); /// dato de salida	
		proc.execute(); /// Ejecuto el procedimiento
		
		Syso("proc.getInt(2) + " - " + proc.getInt(3)); Imprimimos las dos salidas
		proc.close; /// Cerramos la consulta
		conn.close; /// Cerramos la conexion

	CREATE PROCEDURE jefeyPresupuesto (IN departamento INTEGER, OUT director INTEGER, OUT presupuesto INTEGER)

	3. Procedimiento con INOUT

		Class.forName(driver); /// iniciamos el driver
		Connectino conn = DriverManager.getConnection(url, username, password); /// iniciamos la conexion

		CallableStatement proc = conn.prepareCall("CALL procedimiento(?)"); /// llamamos el procedimiento
		double cantidad = 25000; /// no es obligatorio crearlo puedes llamarlo primero
		proc.setDouble(1, cantidad); /// acomplamos 
		proc.registerOutParameter(1, Types.DECIMAL); /// tambien es la salida 

		proc.execute(); /// ejecutamos el procedimiento
		Sysou(proc.getDouble(1)); /// lo imprimos
		
		proc.close(); /// cerramos el procedimiento
		conn.close(); /// cerrramos la conexion


	CREATE PROCEDURE pesetasAeuros (INOUT p_p1 DECIMAL(7,2) )*/
}
