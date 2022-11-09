package Sesion2_Ej1;

public class ComentarioInterfaz {
/*
	Atributos:

		Container contenedor;
		JButton boton1, botonAc, botonNu, botonBo;
		JTextField caja1, etc;
		JLabel etiq, etc;
		static int ultimo = 0;
		static int posicion = 1;

		public ConsultaSocio(){
			this.setTitle("Busqueda de Socios por localidad");
			contenedor = this.getContentPane();
			contenedor.setLayout(null);

			/**** Botones ****/
/*			botonAc = new JButton("Actualizar");
			botonNu = new JButton("Nuevo");
			botonBo = new JButton("Borrar");

			/**** Cajas ****/
/*			caja1 = new JTextField();
			caja2 = new JTextField();
			caja3 = new JTextField();

			/**** Label ****/
/*			etiq1 = new JLabel("Socio");
			etiq2 = new JLabel("Nombre");
			etiq3 = new JLabel("Estatura");

			/**** Añadirlos en el Container ****/
/*			contenedor.add(boton1);
			contenedor.add(caja1);
			contenedor.add(etiq1);

			/**** Asignar el tamaño ****/
/*			botonNu.setBounds(120, 295, 100,20);
			caja1.setBounds(120, 70, 45,20);
			etiq1.setBounds(50, 70, 60,20);

			/**** Action Listener(new OyenteBoton()) ****/
/*			botonAc.addActionListener(new OyenteBoton());
			botonNu.addActionListener(new OyenteBoton());
			botonBo.addActionListener(new OyenteBoton());

			/**** Editable ****/
/*			boton1.setEnabled(false);
			boton2.setEnabled(false);
			
			//Ponemos la ventana en visible y asignamos tama�o y condicion de cierre
			this.setSize(500,400);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		public OyenteBoton implements ActionListener{
			/// Se crean los objetos ///
			AccesoBdatos abd = new AccesoBdatos():
			abd.conectar();
			ResultSet rs = abd.consultaLocalidad(caja6.getText());

			if (rs != null) { /// Si el resultset no es nulo 
				boton1.setEnabled(true);	/// boton clickable
				boton2.setEnabled(true);	/// botones clickable
				
				rs.last();
				ultimo = rs.getRow();
				rs.fist();
				
				if(event.getSource() == boton3){ /// Boton Buscar
					posicion = 1; /// vamos a la posicion inicial
					etiq6.setText("Socio " + posicion + " de " + ultimo);
					rs.absolute(posicion); /// Ir a esa posicion
							
					caja1.setText(String.valueOf(rs.getInt(1)));
					caja2.setText(rs.getString(2));
					caja3.setText(String.valueOf(rs.getInt(3)));
					caja4.setText(String.valueOf(rs.getInt(4)));
					caja5.setText(rs.getString(5));
				}
				if(event.getSource() == boton2){ /// Boton Siguiente
					if (posicion > 1) { /// Para marcar el limite hacia delante.
						posicion = 1; 
						JOptionPane.showMessageDialog(null,"No existen registros anteriores" ,"Mensaje", JOptionPane.INFORMATION_MESSAGE);
					}
					igual que el de Buscar
				}
				if(event.getSource() == boton2){ /// Boton Anterior
					if (posicion < 1) { /// Para marcar el limite hacia atrass.
						posicion = 1; 
						JOptionPane.showMessageDialog(null,"No existen registros anteriores" ,"Mensaje", JOptionPane.INFORMATION_MESSAGE);
					}
					igual que el de Buscar
				}
				if(event.getSource() == botonAc) { /// Actualizar
					int socioID = Integer.parseInt(caja1.getText());
					String nombre = caja2.getText();
					int estatura = Integer.parseInt(caja3.getText());
					int edad = Integer.parseInt(caja4.getText());
					String localidad = caja5.getText();
						
					abd.actualizar(socioID, nombre, estatura, edad, localidad);
					JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente ");
				}
				if(event.getSource() == botonBo) { /// Borrar
					int socioID = Integer.parseInt(caja1.getText());
					abd.borrar(socioID);
					JOptionPane.showMessageDialog(null, "Se ha borrado correctamente.");
				}
				if(event.getSource() == botonNu) { /// Nuevo
					String nombre = caja2.getText();
					int estatura = Integer.parseInt(caja3.getText());
					int edad = Integer.parseInt(caja4.getText());
					String localidad = caja5.getText();
											
					abd.nuevo(nombre, estatura, edad, localidad);
					JOptionPane.showMessageDialog(null, "Se ha creado uno nuevo correctamente.");
				}





			}
			




		}*/
	
	
}
