/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/OkCancelDialog.java to edit this template
 */
package accesoadatostarea1;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Locale;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Gaertan
 */
public class ConcatenaArchivosDatos extends javax.swing.JDialog {
    private final static String ER_DNI = "\\d{8}[A-Za-z]";
   private final static String ER_NOMBRE = "^[A-Z]([a-z]|[a-zñáéíóú])*(([,.] |[ '-])[A-Za-z][a-z]*)*(\\.?)$";
     
        
    private String apellido1;
    private  String apellido2;
    private String nombre;


    private String dni;
    private int edad;
        
        
   	private static boolean comprobarLetraDni(String DNI){
		char tempLetraDNI = DNI.charAt(DNI.length()-1);
		//elimina todo lo que sea un numero y convierte la caadena en uno.
		String dniFixed = DNI.replaceAll("\\D","");
		int dniNumber = Integer.parseInt(dniFixed);
		char[] LETRAS_DNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		if (LETRAS_DNI[dniNumber%23]==tempLetraDNI) {return true;}
		else return false;

	}     
    public String getApellido1() {
        return apellido1;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
 		if (dni == null) {throw new NullPointerException("ERROR: El DNI no puede ser nulo.");}
		String dni1 = dni;
		dni1.replaceAll("\\W","");
		dni1.toUpperCase();
		if (!dni1.matches(ER_DNI)) {throw new IllegalArgumentException("ERROR: El DNI no tiene un formato válido.");}
		if(!comprobarLetraDni(dni1)) {throw new IllegalArgumentException("ERROR: La letra del DNI no es correcta.");}
		this.dni = dni1;
    }
    public void setApellido1(String apellido1) {
       // this.apellido1 = apellido1;
               		if (apellido1 == null) {throw new NullPointerException("ERROR: El apellido no puede ser nulo.");}
		if (apellido1.trim().isEmpty()||apellido1.matches("\\s+") || !apellido1.trim().matches(ER_NOMBRE)) {throw new IllegalArgumentException("ERROR: El apellido no tiene un formato válido.");}
		apellido1 = apellido1.toLowerCase(Locale.ROOT);
		//separa la string cuando encuentra cualquier tipo de espacio/separador

		String nombreRoto[] = apellido1.split("\\s+");
		  for(int i = 0;i<nombreRoto.length;i++) {
			  nombreRoto[i].replaceAll("\\s\\W","");
			  try {
				  nombreRoto[i].trim();
		//deshace la string en el primer caracter y el resto,lo pasa a mayus y la vuelve a juntar
				  String palabra = nombreRoto[i].substring(nombreRoto[i].indexOf(" ") + 1);
				  palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
				  if(palabra!=" ")nombreRoto[i] = palabra;}
			  catch(Exception e) {}
		  }


		  //crea una nueva String uniendo los elementos de la arraay separados por un espacio
		 String resultado = String.join(" ", nombreRoto);
		 if (!resultado.trim().matches(ER_NOMBRE)) {throw new IllegalArgumentException("ERROR: El apellido no tiene un formato válido.");}

		 this.apellido1 = resultado.trim();
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
     //   this.apellido2 = apellido2;
     
     //pese a que en 1º comprobabamos esto, puede haber usuarios sin segundo apellido
        // if (apellido2 == null) {throw new NullPointerException("ERROR: El apellido 2 no puede ser nulo.");}
		if (apellido2.trim().isEmpty()||apellido2.matches("\\s+") || !apellido2.trim().matches(ER_NOMBRE)) {throw new IllegalArgumentException("ERROR: El apellido 2 no tiene un formato válido.");}
		apellido2 = apellido2.toLowerCase(Locale.ROOT);
		//separa la string cuando encuentra cualquier tipo de espacio/separador

		String nombreRoto[] = apellido1.split("\\s+");
		  for(int i = 0;i<nombreRoto.length;i++) {
			  nombreRoto[i].replaceAll("\\s\\W","");
			  try {
				  nombreRoto[i].trim();
		//deshace la string en el primer caracter y el resto,lo pasa a mayus y la vuelve a juntar
				  String palabra = nombreRoto[i].substring(nombreRoto[i].indexOf(" ") + 1);
				  palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
				  if(palabra!=" ")nombreRoto[i] = palabra;}
			  catch(Exception e) {}
		  }


		  //crea una nueva String uniendo los elementos de la arraay separados por un espacio
		 String resultado = String.join(" ", nombreRoto);
		 if (!resultado.trim().matches(ER_NOMBRE)) {throw new IllegalArgumentException("ERROR: El apellido 2 no tiene un formato válido.");}

		 this.apellido2 = resultado.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //this.nombre = nombre;
        		if (nombre == null) {throw new NullPointerException("ERROR: El nombre no puede ser nulo.");}
		if (nombre.trim().isEmpty()||nombre.matches("\\s+") || !nombre.trim().matches(ER_NOMBRE)) {throw new IllegalArgumentException("ERROR: El nombre no tiene un formato válido.");}
		nombre = nombre.toLowerCase(Locale.ROOT);
		//separa la string cuando encuentra cualquier tipo de espacio/separador

		String nombreRoto[] = nombre.split("\\s+");
		  for(int i = 0;i<nombreRoto.length;i++) {
			  nombreRoto[i].replaceAll("\\s\\W","");
			  try {
				  nombreRoto[i].trim();
		//deshace la string en el primer caracter y el resto,lo pasa a mayus y la vuelve a juntar
				  String palabra = nombreRoto[i].substring(nombreRoto[i].indexOf(" ") + 1);
				  palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
				  if(palabra!=" ")nombreRoto[i] = palabra;}
			  catch(Exception e) {}
		  }


		  //crea una nueva String uniendo los elementos de la arraay separados por un espacio
		 String resultado = String.join(" ", nombreRoto);
		 if (!resultado.trim().matches(ER_NOMBRE)) {throw new IllegalArgumentException("ERROR: El nombre no tiene un formato válido.");}

		 this.nombre = resultado.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form ConcatenaArchivos
     */
    public ConcatenaArchivosDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setViewportView(jTextPane2);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(18, 12, 120, 1));

