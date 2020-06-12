/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_monicacastillo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monica
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreSerVivo = new javax.swing.JTextField();
        PoderSerVivo = new javax.swing.JFormattedTextField();
        AñosSerVivo = new javax.swing.JFormattedTextField();
        PlanetaSerVivo = new javax.swing.JTextField();
        RazaSerVivo = new javax.swing.JComboBox<>();
        AgregarSerVivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ModificarAtributo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSeresVivosModificar = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSeresVivosEliminar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        EliminarSerVivo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaArchivo = new javax.swing.JTextArea();
        CargarArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agregar Ser Vivo");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Poder:");

        jLabel4.setText("Años:");

        jLabel5.setText("Planeta:");

        jLabel6.setText("Raza:");

        PoderSerVivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        AñosSerVivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        RazaSerVivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));

        AgregarSerVivo.setText("Agregar Ser Vivo");
        AgregarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarSerVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PoderSerVivo)
                    .addComponent(AñosSerVivo)
                    .addComponent(PlanetaSerVivo)
                    .addComponent(RazaSerVivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreSerVivo))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 263, Short.MAX_VALUE)
                .addComponent(AgregarSerVivo)
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreSerVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PoderSerVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AñosSerVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PlanetaSerVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RazaSerVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarSerVivo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Ser Vivo", jPanel1);

        jLabel7.setText("Modificar Ser Vivo");

        ModificarAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Poder", "Años", "Planeta de procedencia", "Raza" }));
        ModificarAtributo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ModificarAtributoItemStateChanged(evt);
            }
        });

        TablaSeresVivosModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Poder", "Años", "Planeta ", "Raza"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaSeresVivosModificar);

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("* Seleccione una fila para poder modificar un atributo *");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(ModificarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(ModificarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Ser Vivo", jPanel2);

        TablaSeresVivosEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Poder", "Años", "Planeta", "Raza"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaSeresVivosEliminar);

        jLabel8.setText("Eliminar Ser Vivo");

        EliminarSerVivo.setText("Eliminar Ser Vivo");
        EliminarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarSerVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(EliminarSerVivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(EliminarSerVivo)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Eliminar Ser Vivo", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos", jPanel4);
        jTabbedPane1.addTab("Guardar Archivo", jTabbedPane3);

        TextAreaArchivo.setColumns(20);
        TextAreaArchivo.setRows(5);
        jScrollPane3.setViewportView(TextAreaArchivo);

        CargarArchivo.setText("Cargar Archivo");
        CargarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(CargarArchivo)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(CargarArchivo)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Abrir Archivo", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarArchivoMouseClicked
        // TODO add your handling code here:
        FileReader fr = null;
        BufferedReader br = null;
        TextAreaArchivo.setText("");
        try {
            JFileChooser filechooser = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            filechooser.setFileFilter(filtro);
            int seleccion = filechooser.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                selectedFile = filechooser.getSelectedFile();
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    TextAreaArchivo.append(linea);
                    TextAreaArchivo.append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CargarArchivoMouseClicked

    private void EliminarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarSerVivoMouseClicked
        // TODO add your handling code here:
        try {
            if (TablaSeresVivosEliminar.getSelectedRow() >= 0) {
                DefaultTableModel modelo = (DefaultTableModel) TablaSeresVivosEliminar.getModel();
                modelo.removeRow(TablaSeresVivosEliminar.getSelectedRow());
                TablaSeresVivosEliminar.setModel(modelo);
                TablaSeresVivosModificar.setModel(modelo);
            } // Fin If
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se guardaron los datos");
        } // Fin Try Catch
    }//GEN-LAST:event_EliminarSerVivoMouseClicked

    private void ModificarAtributoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModificarAtributoItemStateChanged
        // TODO add your handling code here:
        try {
            String nombre, planeta, raza;
            int poder, años;
            switch (ModificarAtributo.getSelectedIndex()) {
                case 0:
                    if (TablaSeresVivosModificar.getSelectedRow() >= 0) {
                        DefaultTableModel modelo = (DefaultTableModel) TablaSeresVivosModificar.getModel();
                        nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                        modelo.setValueAt(nombre, TablaSeresVivosModificar.getSelectedRow(), 0);
                        TablaSeresVivosModificar.setModel(modelo);
                        TablaSeresVivosEliminar.setModel(modelo);
                    } // Fin If
                    break;
                case 1:
                    if (TablaSeresVivosModificar.getSelectedRow() >= 0) {
                        DefaultTableModel modelo1 = (DefaultTableModel) TablaSeresVivosModificar.getModel();
                        poder = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo poder: "));
                        modelo1.setValueAt(poder, TablaSeresVivosModificar.getSelectedRow(), 1);
                        TablaSeresVivosModificar.setModel(modelo1);
                        TablaSeresVivosEliminar.setModel(modelo1);
                    } // Fin If
                    break;
                case 2:
                    if (TablaSeresVivosModificar.getSelectedRow() >= 0) {
                        DefaultTableModel modelo2 = (DefaultTableModel) TablaSeresVivosModificar.getModel();
                        años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los nuevos años: "));
                        modelo2.setValueAt(años, TablaSeresVivosModificar.getSelectedRow(), 2);
                        TablaSeresVivosModificar.setModel(modelo2);
                        TablaSeresVivosEliminar.setModel(modelo2);
                    } // Fin If
                    break;
                case 3:
                    if (TablaSeresVivosModificar.getSelectedRow() >= 0) {
                        DefaultTableModel modelo3 = (DefaultTableModel) TablaSeresVivosModificar.getModel();
                        planeta = JOptionPane.showInputDialog("Ingrese el nuevo planeta: ");
                        modelo3.setValueAt(planeta, TablaSeresVivosModificar.getSelectedRow(), 3);
                        TablaSeresVivosModificar.setModel(modelo3);
                        TablaSeresVivosEliminar.setModel(modelo3);
                    } // Fin If
                    break;
                case 4:
                    if (TablaSeresVivosModificar.getSelectedRow() >= 0) {
                        DefaultTableModel modelo4 = (DefaultTableModel) TablaSeresVivosModificar.getModel();
                        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Humano" + "\n" + "2. Amanto" + "\n" + "Ingrese la nueva raza: "));
                        switch (opcion) {
                            case 1:
                                raza = "Humano";
                                modelo4.setValueAt(raza, TablaSeresVivosModificar.getSelectedRow(), 4);
                                TablaSeresVivosModificar.setModel(modelo4);
                                TablaSeresVivosEliminar.setModel(modelo4);
                                break;
                            case 2:
                                raza = "Amanto";
                                modelo4.setValueAt(raza, TablaSeresVivosModificar.getSelectedRow(), 4);
                                TablaSeresVivosModificar.setModel(modelo4);
                                TablaSeresVivosEliminar.setModel(modelo4);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Opcion no valida");
                        } // Fin Switch
                    } // Fin If
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Ocurrio un error y no se pudo modificar");
            } // Fin Switch
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se guardaron los datos");
        } // Fin Try Catch
    }//GEN-LAST:event_ModificarAtributoItemStateChanged

    private void AgregarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarSerVivoMouseClicked
        // TODO add your handling code here:
        String nombre, planeta, raza;
        int poder, años;
        try {
            nombre = NombreSerVivo.getText();
            poder = Integer.parseInt(PoderSerVivo.getText());
            años = Integer.parseInt(AñosSerVivo.getText());
            planeta = PlanetaSerVivo.getText();
            raza = RazaSerVivo.getSelectedItem().toString();
            if (poder >= 1 && poder <= 10) {
                seresvivos.add(new SerVivo(nombre, poder, años, planeta, raza));
                Object[] newrow = {nombre, poder, años, planeta, raza};
                DefaultTableModel modelo = (DefaultTableModel) TablaSeresVivosEliminar.getModel();
                modelo.addRow(newrow);
                TablaSeresVivosEliminar.setModel(modelo);
                TablaSeresVivosModificar.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Ser vivo agregado exitosamente");
                NombreSerVivo.setText("");
                PoderSerVivo.setText("");
                AñosSerVivo.setText("");
                PlanetaSerVivo.setText("");
                RazaSerVivo.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "¡El poder debe ser de 1 a 10!");
                NombreSerVivo.setText("");
                PoderSerVivo.setText("");
                AñosSerVivo.setText("");
                PlanetaSerVivo.setText("");
                RazaSerVivo.setSelectedIndex(0);
            } // Fin If
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se guardaron los datos");
        } // Fin Try Catch
    }//GEN-LAST:event_AgregarSerVivoMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarSerVivo;
    private javax.swing.JFormattedTextField AñosSerVivo;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JButton EliminarSerVivo;
    private javax.swing.JComboBox<String> ModificarAtributo;
    private javax.swing.JTextField NombreSerVivo;
    private javax.swing.JTextField PlanetaSerVivo;
    private javax.swing.JFormattedTextField PoderSerVivo;
    private javax.swing.JComboBox<String> RazaSerVivo;
    private javax.swing.JTable TablaSeresVivosEliminar;
    private javax.swing.JTable TablaSeresVivosModificar;
    private javax.swing.JTextArea TextAreaArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
static ArrayList<SerVivo> seresvivos = new ArrayList();
    File selectedFile = null;
}
