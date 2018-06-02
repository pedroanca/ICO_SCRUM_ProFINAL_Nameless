/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author Crack-ALS
 */
public class Teoria_Ing_Software extends javax.swing.JFrame {
    private String  concepto_1 =   "¿Qué es IS?\n" +
"\n" +
"    La ingeniería de software es la aplicación de un enfoque sistemático, \n"
    + " disciplinado y cuantificable al desarrollo,\n"
    + " operación y mantenimiento de software,\n" +
"    y el estudio de estos enfoques, es decir,\n"
    + " el estudio de las aplicaciones de la ingeniería al software. \n "
    + "Integra matemáticas, ciencias de la computación y prácticas \n" +
    "cuyos orígenes se encuentran en la ingeniería.";
    
    private String procesos = "    Procesos de desarrollo\n" +
"\n" +
"    • El procedimiento es una receta para lograr el cometido.\n" +
"    • Establece las actividades principales.\n" +
"    • Cada actividad tiene criterios de entrada y salida.\n" +
"    • Utiliza recursos y esta sujeto a una serie de restricciones\n";
    
    private String PsP  =   "PSP, Personal Software Proccess.\n" +
"\n" +
"El Proceso Software Personal (En Inglés, Personal Software Process o PSP) \n"
 + " es un proceso individual cuyo objetivo es ayudar a los ingenieros \n"
 + " en software a medir y mejorar su productividad personal.\n" +
"El PSP suele enseñarse exclusivamente a profesionales, \n "
 + "no obstante éste ha comenzado a incluirse como parte de cursos universitarios.\n" +
"Los pasos de registro de información a detalle en el nivel de medición pueden resultar frustrantes cuando se tiene presión de tiempo. ";
    
    private String TsP  =   "El TSP \n"+
            " Es una metodología para dirigir el trabajo de mejora y desarrollo de software además de establecer \n"
            + " un entorno donde el trabajo efectivo de equipo sea normal y natural.\n" +
"Objetivos del TSP\n" +
"\n" +
"Generar un marco basado en PSP Desarrollar productos en varios ciclos Establecer estándares \n"
+ " para medir la calidad y el comportamiento Proporcionar métricas \n"
+ " para equipos Evaluar roles y equipos Guías para solución de problemas en equipos.";

private String Rup  =   "El RUP \n"
        +"Es un proceso de ingeniería del software que agrupa las 6 mejores prácticas \n"
    + " de desarrollo software que existen en el mercado\n" + 
"Desarrollar Iterativamente Gestionar Requisitos Usar Arquitecturas de Componentes Modelar Visualmente (UML) \n "
 + "Continuamente Verificar Calidad del Software Controlar Cambios en el Software ";    

