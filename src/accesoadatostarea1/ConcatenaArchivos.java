/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package accesoadatostarea1;

import static accesoadatostarea1.ConcatenaArchivosDatos.RET_CANCEL;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Gaertan
 */
public class ConcatenaArchivos extends javax.swing.JDialog {
    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
    private int returnStatus;
    /**
     * Creates new form ConcatenaArchivos
     */
    public ConcatenaArchivos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldRuta1 = new javax.swing.JTextField();
        jTextFieldRuta2 = new javax.swing.JTextField();
        jTextFieldArchivo1 = new javax.swing.JTextField();
        jTextFieldArchivo2 = new javax.swing.JTextField();
        jLabelRutas = new javax.swing.JLabel();
        jLabelNombres = new javax.swing.JLabel();
        jButtonCheck1 = new javax.swing.JButton();
        jButtonCheck2 = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRuta3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldRuta1.setText("ruta1");
        jTextFieldRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuta1ActionPerformed(evt);
            }
        });

        jTextFieldRuta2.setText("ruta2");

        jTextFieldArchivo1.setText("archivo1");

        jTextFieldArchivo2.setText("archivo2");
        jTextFieldArchivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldArchivo2ActionPerformed(evt);
            }
        });

        jLabelRutas.setText("Rutas a los archivos");

        jLabelNombres.setText("Nombres de los archivos(sin extension)");

        jButtonCheck1.setText("Check/crear");
        jButtonCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheck1ActionPerformed(evt);
            }
        });

        jButtonCheck2.setText("Check/crear");
        jButtonCheck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheck2ActionPerformed(evt);
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

        jLabel1.setText("numero de espacios entre lineas");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jLabel2.setText("ruta al archivo resultante");

        jTextFieldRuta3.setText("escribir ruta donde escribir nuevo archivo");
        jTextFieldRuta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuta3ActionPerformed(evt);
            }
        });

        jLabel3.setText("(por defecto carpeta resultado)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRuta2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jTextFieldRuta1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldArchivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldArchivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCheck1)
                                    .addComponent(jButtonCheck2))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelRutas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNombres)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRutas)
                    .addComponent(jLabelNombres))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldArchivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCheck1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldArchivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCheck2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addGap(23, 23, 23))
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuta1ActionPerformed
    public Frame getFrame() {
        //tras muchos cabezazos de error para las ventanas, resulta que no se puede convertir de normal.this en una frame por hacerse en swing
        return (Frame) this.getOwner();
    }
private boolean checkDirectorio(String ruta) throws OperationNotSupportedException {
    //con el texto dado intenta crear un directorio, si no existe, mediante mkdirs, que devuelve true si logra crearlo y false si no
    File rutaSinArchivo = new File(ruta);

    if (!rutaSinArchivo.exists() || !rutaSinArchivo.isDirectory()) {
        if (!rutaSinArchivo.mkdirs()) {         //   throw new OperationNotSupportedException("No se pudo crear la carpeta en la ruta especificada.");
            aviso("No se pudo crear la carpeta en la ruta especificada.");


            return false;
        }
    }

    return true;
}

