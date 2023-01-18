
package algebra_relacional;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SeleccionAtributos extends javax.swing.JFrame {
    private String[] lista;
    ArrayList<JRadioButton> btns;
    ArrayList<Integer> columnas;
    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }
    
    public SeleccionAtributos(String[] lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        btns = new ArrayList<>();
        columnas = new ArrayList<>();
        for (String current : lista) {
            JRadioButton rbtn=new JRadioButton();
            rbtn.setText(current);
            rbtn.setBounds(10,50,150,30);
            btns.add(rbtn);
            panelbtns.add(rbtn);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelbtns = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        aceptarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 50));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        jButton1.setText("Regresar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, -1));

        aceptarbtn.setText("Aceptar");
        aceptarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 189, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>                        

    private void aceptarbtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        for(int i=0; i < btns.size(); i++){
            if(btns.get(i).isSelected()){
                columnas.add(i);
                //System.out.println("id " + i);
            }
        }
        this.setVisible(false);
    }                                          
    
    public ArrayList<Integer> columnas(){
        return this.columnas;
    }
   
    // Variables declaration - do not modify                     
    private javax.swing.JButton aceptarbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelbtns;
    // End of variables declaration                   
}
