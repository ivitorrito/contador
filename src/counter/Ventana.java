package counter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import org.snmp4j.smi.OID;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import java.util.Properties;

public class Ventana extends javax.swing.JFrame {

    private ImageIcon imageicon;
    private TrayIcon trayicon;
    SystemTray systemtray;
    

    public void  Ventana() {

        imageicon = new ImageIcon(this.getClass().getResource("/images/logo.png"));
        initComponents();
        this.setIconImage(imageicon.getImage());
        instanciarTray();
      
         
        try {
            if (SystemTray.isSupported()) {
                systemtray.add(trayicon);
                this.setVisible(false);
                Fecha.setText("" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
            }
        } catch (Exception es) {
            JOptionPane.showMessageDialog(this, es.getMessage());
        }

      coje();

    }

    private void instanciarTray() {

        trayicon = new TrayIcon(imageicon.getImage(), "Copiadoras Costaluz", popup);
        trayicon.setImageAutoSize(true);
        systemtray = SystemTray.getSystemTray();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new java.awt.PopupMenu();
        Configuracion = new java.awt.MenuItem();
        Salir = new java.awt.MenuItem();
        Ip1 = new javax.swing.JTextField();
        Ip2 = new javax.swing.JTextField();
        Ip3 = new javax.swing.JTextField();
        Ip4 = new javax.swing.JTextField();
        Ip5 = new javax.swing.JTextField();
        Ip6 = new javax.swing.JTextField();
        Ip7 = new javax.swing.JTextField();
        Ip9 = new javax.swing.JTextField();
        Ip10 = new javax.swing.JTextField();
        Ip11 = new javax.swing.JTextField();
        Ip12 = new javax.swing.JTextField();
        Ip13 = new javax.swing.JTextField();
        Ip14 = new javax.swing.JTextField();
        Ip15 = new javax.swing.JTextField();
        Ip8 = new javax.swing.JTextField();
        Ip16 = new javax.swing.JTextField();
        Mail = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mensaje = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        cerrar = new java.awt.Button();
        Fecha = new javax.swing.JTextField();

        popup.setLabel("popupMenu1");

        Configuracion.setLabel("Configuracion");
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });
        popup.add(Configuracion);

        Salir.setLabel("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        popup.add(Salir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Copiadoras Costaluz");
        setUndecorated(true);

