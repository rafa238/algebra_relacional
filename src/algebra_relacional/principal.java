package algebra_relacional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Algebra relacional");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableprincipal = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnDiferencia = new javax.swing.JButton();
        btnInterseccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear Relaciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Precargar Relaciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Observar Relaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Proyeccion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jtableprincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtableprincipal.setEnabled(false);
        jScrollPane1.setViewportView(jtableprincipal);

        jButton5.setText("Seleccion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Producto Cruz");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Union");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnDiferencia.setText("Diferencia");
        btnDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiferenciaActionPerformed(evt);
            }
        });

        btnInterseccion.setText("Interseccion");
        btnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterseccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDiferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInterseccion))
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(btnDiferencia)
                    .addComponent(btnInterseccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void guardar_datos(String nombre1,String nombre2,int sel){
        String filePath = null;
        switch(sel){
            case 1://Proyeccion
                filePath = (nombre1+"proyeccion"+nombre2+".txt");
                break;
            case 2://Seleccion
                filePath = (nombre1+"seleccion"+nombre2+".txt");
                break;
            case 3://Producto cruz
                filePath = (nombre1+"productocruz"+nombre2+".txt");
                break;
            case 4://Union
                filePath = (nombre1+"union"+nombre2+".txt");
                break;
            case 5://Diferencia
                filePath = (nombre1+"diferencia"+nombre2+".txt");
                break;
            case 6://Interseccion
                filePath = (nombre1+"interseccion"+nombre2+".txt");
                break;
        }
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int j=0;j<jtableprincipal.getColumnCount();j++){
                    bw.write(jtableprincipal.getColumnName(j)+"*");
            }
            bw.newLine();
            for(int i=0;i<jtableprincipal.getRowCount();i++){
                for(int j=0;j<jtableprincipal.getColumnCount();j++){
                    bw.write(jtableprincipal.getValueAt(i,j).toString()+"/");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(llenar_tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Informacion guardada con exito con el nombre: "+filePath);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        llenar_tablas crear = new llenar_tablas();
        crear.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        mostrar_tablas mostrar = new mostrar_tablas();
        mostrar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File file1 = new File("Doc1.txt");
        File file2 = new File("Doc2.txt");
        File file3 = new File("Doc3.txt");
        try {
            if(!file1.exists()){
                FileWriter fw1 = new FileWriter(file1);
                FileWriter fw2 = new FileWriter(file2);
                FileWriter fw3 = new FileWriter(file3);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                BufferedWriter bw3 = new BufferedWriter(fw3);

                //Tabla 1
                bw1.write("Id*Nombre*Apellido*Edad*");
                bw1.newLine();
                bw1.write("1/Jose/Ramirez/16/");
                bw1.newLine();
                bw1.write("2/Diego/Sanchez/19/");
                bw1.newLine();
                bw1.write("3/Ramon/Lopez/22/");
                bw1.newLine();
                bw1.write("4/Andres/Zepeda/26/");
                bw1.newLine();
                bw1.close();
                fw1.close();

                //Tabla 2
                bw2.write("Id*Stock*Precio*");
                bw2.newLine();
                bw2.write("1/900/150/");
                bw2.newLine();
                bw2.write("2/300/499/");
                bw2.newLine();
                bw2.write("3/500/49/");
                bw2.newLine();
                bw2.write("4/100/1300/");
                bw2.newLine();
                bw2.close();
                fw2.close();

                //Tabla 3
                bw3.write("Id*Nombre*Ocupacion*Edad*");
                bw3.newLine();
                bw3.write("1/Romula/Diaz/Obrero/34/");
                bw3.newLine();
                bw3.write("2/Jose/Guzman/Doctor/43/");
                bw3.newLine();
                bw3.write("3/Ricardo/Martinez/Arquitecto/22/");
                bw3.newLine();
                bw3.write("4/Luis/Hernandez/Estudiante/16/");
                bw3.newLine();
                bw3.close();
                fw3.close();
            }
            JOptionPane.showMessageDialog(null, "Informacion guardada con exito \nSe crearon 3 tablas con nombres Doc1,Doc2 y Doc3");
        } catch (IOException ex) {
            Logger.getLogger(llenar_tablas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String FilePathSearch = JOptionPane.showInputDialog("Coloca el nombre del archivo a buscar");
        File file = new File(FilePathSearch+".txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object [] propiedades = br.lines().toArray();
            String[] lista = propiedades[0].toString().split("\\*");//0,1,2,...,n-1
            int opcion=JOptionPane.showOptionDialog(null, "Elige que atributo deseas proyectar", "Atributos",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
	                null, lista, lista[0]);
            String[] seleccion = {lista[opcion]};
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnIdentifiers(seleccion);
            for(int i=0;i<propiedades.length-1;i++){
                String[] datos = propiedades[i+1].toString().split("/");
                String[] entrar = {datos[opcion]};
                tm.addRow(entrar);
            }
            jtableprincipal.setModel(tm);
            //guardamos los resultados
            guardar_datos(FilePathSearch,lista[opcion],1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String FilePathSearch = JOptionPane.showInputDialog("Coloca el nombre del archivo a buscar");
        File file = new File(FilePathSearch+".txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object [] propiedades = br.lines().toArray();
            String[] lista = propiedades[0].toString().split("\\*");//0,1,2,...,n-1
            String[] operadores = {"=","!=",">",">=","<","<="};
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnIdentifiers(lista);
            jtableprincipal.setModel(tm);
            int opcion=JOptionPane.showOptionDialog(null, "Elige que atributo deseas seleccionar", "Atributos",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
	                null, lista, lista[0]);
            int operador=JOptionPane.showOptionDialog(null, "Elige que condicion usaras", "Condicion",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
	                null, operadores, operadores[0]);
            String mod=JOptionPane.showInputDialog(null,"Coloca el dato a comparar");
            switch(operador){
                case 0:
                    for(int i=0;i<propiedades.length-1;i++){
                        String[] datos = propiedades[i+1].toString().split("/");
                        if(datos[opcion].equalsIgnoreCase(mod)){
                            tm.addRow(datos);
                        }
                    }
                break;
                case 1:
                    for(int i=0;i<propiedades.length-1;i++){
                        String[] datos = propiedades[i+1].toString().split("/");
                        if(!datos[opcion].equalsIgnoreCase(mod)){
                            tm.addRow(datos);
                        }
                    }
                break;
                case 2:
                    for(int i=0;i<propiedades.length-1;i++){
                        String[] datos = propiedades[i+1].toString().split("/");
                        if(Integer.parseInt(datos[opcion])>Integer.parseInt(mod)){
                            tm.addRow(datos);
                        }
                    }
                break;
                case 3:
                    for(int i=0;i<propiedades.length-1;i++){
                        String[] datos = propiedades[i+1].toString().split("/");
                        if(Integer.parseInt(datos[opcion])>=Integer.parseInt(mod)){
                            tm.addRow(datos);
                        }
                    }
                break;
                case 4:
                    for(int i=0;i<propiedades.length-1;i++){
                        String[] datos = propiedades[i+1].toString().split("/");
                        if(Integer.parseInt(datos[opcion])<Integer.parseInt(mod)){
                            tm.addRow(datos);
                        }
                    }
                break;
                case 5:
                    for(int i=0;i<propiedades.length-1;i++){
                        String[] datos = propiedades[i+1].toString().split("/");
                        if(Integer.parseInt(datos[opcion])<=Integer.parseInt(mod)){
                            tm.addRow(datos);
                        }
                    }
                break;
            }
            //guardamos resultados
            guardar_datos(FilePathSearch,lista[opcion],2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String FilePathSearch1 = JOptionPane.showInputDialog("Coloca el nombre del primer archivo a buscar");
        File file1 = new File(FilePathSearch1+".txt");
        String FilePathSearch2 = JOptionPane.showInputDialog("Coloca el nombre del segundo archivo a buscar");
        File file2 = new File(FilePathSearch2+".txt");
        try {
            FileReader fr1 = new FileReader(file1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            Object [] propiedades1 = br1.lines().toArray();
            Object [] propiedades2 = br2.lines().toArray();
            String[] lista1 = propiedades1[0].toString().split("\\*");//0,1,2,...,n-1
            String[] lista2 = propiedades2[0].toString().split("\\*");//0,1,2,...,n-1
            String[] cabeceras =  Stream.of(lista1, lista2).flatMap(Stream::of).toArray(String[]::new);
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnIdentifiers(cabeceras);
            jtableprincipal.setModel(tm);
            for(int i=0;i<propiedades1.length-1;i++){
                String[] dato1 = propiedades1[i+1].toString().split("/");
                for(int j=0;j<propiedades2.length-1;j++){
                    String[] dato2 = propiedades2[j+1].toString().split("/");
                    String[] datos = Stream.of(dato1, dato2).flatMap(Stream::of).toArray(String[]::new);
                    tm.addRow(datos);
                }
            }
            //guardamos resultado
            guardar_datos(FilePathSearch1,FilePathSearch2,3);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String FilePathSearch1 = JOptionPane.showInputDialog("Coloca el nombre del primer archivo a buscar");
        File file1 = new File(FilePathSearch1+".txt");
        String FilePathSearch2 = JOptionPane.showInputDialog("Coloca el nombre del segundo archivo a buscar");
        File file2 = new File(FilePathSearch2+".txt");
        try {
            FileReader fr1 = new FileReader(file1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            Object [] propiedades1 = br1.lines().toArray();
            Object [] propiedades2 = br2.lines().toArray();
            String[] lista1 = propiedades1[0].toString().split("\\*");//0,1,2,...,n-1
            String[] lista2 = propiedades2[0].toString().split("\\*");//0,1,2,...,n-1
            int err=0;
            if(lista1.length==lista2.length){
                //comprobamos que ambas tablas tengan los mismos campos
                for(int i=0;i<lista1.length;i++){
                    if(!lista1[i].equals(lista2[i])){
                        JOptionPane.showMessageDialog(null, "Los documentos no cumplen el principio de compatibilidad", "ERROR", JOptionPane.ERROR_MESSAGE);
                        err=1;
                        break;
                    }
                }
                if(err==0){
                    DefaultTableModel tm = new DefaultTableModel();
                    tm.setColumnIdentifiers(lista1);
                    
                    Set<ArrayList<String>> tabla1 = new HashSet<>();
                    
                    for(int i=1; i < propiedades1.length; i++){
                        String[] datos = propiedades1[i].toString().split("/");
                        ArrayList<String> datosLista  = new ArrayList<>(Arrays.asList(datos));
                        tabla1.add(datosLista);
                    }
                    for(int i=1; i < propiedades2.length; i++){
                        String[] datos = propiedades2[i].toString().split("/");
                        ArrayList<String> datosLista  = new ArrayList<>(Arrays.asList(datos));
                        tabla1.add(datosLista);
                    }
                    System.out.println(tabla1);
                    tabla1.forEach(datos -> {
                        tm.addRow(datos.toArray());
                    });
                    jtableprincipal.setModel(tm);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Los documentos no cumplen el principio de compatibilidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            //guardamos los datos
            guardar_datos(FilePathSearch1,FilePathSearch2,4);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiferenciaActionPerformed
        String FilePathSearch1 = JOptionPane.showInputDialog("Coloca el nombre del primer archivo a buscar");
        File file1 = new File(FilePathSearch1+".txt");
        String FilePathSearch2 = JOptionPane.showInputDialog("Coloca el nombre del segundo archivo a buscar");
        File file2 = new File(FilePathSearch2+".txt");
        try {
            FileReader fr1 = new FileReader(file1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            Object [] propiedades1 = br1.lines().toArray();
            Object [] propiedades2 = br2.lines().toArray();
            String[] lista1 = propiedades1[0].toString().split("\\*");//0,1,2,...,n-1
            String[] lista2 = propiedades2[0].toString().split("\\*");//0,1,2,...,n-1
            int err=0;
            if(lista1.length==lista2.length){
                //comprobamos que ambas tablas tengan los mismos campos
                for(int i=0;i<lista1.length;i++){
                    if(!lista1[i].equals(lista2[i])){
                        JOptionPane.showMessageDialog(null, "Los documentos no cumplen el principio de compatibilidad", "ERROR", JOptionPane.ERROR_MESSAGE);
                        err=1;
                        break;
                    }
                }
                if(err==0){
                    DefaultTableModel tm = new DefaultTableModel();
                    tm.setColumnIdentifiers(lista1);
                    
                    Set<ArrayList<String>> resultado = new HashSet<>();
                    
                    for(int i=1; i < propiedades1.length; i++){
                        String[] datos = propiedades1[i].toString().split("/");
                        ArrayList<String> datosLista  = new ArrayList<>(Arrays.asList(datos));
                        resultado.add(datosLista);
                    }
                    for(int i=1; i < propiedades2.length; i++){
                        String[] datos = propiedades2[i].toString().split("/");
                        ArrayList<String> datosLista  = new ArrayList<>(Arrays.asList(datos));
                        
                        resultado.remove(datosLista);
                    }
                    System.out.println(resultado);
                    resultado.forEach(datos -> {
                        tm.addRow(datos.toArray());
                    });
                    jtableprincipal.setModel(tm);
                }
                //guardamos el resultado
                guardar_datos(FilePathSearch1,FilePathSearch2,5);
            } else {
                JOptionPane.showMessageDialog(null, "Los documentos no cumplen el principio de compatibilidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDiferenciaActionPerformed

    private void btnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterseccionActionPerformed
        String FilePathSearch1 = JOptionPane.showInputDialog("Coloca el nombre del primer archivo a buscar");
        File file1 = new File(FilePathSearch1+".txt");
        String FilePathSearch2 = JOptionPane.showInputDialog("Coloca el nombre del segundo archivo a buscar");
        File file2 = new File(FilePathSearch2+".txt");
        try {
            FileReader fr1 = new FileReader(file1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            Object [] propiedades1 = br1.lines().toArray();
            Object [] propiedades2 = br2.lines().toArray();
            String[] lista1 = propiedades1[0].toString().split("\\*");//0,1,2,...,n-1
            String[] lista2 = propiedades2[0].toString().split("\\*");//0,1,2,...,n-1
            int err=0;
            if(lista1.length == lista2.length){
                //comprobamos que ambas tablas tengan los mismos campos
                for(int i=0;i<lista1.length;i++){
                    if(!lista1[i].equals(lista2[i])){
                        JOptionPane.showMessageDialog(null, "Los documentos no cumplen el principio de compatibilidad", "ERROR", JOptionPane.ERROR_MESSAGE);
                        err=1;
                        break;
                    }
                }
                if(err==0){
                    DefaultTableModel tm = new DefaultTableModel();
                    tm.setColumnIdentifiers(lista1);
                    
                    Set<ArrayList<String>> resultado = new HashSet<>();
                    Set<ArrayList<String>> tabla1 = new HashSet<>();
                    Set<ArrayList<String>> tabla2 = new HashSet<>();
                    for(int i=1; i < propiedades1.length; i++){
                        String[] datos = propiedades1[i].toString().split("/");
                        ArrayList<String> datosLista  = new ArrayList<>(Arrays.asList(datos));
                        tabla1.add(datosLista);
                    }
                    for(int i=1; i < propiedades2.length; i++){
                        String[] datos = propiedades2[i].toString().split("/");
                        ArrayList<String> datosLista  = new ArrayList<>(Arrays.asList(datos));
                        tabla2.add(datosLista);
                    }
                    resultado.addAll(tabla1);
                    resultado.retainAll(tabla2);
                    System.out.println(resultado);
                    resultado.forEach(datos -> {
                        tm.addRow(datos.toArray());
                    });
                    jtableprincipal.setModel(tm);
                }
                // guardar los resultados
                guardar_datos(FilePathSearch1,FilePathSearch2,6);
            } else {
                JOptionPane.showMessageDialog(null, "Los documentos no cumplen el principio de compatibilidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los documentos no exsiten o fueron removidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInterseccionActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiferencia;
    private javax.swing.JButton btnInterseccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableprincipal;
    // End of variables declaration//GEN-END:variables
}
