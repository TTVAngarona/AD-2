package Clases;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Clases.Equipos;

public class EquiposyJugadores {

	public static void main(String[] args) {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		
		int contador = 0;
		double contadorPuntos = 0;
		
		Query q = session.createQuery("from Equipos");
		List <Equipos> lista = q.list();
		// Obtenemos un Iterador y recorremos la lista.
		System.out.println("Numero de Equipos: " + lista.size());
		for(Equipos e : lista) {
			System.out.println("Equipo: " + e.getNombre());
			for(Object o : e.getJugadoreses()) {
				Jugadores j = (Jugadores)o;
				contador = 0;
				contadorPuntos = 0;
				for(Object ob : j.getEstadisticases()) {
					Estadisticas es = (Estadisticas) ob;
					contadorPuntos = contadorPuntos + es.getPuntosPorPartido();
					contador++;
				}
				System.out.print(j.getCodigo() + ", " + j.getNombre() + ", " + contadorPuntos/contador + ". \n" );
			}
			System.out.println();
		}
		session.close();
		System.exit(0);
	}

}