private void escribirEnArchivo(String nombre, String apellido1, String apellido2, String dni, int edad, String ruta, String nombreArchivo) {
    //probando a usar NIO y paths, junto las palabras a usar con el formato que se pide
    Path archivoPath = Paths.get(ruta, nombreArchivo + ".txt");

    List<String> lineas = Arrays.asList(apellido1 + ", " + apellido2 + ", " + nombre + ", " + dni + ", " + edad);

    try {
        Files.createDirectories(archivoPath.getParent());

        if (!Files.exists(archivoPath)) {
            Files.createFile(archivoPath);
            Files.write(archivoPath, lineas, Charset.forName("UTF-8"));
            aviso("Archivo creado con éxito.");
        } else {
            aviso("El archivo ya existe.");
        }

    } catch (IOException e) {
        e.printStackTrace();
        aviso("Error al escribir en el archivo.");
    }
}
    private void buttonCheckCreate(String ruta, String nombreArchivo){
            // TODO add your handling code here:
        //TODO añadir condicional de no encontrar archivo
        
        

        try {
            checkDirectorio(ruta);
        } catch (OperationNotSupportedException ex) {
            Logger.getLogger(ConcatenaArchivos.class.getName()).log(Level.SEVERE, null, ex);
            aviso(ex.getMessage());
        }
        File rutaSinArchivo = new File(ruta);
        if (rutaSinArchivo.exists() && rutaSinArchivo.isDirectory()) {
            
            String rutaCompleta = ruta + "\\" + nombreArchivo;
            File archivo = new File(rutaCompleta);
            if (archivo.exists() && archivo.isFile()) {
                    aviso("Se ha encontrado el archivo");
            }
        
            if((rutaSinArchivo.exists() && rutaSinArchivo.isDirectory())&&!archivo.exists() ){
                
                
                ConcatenaArchivosDatos datosDialog = new ConcatenaArchivosDatos(getFrame(), true);
                datosDialog.setVisible(true);

               if (datosDialog.getReturnStatus() == ConcatenaArchivosDatos.RET_OK) {
               // Obtener los datos de la ventana de datos
               String nombreA1 = datosDialog.getNombre();
               String apellido1A1 = datosDialog.getApellido1();
               String apellido2A1 = datosDialog.getApellido2();
               String dniA1 = datosDialog.getDni();
               int edadA1 = datosDialog.getEdad();
               
               escribirEnArchivo( nombreA1,  apellido1A1,  apellido2A1,  dniA1,  edadA1,  ruta, nombreArchivo);
               
                }
            }
    
    
    }}

        
    private void jButtonCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheck1ActionPerformed
        // TODO add your handling code here:
        //TODO añadir condicional de no encontrar archivo
        
        
        String ruta = jTextFieldRuta1.getText();
        String nombreArchivo = jTextFieldArchivo1.getText();
        buttonCheckCreate(ruta, nombreArchivo);
        
    }//GEN-LAST:event_jButtonCheck1ActionPerformed
    private void closeDialog(java.awt.event.WindowEvent evt) {                             
        doClose(RET_CANCEL);
    }     
    private void concatenar() throws OperationNotSupportedException {
        //obtenemos los datos de la interfaz(GUI)
        String ruta1 = jTextFieldRuta1.getText();
        String nombreArchivo1 = (jTextFieldArchivo1.getText()+".txt") ;
        String ruta2 = jTextFieldRuta2.getText();
        String nombreArchivo2 = (jTextFieldArchivo2.getText()+".txt") ;
        int espaciosEntreLineas = (int) jSpinner1.getValue();

        try {
            
            //compruebo que los archivos existen y si no, lanzo excepcion para que pete y obligue al usuario a crearlos
            File archivo1 = new File(ruta1, nombreArchivo1);
            File archivo2 = new File(ruta2, nombreArchivo2);

            if (!archivo1.exists()) {
            throw new OperationNotSupportedException("No se encuentra el archivo1. comprobar o crear con botón de check");
            }
            if (!archivo2.exists()) {
            throw new OperationNotSupportedException("No se encuentra el archivo2. comprobar o crear con botón de check");
            }

            //si no ha petado, se leen los archivos con bufferedReader, y se escriben con BufferedWriter,teniendo en cuenta la ruta escrita
            BufferedReader reader1 = new BufferedReader(new FileReader(archivo1));
            BufferedReader reader2 = new BufferedReader(new FileReader(archivo2));
            //ojo comprobamos si la ruta de salida se ha escrito o está el valor por defecto, en cuyo caso escribimos en la ruta del archivo java
            String rutaArchivoSalida = jTextFieldRuta3.getText();
            if (rutaArchivoSalida.equals("escribir ruta donde escribir nuevo archivo")) {
               rutaArchivoSalida = "resultado";
               }
            checkDirectorio(rutaArchivoSalida);
            File archivoSalida = new File(rutaArchivoSalida, "texto_unido.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));
            //lee lineas del archivo 1 y mientras haya lineas, (deberia ser solo 1) escribe en el nuevo archivo 
            String linea;
            while ((linea = reader1.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            //escribimos ahora lineas en blanco obtenidas del spinner en la GUI seguido del otro archivo
            for (int i = 0; i < espaciosEntreLineas; i++) {
                writer.newLine();
            }

            while ((linea = reader2.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            // chapar los streams
            reader1.close();
            reader2.close();
            writer.close();

            aviso("Texto unido correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
            aviso("Error al concatenar los archivos.Algo ha pasado.Compruebe los permisos de escritura y las rutas");
        }
    }
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       
        
        
        //intentamos concatenar y is no, mostramos la excepcion obtenida
        try {
            concatenar();
        } catch (OperationNotSupportedException ex) {
            System.err.print(ex);
            Logger.getLogger(ConcatenaArchivos.class.getName()).log(Level.SEVERE, null, ex);
            aviso(ex.getMessage());
        }
       // doClose(RET_OK);
        
        
        
        
        
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jTextFieldArchivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldArchivo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldArchivo2ActionPerformed

    private void jButtonCheck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheck2ActionPerformed
        // TODO add your handling code here:
        String ruta = jTextFieldRuta2.getText();
        String nombreArchivo = jTextFieldArchivo2.getText();
        buttonCheckCreate(ruta, nombreArchivo);
    }//GEN-LAST:event_jButtonCheck2ActionPerformed

    private void jTextFieldRuta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuta3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(ConcatenaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConcatenaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConcatenaArchivos dialog = new ConcatenaArchivos(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButtonCheck1;
    private javax.swing.JButton jButtonCheck2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelRutas;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextFieldArchivo1;
    private javax.swing.JTextField jTextFieldArchivo2;
    private javax.swing.JTextField jTextFieldRuta1;
    private javax.swing.JTextField jTextFieldRuta2;
    private javax.swing.JTextField jTextFieldRuta3;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