        Ip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ip1ActionPerformed(evt);
            }
        });

        Ip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ip2ActionPerformed(evt);
            }
        });

        Ip4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ip4ActionPerformed(evt);
            }
        });

        Ip5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ip5ActionPerformed(evt);
            }
        });

        Ip6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ip6ActionPerformed(evt);
            }
        });

        boton.setText("Guardar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("IP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Email");

        Mensaje.setColumns(20);
        Mensaje.setRows(5);
        jScrollPane2.setViewportView(Mensaje);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cliente");

        cerrar.setActionCommand("cerrar");
        cerrar.setLabel("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(78, 78, 78)
                                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ip8)
                                            .addComponent(Ip1)
                                            .addComponent(Ip2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(Ip3)
                                            .addComponent(Ip4)
                                            .addComponent(Ip5)
                                            .addComponent(Ip6)
                                            .addComponent(Ip7))
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ip9)
                                            .addComponent(Ip10)
                                            .addComponent(Ip11)
                                            .addComponent(Ip12)
                                            .addComponent(Ip13)
                                            .addComponent(Ip14, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(Ip15)
                                            .addComponent(Ip16))))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(176, 176, 176))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)))
                                .addComponent(boton)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ip8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ip16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(boton))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        Ejecutar();
        GuardarPropiedades();
        Enviar();
        systemtray.remove(trayicon);
        this.setVisible(false);

    }



    public void coje() {
        Properties p = new Properties();

        try {
            p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("contadores.properties"));
            Ip1.setText(p.getProperty("uno"));
            Ip2.setText(p.getProperty("dos"));
            Ip3.setText(p.getProperty("tres"));
            Ip4.setText(p.getProperty("cuatro"));
            Ip5.setText(p.getProperty("cinco"));
            Ip6.setText(p.getProperty("seis"));
            Ip7.setText(p.getProperty("siete"));
            Ip8.setText(p.getProperty("ocho"));
            Ip9.setText(p.getProperty("nueve"));
            Ip10.setText(p.getProperty("diez"));
            Ip11.setText(p.getProperty("once"));
            Ip12.setText(p.getProperty("doce"));
            Ip13.setText(p.getProperty("trece"));
            Ip14.setText(p.getProperty("catorce"));
            Ip15.setText(p.getProperty("quince"));
            Ip16.setText(p.getProperty("dieciseis"));
            Mail.setText(p.getProperty("mail"));
            Cliente.setText(p.getProperty("cliente"));
             System.out.println("Entra en coje");

        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void GuardarPropiedades() {
        Properties p = new Properties();
        try {
            p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("contadores.properties"));
            p.setProperty("uno", Ip1.getText());
            p.setProperty("dos", Ip2.getText());
            p.setProperty("tres", Ip3.getText());
            p.setProperty("cuatro", Ip4.getText());
            p.setProperty("cinco", Ip5.getText());
            p.setProperty("seis", Ip6.getText());
            p.setProperty("siete", Ip7.getText());
            p.setProperty("ocho", Ip8.getText());
            p.setProperty("nueve", Ip9.getText());
            p.setProperty("diez", Ip10.getText());
            p.setProperty("once", Ip11.getText());
            p.setProperty("doce", Ip12.getText());
            p.setProperty("trece", Ip13.getText());
            p.setProperty("catorce", Ip14.getText());
            p.setProperty("quince", Ip15.getText());
            p.setProperty("dieciseis", Ip16.getText());
            p.setProperty("mail", Mail.getText());
            p.setProperty("cliente", Cliente.getText());
            System.out.println("Entra en GuardarPropiedades");

        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       try {
         p.store(new BufferedWriter(new FileWriter("src\\contadores.properties")), "Valores");
            System.out.println("crea el archivo GuardarPropiedades");
        } catch (IOException ex) {
            System.out.println("Error: No se ha podido crear el archivo de propiedades");
        }

    }

    public void Enviar() {
        Mail e = new Mail();
        String copia = Mensaje.getText();
        String eMail = Mail.getText();
        String st = "Mensaje Enviado a Copiadoras Costaluz" + "\n" + "Muchas Gracias";
        try {
            e.enviar(eMail, Cliente.getText(), copia);
            JOptionPane.showMessageDialog(null, st,
                    "MENSAJE ENVIADO!!", JOptionPane.INFORMATION_MESSAGE);

        } catch (MessagingException es) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, es);
            JOptionPane.showMessageDialog(null, "ooo",
                    "MENSAJE  no ENVIADO!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void Ejecutar() {
        String ip1 = Ip1.getText();
      //  String ip2 = Ip2.getText();
     //   String ip3 = Ip3.getText();
     //   String ip4 = Ip4.getText();
    //    String ip5 = Ip5.getText();
    //    String ip6 = Ip6.getText();
     //   String ip7 = Ip7.getText();
     //   String ip8 = Ip8.getText();
     //   String ip9 = Ip9.getText();
   //     String ip10 = Ip10.getText();
    //    String ip11 = Ip11.getText();
       // String ip12 = Ip12.getText();
       // String ip13 = Ip13.getText();
      //  String ip15 = Ip15.getText();
     //   String ip16 = Ip16.getText();

        ArrayList<String> IpEs = new ArrayList<>();
        IpEs.add(ip1);
       // IpEs.add(ip2);
       // IpEs.add(ip3);
       // IpEs.add(ip4);
      //  IpEs.add(ip5);
     //   IpEs.add(ip6);
     //   IpEs.add(ip7);
     //   IpEs.add(ip8);
     //   IpEs.add(ip9);
      //  IpEs.add(ip10);
      //  IpEs.add(ip11);
     //   IpEs.add(ip12);
     //   IpEs.add(ip13);
     //   IpEs.add(ip14);
     //   IpEs.add(ip15);
    //    IpEs.add(ip16);

        for (int i = 1; i <= 17; i++) {
        }
        Iterator<String> nombreIterator = IpEs.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();

            SnmpConector client = new SnmpConector("udp:" + elemento + "/161");

            try {
                client.start();
            } catch (IOException ex) {
                Logger.getLogger(SnmpConector.class.getName()).log(Level.SEVERE, null, ex);
            }

            String ODIValue3 = client.getAsString(new OID(client.Oid3));
            String ODIValue = client.getAsString(new OID(client.Oid));
            String ODIValue2 = client.getAsString(new OID(client.Ricoh));
            String ODIValue4 = client.getAsString(new OID(client.color));
            String ODIValue5 = client.getAsString(new OID(client.colorP));
            String ODIValue6 = client.getAsString(new OID(client.negro));
            String ODIValue7 = client.getAsString(new OID(client.negroP));
            String copi = ("\n" + "Modelo ---" + ODIValue + "\n" + "Total ---" + ODIValue2
                    + "\n" + "Nº Serie ---" + ODIValue3 + "\n" + "Color ---" + ODIValue4
                    + "\n" + "ColorP ---" + ODIValue5 + "\n" + "Negro ---" + ODIValue6 + "\n" + "NegroP ---" + ODIValue7 + "\n" + "\n");

            //  for (int i = 0; i <= 0; i++) {
            Mensaje.append(copi);

            //  }
        }

    }//GEN-LAST:event_botonActionPerformed


    private void Ip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ip2ActionPerformed

    private void Ip4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ip4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ip4ActionPerformed

    private void Ip5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ip5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ip5ActionPerformed

    private void Ip6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ip6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ip6ActionPerformed

    private void Ip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ip1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ip1ActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed

        systemtray.remove(trayicon);
        this.setVisible(true);


    }//GEN-LAST:event_ConfiguracionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        try {
            if (SystemTray.isSupported()) {
                systemtray.add(trayicon);
                this.setVisible(false);

            }
        } catch (Exception es) {
            JOptionPane.showMessageDialog(this, es.getMessage());
        }


    }//GEN-LAST:event_cerrarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventana().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Cliente;
    private java.awt.MenuItem Configuracion;
    public javax.swing.JTextField Fecha;
    public javax.swing.JTextField Ip1;
    public javax.swing.JTextField Ip10;
    public javax.swing.JTextField Ip11;
    public javax.swing.JTextField Ip12;
    public javax.swing.JTextField Ip13;
    public javax.swing.JTextField Ip14;
    public javax.swing.JTextField Ip15;
    public javax.swing.JTextField Ip16;
    public javax.swing.JTextField Ip2;
    public javax.swing.JTextField Ip3;
    public javax.swing.JTextField Ip4;
    public javax.swing.JTextField Ip5;
    public javax.swing.JTextField Ip6;
    public javax.swing.JTextField Ip7;
    public javax.swing.JTextField Ip8;
    public javax.swing.JTextField Ip9;
    public javax.swing.JTextField Mail;
    public javax.swing.JTextArea Mensaje;
    private java.awt.MenuItem Salir;
    private javax.swing.JButton boton;
    private java.awt.Button cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.PopupMenu popup;
    // End of variables declaration//GEN-END:variables
}