        jLabel1.setText("Apellidos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Dni");

        jLabel4.setText("Edad");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setText("El archivo no existe, introduzca datos para crearlo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void aviso(String texto){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AvisoDialog dialog = new AvisoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setText(texto);
                dialog.setVisible(true);
            }
        });}
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        /* setNombre(jTextPane1.getText());
        setApellido1(jTextField1.getText());
        setApellido2(jTextField2.getText());
        setEdad( (int)jSpinner1.getValue());*/
        
        try { setNombre(jTextPane1.getText());
        setApellido1(jTextField1.getText());
        setApellido2(jTextField2.getText());
        setDni(jTextPane2.getText());
        setEdad( (int)jSpinner1.getValue());
        doClose(RET_OK);
            
        } catch (Exception e) {
            System.err.print(e);
            aviso(e.getMessage());
        }

    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
                try { setNombre(jTextPane1.getText());
        setApellido1(jTextField1.getText());
        setApellido2(jTextField2.getText());
        setDni(jTextPane2.getText());
        setEdad( (int)jSpinner1.getValue());
        doClose(RET_OK);
            
        } catch (Exception e) {
            System.err.print(e);
            aviso(e.getMessage());
        }

    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
                try { setNombre(jTextPane1.getText());
        setApellido1(jTextField1.getText());
        setApellido2(jTextField2.getText());
        setDni(jTextPane2.getText());
        setEdad( (int)jSpinner1.getValue());
        doClose(RET_OK);
            
        } catch (Exception e) {
            System.err.print(e);
            aviso(e.getMessage());
        }

    }//GEN-LAST:event_closeDialog

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConcatenaArchivosDatos dialog = new ConcatenaArchivosDatos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
