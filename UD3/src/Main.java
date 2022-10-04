
public class Main {

	public static void main(String[] args) {
		AccesoBDatos baloncesto = new AccesoBDatos("baloncesto");
		baloncesto.conectar();
		
		baloncesto.desconectar();

	}

}