    /**
     * Creates new form Teoria_Ing_Software
     */
    public Teoria_Ing_Software() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        link_1 = new javax.swing.JButton();
        BtnLink1 = new javax.swing.JButton();
        BtnLink2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo_1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInfo_2 = new javax.swing.JTextArea();
        jButtonInfo_1 = new javax.swing.JButton();
        jButtonInfo_2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaRup = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaProcesos = new javax.swing.JTextArea();
        jButtonSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(230, 249, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton3.setText("Desarrolladores");

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton1.setText("Teoría básica de ingeniería de software");

        link_1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        link_1.setText("Inicio ");
        link_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                link_1MouseClicked(evt);
            }
        });

        BtnLink1.setBackground(new java.awt.Color(153, 153, 255));
        BtnLink1.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        BtnLink1.setText("Más acerca de herramientas");
        BtnLink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLink1ActionPerformed(evt);
            }
        });

        BtnLink2.setBackground(new java.awt.Color(153, 153, 255));
        BtnLink2.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        BtnLink2.setText("Procesos Ing. Software");
        BtnLink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLink2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-enlace-externo-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(link_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLink1)
                .addGap(18, 18, 18)
                .addComponent(BtnLink2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1)
                        .addComponent(link_1)
                        .addComponent(BtnLink1)
                        .addComponent(BtnLink2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTextAreaInfo_1.setBackground(new java.awt.Color(224, 224, 224));
        jTextAreaInfo_1.setColumns(20);
        jTextAreaInfo_1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextAreaInfo_1.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfo_1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cubo.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/trabajo en equipo.jpg"))); // NOI18N

        jTextAreaInfo_2.setBackground(new java.awt.Color(224, 224, 224));
        jTextAreaInfo_2.setColumns(20);
        jTextAreaInfo_2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextAreaInfo_2.setRows(5);
        jScrollPane2.setViewportView(jTextAreaInfo_2);

        jButtonInfo_1.setText("INFO");
        jButtonInfo_1.setToolTipText("Presiones para obtener información");
        jButtonInfo_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfo_1ActionPerformed(evt);
            }
        });

        jButtonInfo_2.setText("INFO");
        jButtonInfo_2.setToolTipText("Preciones para obtener información");
        jButtonInfo_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfo_2ActionPerformed(evt);
            }
        });

        jTextAreaRup.setBackground(new java.awt.Color(224, 224, 224));
        jTextAreaRup.setColumns(20);
        jTextAreaRup.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextAreaRup.setRows(5);
        jScrollPane3.setViewportView(jTextAreaRup);

        jTextAreaProcesos.setBackground(new java.awt.Color(224, 224, 224));
        jTextAreaProcesos.setColumns(20);
        jTextAreaProcesos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextAreaProcesos.setRows(5);
        jScrollPane4.setViewportView(jTextAreaProcesos);

        jButtonSalida.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-salida-32.png"))); // NOI18N
        jButtonSalida.setText("Salida");
        jButtonSalida.setToolTipText("Boton de salida");
        jButtonSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        jButtonSalida.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jButtonInfo_1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInfo_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonSalida)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInfo_1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonInfo_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalida)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void link_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link_1MouseClicked
        // TODO add your handling code here:
        Inicial VentanaInicial = new Inicial();
        VentanaInicial.setVisible(true);
    }//GEN-LAST:event_link_1MouseClicked

    private void BtnLink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLink1ActionPerformed
        // TODO add your handling code here:
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri=new java.net.URI("https://okhosting.com/blog/herramientas-de-desarrollo-de-software/");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                }

            }
        }
    }//GEN-LAST:event_BtnLink1ActionPerformed

    private void BtnLink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLink2ActionPerformed
        // TODO add your handling code here:
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri=new java.net.URI("https://sg.com.mx/revista/1/procesos-software");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                }

            }
        }
    }//GEN-LAST:event_BtnLink2ActionPerformed

    private void jButtonInfo_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfo_2ActionPerformed
         jTextAreaInfo_2.setText(TsP);
         jTextAreaInfo_2.setEditable(false);
         
         jTextAreaRup.setText(Rup + "\n" + "\n" + PsP);
         jTextAreaRup.setEditable(false);
    }//GEN-LAST:event_jButtonInfo_2ActionPerformed

    private void jButtonInfo_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfo_1ActionPerformed
        jTextAreaInfo_1.setText(concepto_1);
        jTextAreaInfo_1.setEditable(false);
        
        jTextAreaProcesos.setText(procesos);
        jTextAreaProcesos.setEditable(false);

    }//GEN-LAST:event_jButtonInfo_1ActionPerformed

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed

        int salida = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir del programa?", "Salida", JOptionPane.OK_OPTION);
        if (JOptionPane.OK_OPTION == salida) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(Teoria_Ing_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teoria_Ing_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teoria_Ing_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teoria_Ing_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teoria_Ing_Software().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLink1;
    private javax.swing.JButton BtnLink2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonInfo_1;
    private javax.swing.JButton jButtonInfo_2;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaInfo_1;
    private javax.swing.JTextArea jTextAreaInfo_2;
    private javax.swing.JTextArea jTextAreaProcesos;
    private javax.swing.JTextArea jTextAreaRup;
    private javax.swing.JButton link_1;
    // End of variables declaration//GEN-END:variables
}
