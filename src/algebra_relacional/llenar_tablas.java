package algebra_relacional;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class llenar_tablas extends javax.swing.JFrame {

    public llenar_tablas() {
        initComponents();
        int val = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas propiedades tiene la tabla?"));
        String[] titulos = new String[val];
        for(int i=0;i<val;i++){
            titulos[i] = JOptionPane.showInputDialog("Coloca la propiedad #"+(i+1));
        }
        DefaultTableModel model = (DefaultTableModel)jtableexportar.getModel();
        model.setColumnIdentifiers(titulos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableexportar = new javax.swing.JTable();
        jbtnguardar = new javax.swing.JButton();
        jbtnaddfila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtableexportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""}
            },
            new String [] {
                "obj", "obj", "obj", "obj"
            }
        ));
        jScrollPane1.setViewportView(jtableexportar);

        jbtnguardar.setText("Guardar datos");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jbtnaddfila.setText("Añadir fila");
        jbtnaddfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddfilaActionPerformed(evt);
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
                        .addComponent(jbtnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnaddfila))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnguardar)
                    .addComponent(jbtnaddfila))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        String nombre = JOptionPane.showInputDialog("Coloca el nombre de la tabla a guardar");
        String filePath = ("E:\\"+nombre+".txt");
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int j=0;j<jtableexportar.getColumnCount();j++){
                    bw.write(jtableexportar.getColumnName(j)+"*");
            }
            bw.newLine();
            for(int i=0;i<jtableexportar.getRowCount();i++){
                for(int j=0;j<jtableexportar.getColumnCount();j++){
                    bw.write(jtableexportar.getValueAt(i,j).toString()+"/");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(llenar_tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Informacion guardada con exito");
        this.setVisible(false);
        principal principal = new principal();
        principal.setVisible(true);
    }//GEN-LAST:event_jbtnguardarActionPerformed
        
    private void jbtnaddfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddfilaActionPerformed
        DefaultTableModel model = (DefaultTableModel)jtableexportar.getModel();
        model.addRow(new Object[]{null});
    }//GEN-LAST:event_jbtnaddfilaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnaddfila;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JTable jtableexportar;
    // End of variables declaration//GEN-END:variables
}
