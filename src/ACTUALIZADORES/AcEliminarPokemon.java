/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTUALIZADORES;

/**
 *
 * @author alex0
 */
public class AcEliminarPokemon extends javax.swing.JFrame {

    /**
     * Creates new form AcEliminarPokemon
     */
    public AcEliminarPokemon() {
        initComponents();
        Transparente ();
    }
  public void Transparente ()
{
btnEliminar.setOpaque(false);
btnEliminar.setContentAreaFilled(false);
btnEliminar.setBorderPainted(false);

btnRegresar.setOpaque(false);
btnRegresar.setContentAreaFilled(false);
btnRegresar.setBorderPainted(false);
btnSalir.setOpaque(false);
btnSalir.setContentAreaFilled(false);
btnSalir.setBorderPainted(false);

btnPokemon.setOpaque(false);
btnPokemon.setContentAreaFilled(false);
btnPokemon.setBorderPainted(false);
btnEntrenador.setOpaque(false);
btnEntrenador.setContentAreaFilled(false);
btnEntrenador.setBorderPainted(false);

btnPE.setOpaque(false);
btnPE.setContentAreaFilled(false);
btnPE.setBorderPainted(false);
btnMedallas.setOpaque(false);
btnMedallas.setContentAreaFilled(false);
btnMedallas.setBorderPainted(false);


}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPokemon = new javax.swing.JButton();
        btnEntrenador = new javax.swing.JButton();
        btnPE = new javax.swing.JButton();
        btnMedallas = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTextID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConEli = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPokemon.setBackground(new java.awt.Color(204, 204, 204));
        btnPokemon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPokemon.setForeground(new java.awt.Color(255, 255, 255));
        btnPokemon.setText("POKEMON");
        getContentPane().add(btnPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        btnEntrenador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEntrenador.setText("ENTRENADOR");
        btnEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        btnPE.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPE.setText("POKEMON ENTRENADOR");
        getContentPane().add(btnPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btnMedallas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMedallas.setText("MEDALLAS GANADAS");
        getContentPane().add(btnMedallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        btnRegresar.setText("-");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 50, 40));

        btnSalir.setLabel("-");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, 40));
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 30));

        jTableConEli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableConEli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 540, 240));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AcEliminarPokemon.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ACTUALIZADORES.AcMenuPokemon Ventana = new  ACTUALIZADORES.AcMenuPokemon();
        Ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenadorActionPerformed
       ACTUALIZADORES.AcMenuEntrenador Ventana = new ACTUALIZADORES.AcMenuEntrenador();
        Ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEntrenadorActionPerformed

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
            java.util.logging.Logger.getLogger(AcEliminarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcEliminarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcEliminarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcEliminarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcEliminarPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEntrenador;
    private javax.swing.JButton btnMedallas;
    private javax.swing.JButton btnPE;
    private javax.swing.JButton btnPokemon;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConEli;
    private javax.swing.JTextField jTextID;
    // End of variables declaration//GEN-END:variables
}
