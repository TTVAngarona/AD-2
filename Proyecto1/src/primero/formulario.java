package primero;

import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.persistence.EntityExistsException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DAM2Alu10
 */
public class formulario extends javax.swing.JFrame {
	static AccesoBD abd = new AccesoBD();
	DefaultComboBoxModel dom1, dom2;

	/**
	 * Creates new form formulario
	 */
	public formulario() {
		initComponents();

		// Relleno comoboboxes:
		dom1 = new DefaultComboBoxModel();
		String[] labels = new String[abd.listaDep().size() + 1];
		labels[0] = "Elige Departamento";
		for (int i = 1; i < abd.listaDep().size(); i++) {
			labels[i] = abd.listaDep().get(i).getDeptNo() + " / " + abd.listaDep().get(i).getDnombre();
		}
		dom1.removeAllElements();
		for (String s : labels) {
			dom1.addElement(s);
		}
		jComboBoxDepto.setModel(dom1);

		dom2 = new DefaultComboBoxModel();
		String[] labels2 = new String[abd.listaEmp().size() + 1];
		labels2[0] = "Elige Director";
		for (int i = 1; i < abd.listaEmp().size(); i++) {
			labels2[i] = abd.listaEmp().get(i).getEmpNo() + " / " + abd.listaEmp().get(i).getApellido();
		}
		dom2.removeAllElements();
		for (String s : labels2) {
			dom2.addElement(s);
		}
		jComboBoxDire.setModel(dom2);
		//

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabelTitulo = new javax.swing.JLabel();
		jLabelNum = new javax.swing.JLabel();
		jLabelApe = new javax.swing.JLabel();
		jLabelOfi = new javax.swing.JLabel();
		jLabelSal = new javax.swing.JLabel();
		jLabelCom = new javax.swing.JLabel();
		jTextFieldEmp = new javax.swing.JTextField();
		jTextFieldApe = new javax.swing.JTextField();
		jTextFieldOfi = new javax.swing.JTextField();
		jTextFieldSal = new javax.swing.JTextField();
		jTextFieldCom = new javax.swing.JTextField();
		jPanelBotones = new javax.swing.JPanel();
		jButtonInsert = new javax.swing.JButton();
		jButtonDelete = new javax.swing.JButton();
		jButtonUpdate = new javax.swing.JButton();
		jButtonExit = new javax.swing.JButton();
		jButtonClean = new javax.swing.JButton();
		jButtonConsulta = new javax.swing.JButton();
		jLabelFecha = new javax.swing.JLabel();
		jTextFieldFecha = new javax.swing.JTextField();
		jLabelFormatoFecha = new javax.swing.JLabel();
		jComboBoxDepto = new javax.swing.JComboBox<>();
		jComboBoxDire = new javax.swing.JComboBox<>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabelTitulo.setText("GESTIÓN DE EMPLEADOS");

		jLabelNum.setText("Nº EMPLEADO:");

		jLabelApe.setText("APELLIDO:");

		jLabelOfi.setText("OFICIO:");

		jLabelSal.setText("SALARIO:");

		jLabelCom.setText("COMISIÓN:");

		jPanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanelBotones.setForeground(new java.awt.Color(255, 255, 255));

		jButtonInsert.setText("INSERTAR");
		jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonInsertActionPerformed(evt);
			}
		});

		jButtonDelete.setText("ELIMINAR");
		jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonDeleteActionPerformed(evt);
			}
		});

		jButtonUpdate.setText("MODIFICAR");
		jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonUpdateActionPerformed(evt);
			}
		});

		jButtonExit.setText("SALIR");
		jButtonExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExitActionPerformed(evt);
			}
		});

		jButtonClean.setText("LIMPIAR");
		jButtonClean.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCleanActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
		jPanelBotones.setLayout(jPanelBotonesLayout);
		jPanelBotonesLayout
				.setHorizontalGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelBotonesLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanelBotonesLayout.createSequentialGroup().addGap(79, 79, 79)
								.addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(65, Short.MAX_VALUE)));
		jPanelBotonesLayout.setVerticalGroup(jPanelBotonesLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
						.addGap(20, 20, 20)
						.addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonUpdate).addComponent(jButtonDelete).addComponent(jButtonInsert))
						.addGap(10, 10, 10)
						.addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonClean).addComponent(jButtonExit))
						.addContainerGap(20, Short.MAX_VALUE)));

		jButtonConsulta.setText("CONSULTAR EMPLEADO");
		jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConsultaActionPerformed(evt);
			}
		});

		jLabelFecha.setText("FECHA ALTA:");

		jLabelFormatoFecha.setText("(yyyy-MM-dd)");

		jComboBoxDepto.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		jComboBoxDepto.setName(""); // NOI18N
		jComboBoxDepto.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBoxDeptoItemStateChanged(evt);
			}
		});

		jComboBoxDire.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		jComboBoxDire.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBoxDireItemStateChanged(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup().addComponent(jLabelNum)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextFieldEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButtonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(jLabelOfi)
														.addGap(46, 46, 46).addComponent(jTextFieldOfi,
																javax.swing.GroupLayout.PREFERRED_SIZE, 200,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup().addComponent(jLabelApe)
														.addGap(31, 31, 31).addComponent(jTextFieldApe,
																javax.swing.GroupLayout.PREFERRED_SIZE, 200,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup().addComponent(jLabelCom)
														.addGap(26, 26, 26).addComponent(jTextFieldCom,
																javax.swing.GroupLayout.PREFERRED_SIZE, 100,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(34, 34, 34)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jComboBoxDire, javax.swing.GroupLayout.Alignment.TRAILING,
														0, 159, Short.MAX_VALUE)
												.addComponent(jComboBoxDepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)))
								.addGroup(layout.createSequentialGroup().addComponent(jLabelSal).addGap(37, 37, 37)
										.addComponent(jTextFieldSal, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabelFormatoFecha, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(64, 64, 64).addComponent(jLabelTitulo)))
				.addGap(20, 20, 20)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabelTitulo).addGap(30, 30, 30)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabelNum)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextFieldEmp, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonConsulta)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabelApe)
						.addComponent(jTextFieldApe, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jComboBoxDepto, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabelOfi)
						.addComponent(jTextFieldOfi, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jComboBoxDire, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabelSal)
						.addComponent(jTextFieldSal, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelFecha)
								.addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabelFormatoFecha)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabelCom)
						.addComponent(jTextFieldCom, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(20, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonInsertActionPerformed
		Empleados e = new Empleados();
		try {
			e.setEmpNo((short) Integer.parseInt(jTextFieldEmp.getText()));
			e.setApellido(jTextFieldApe.getText());
			String[] s = dom1.getSelectedItem().toString().split(" / ");
			e.setDepartamentos(new Departamentos((byte) Integer.parseInt(s[0])));
			s = dom2.getSelectedItem().toString().split(" / ");
			e.setDir((short) Integer.parseInt(s[0]));
			e.setFechaAlt(Date.valueOf(jTextFieldFecha.getText()));
			e.setOficio(jTextFieldOfi.getText());
			e.setSalario(Float.parseFloat(jTextFieldSal.getText()));
			e.setComision(null);

			int resultado = abd.nuevo(e);
			
			if (resultado == 1)
				JOptionPane.showMessageDialog(null, "Se ha insertado correctamente", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			if (resultado == 0)
				JOptionPane.showMessageDialog(null, "No se ha insertado ningún registro", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			
			limpiar();
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "Todos los campos deben de completarse a excepción de la comisión.",
					"ERROR", JOptionPane.WARNING_MESSAGE);
		} catch (Exception e1) {
			e1.getStackTrace();
			JOptionPane.showMessageDialog(null, "Existe un empleado con el mismo número.", "ERROR",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonUpdateActionPerformed
		try {
			Empleados e = abd.consultaE((short) Integer.parseInt(jTextFieldEmp.getText()));
			e.setApellido(jTextFieldApe.getText());
			String[] s = dom1.getSelectedItem().toString().split(" / ");
			e.setDepartamentos(new Departamentos((byte) Integer.parseInt(s[0])));
			s = dom2.getSelectedItem().toString().split(" / ");
			e.setDir((short) Integer.parseInt(s[0]));
			e.setFechaAlt(Date.valueOf(jTextFieldFecha.getText()));
			e.setOficio(jTextFieldOfi.getText());
			e.setSalario(Float.parseFloat(jTextFieldSal.getText()));
			e.setComision(null);

			int resultado = abd.actualizar(e);
			if (resultado == 1)
				JOptionPane.showMessageDialog(null, "Se ha insertado correctamente", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			if (resultado == 0)
				JOptionPane.showMessageDialog(null, "No se ha insertado ningún registro", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			limpiar();
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "Todos los campos deben de completarse a excepción de la comisión.",
					"ERROR", JOptionPane.WARNING_MESSAGE);
		}

	}

	private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonConsultaActionPerformed
		try {
			Empleados e = abd.consultaE((short) Integer.parseInt(jTextFieldEmp.getText()));
			jTextFieldEmp.setText(String.valueOf((int) e.getEmpNo()));
			jTextFieldApe.setText(e.getApellido());
			jTextFieldCom.setText(String.valueOf(e.getComision()));
			jTextFieldOfi.setText(e.getOficio());
			jTextFieldSal.setText(String.valueOf(e.getSalario()));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			jTextFieldFecha.setText(sdf.format(e.getFechaAlt()));

			int i = abd.listaDep().indexOf(abd.consultaD(e.getDepartamentos().getDeptNo()));
			jComboBoxDepto.setSelectedIndex(i);

			int j = abd.listaEmp().indexOf(abd.consultaE(e.getDir()));
			jComboBoxDire.setSelectedIndex(j);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "El empleado no existe", "ERROR", JOptionPane.WARNING_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe de introducir un número de empleado", "ERROR",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDeleteActionPerformed
		try {
		
			ArrayList<Empleados> lista = abd.listaEmp();
			String s = "";
			for (Empleados e : lista) {
				s += e.getDir() + " ";
			}

			Empleados e = abd.consultaE((short) Integer.parseInt(jTextFieldEmp.getText()));
			
			String director = e.getEmpNo() + " / " + e.getApellido();
			
			int res = JOptionPane.showConfirmDialog(null,
					"Se va a proceder a borrar a " + e.getApellido() + " ¿desea continuar?", "ATENCIÓN",
					JOptionPane.YES_NO_OPTION);
			if (res != 0)
				throw new Exception();
			
			if (s.contains(String.valueOf((int) e.getEmpNo())))
				throw new EntityExistsException();

			if (abd.borrar(e) == 1)
				JOptionPane.showMessageDialog(null, "Se ha borrado correctamente", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			if (abd.borrar(e) == 0)
				JOptionPane.showMessageDialog(null, "No se ha borrado ningún registro", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			
			
			limpiar();
		} catch (EntityExistsException e) {
			JOptionPane.showMessageDialog(null, "No no se puede borrar un empleado que sea jefe de otro", "ATENCIÓN",
					JOptionPane.WARNING_MESSAGE);

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "No existe ningun empleado con ese id", "ATENCIÓN",
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Operacion cancelada", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
		}

	}// GEN-LAST:event_jButtonDeleteActionPerformed

	private void jComboBoxDeptoItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jComboBoxDeptoItemStateChanged
		// TODO add your handling code here:
	}

	private void jComboBoxDireItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jComboBoxDireItemStateChanged
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBoxDireItemStateChanged

	private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExitActionPerformed
		System.exit(0);
	}

	private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCleanActionPerformed
		limpiar();
	}

	private void limpiar() {
		jTextFieldEmp.setText("");
		jTextFieldApe.setText("");
		jTextFieldCom.setText("");
		jTextFieldOfi.setText("");
		jTextFieldSal.setText("");
		jTextFieldFecha.setText("");
		jComboBoxDepto.setSelectedIndex(0);
		jComboBoxDire.setSelectedIndex(0);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abd.conectar();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				new formulario().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonClean;
	private javax.swing.JButton jButtonConsulta;
	private javax.swing.JButton jButtonDelete;
	private javax.swing.JButton jButtonExit;
	private javax.swing.JButton jButtonInsert;
	private javax.swing.JButton jButtonUpdate;
	private javax.swing.JComboBox<String> jComboBoxDepto;
	private javax.swing.JComboBox<String> jComboBoxDire;
	private javax.swing.JLabel jLabelApe;
	private javax.swing.JLabel jLabelCom;
	private javax.swing.JLabel jLabelFecha;
	private javax.swing.JLabel jLabelFormatoFecha;
	private javax.swing.JLabel jLabelNum;
	private javax.swing.JLabel jLabelOfi;
	private javax.swing.JLabel jLabelSal;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JPanel jPanelBotones;
	private javax.swing.JTextField jTextFieldApe;
	private javax.swing.JTextField jTextFieldCom;
	private javax.swing.JTextField jTextFieldEmp;
	private javax.swing.JTextField jTextFieldFecha;
	private javax.swing.JTextField jTextFieldOfi;
	private javax.swing.JTextField jTextFieldSal;
	// End of variables declaration//GEN-END:variables
}