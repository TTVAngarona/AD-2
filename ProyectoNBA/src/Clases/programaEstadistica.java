package Clases;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Clases.Jugadores;
import Clases.Estadisticas
;


public class programaEstadistica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		
		int contadorRegistros = 0;
		System.out.println("Escribe el codigo del jugador que quiere ivestigar: ");
		int codigo = s.nextInt();
		Jugadores jug = new Jugadores();
		jug =(Jugadores) session.get(Jugadores.class, (int) codigo);
		if (jug==null) {
			System.out.println("El departamento no existe");
			JOptionPane.showMessageDialog(null, "El jugador no existe");	
		}else {
			System.out.println("DATOS DEL JUGADOR: " + jug.getCodigo());
			System.out.println("Nombre: " + jug.getNombre());
			System.out.println("Equipo: " + jug.getEquipos().getNombre());
			System.out.println("Temporadas \t Ptos \t Asis \t Tap \t Reb");
			System.out.println("==============================");
			for(Object e : jug.getEstadisticases()) {
				Estadisticas es = (Estadisticas) e;
				System.out.println(es.getId().getTemporada() + "\t\t " + es.getPuntosPorPartido() + "\t " +  es.getAsistenciasPorPartido() + "\t " +  es.getTaponesPorPartido() + "\t " +  es.getRebotesPorPartido());
				contadorRegistros++;
			}
			System.out.println("Numero de registros : " + contadorRegistros);
		}
		session.close();
		System.exit(0);
		
		
		
	}

}
