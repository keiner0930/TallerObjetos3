/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author sony
 */
public class Principal3 extends javax.swing.JFrame {

    /**
     * Creates new form Principal3
     */
    public Principal3() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtReal1 = new javax.swing.JTextField();
        cmbSignos1 = new javax.swing.JComboBox<>();
        txtImaginario1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtReal2 = new javax.swing.JTextField();
        cmbSignos2 = new javax.swing.JComboBox<>();
        txtImaginario2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtReal3 = new javax.swing.JTextField();
        cmbSignos3 = new javax.swing.JComboBox<>();
        txtImaginario3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdLimpiar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel1.setText("Operaciones con Numeros Complejos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 420, -1));
        jPanel1.add(txtReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 40, 30));

        cmbSignos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        jPanel1.add(cmbSignos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPanel1.add(txtImaginario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 40, 30));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setText("i");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 10, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));
        jPanel1.add(txtReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 40, 30));

        cmbSignos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        jPanel1.add(cmbSignos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));
        jPanel1.add(txtImaginario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 40, 30));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setText("i");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 10, 30));

        jLabel4.setText("Resultado =");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        txtReal3.setEditable(false);
        jPanel1.add(txtReal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 30));

        cmbSignos3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        jPanel1.add(cmbSignos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        txtImaginario3.setEditable(false);
        jPanel1.add(txtImaginario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 40, 30));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setText("i");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 10, 30));

        cmdLimpiar.setText("Limpiar");
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 70, -1));

        cmdCalcular.setText("Calcular");
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSignos1;
    private javax.swing.JComboBox<String> cmbSignos2;
    private javax.swing.JComboBox<String> cmbSignos3;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtImaginario1;
    private javax.swing.JTextField txtImaginario2;
    private javax.swing.JTextField txtImaginario3;
    private javax.swing.JTextField txtReal1;
    private javax.swing.JTextField txtReal2;
    private javax.swing.JTextField txtReal3;
    // End of variables declaration//GEN-END:variables
}
