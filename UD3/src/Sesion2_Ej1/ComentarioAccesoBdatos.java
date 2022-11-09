package Sesion2_Ej1;

public class ComentarioAccesoBdatos {
/*
	AccesoBDatos:


		private static {driver, database, hostname, port, url, username, password}
		private Connection conecta;


		- Conectar:
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
		- Desconectar:
			if(conecta != null){
				conecta.null;
			{

		- Método:
			/******** Actualizar ********/
/*			public int actualizar(String "x"){
				ResultSet salida = null;
				
				PreparedStatement consulta = conecta.prepareStatement("update baseDatos set nombre = ?");
				consulta.setString(1, x);
				return consulta.executeUpdate();		
			}

			/******** Borrar ********/
/*			public int borrar(int "id"){
				int filas = 0;
				PreparedStatement borrar = conecta.preparedStatement(Delete from baseDatos where id = "id");
				borrar.setInt(1, id);
				filas = borrar.executeUpdate();
				borrar.close();
				return filas;

			}

			/******** Nuevo ********/
/*			public int nuevo (String nombre, etc) {
				String sql="insert into socio values (?,?,?,?,?)";
				PreparedStatement inserta=conecta.prepareStatement(sql);
				inserta.setInt(1, nuevoId());
				inserta.setString(2,nombre);
				return inserta.executeUpdate();
			}
					/******** Nuevo ********/
/*					public int nuevoId() {
					int nuevoId = 0;

					String sql=  "SELECT * FROM socio order by socioID desc limit 1";
					PreparedStatement inserta =conecta.prepareStatement(sql);
					ResultSet rs = inserta.executeQuery();
					if(rs.next()) {
						nuevoId = rs.getInt(1);
					}
					return nuevoId + 1;

*/
			
}
