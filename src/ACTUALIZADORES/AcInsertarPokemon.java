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
public class AcInsertarPokemon extends javax.swing.JFrame {

    /**
     * Creates new form AcInsertarPokemon
     */
    public AcInsertarPokemon() {
        initComponents();
        Transparente ();
    }
 public void Transparente ()
{


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

btnInsertarP.setOpaque(false);
btnInsertarP.setContentAreaFilled(false);
btnInsertarP.setBorderPainted(false);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMedallas = new javax.swing.JButton();
        btnPE = new javax.swing.JButton();
        btnEntrenador = new javax.swing.JButton();
        btnPokemon = new javax.swing.JButton();
        jTextIDP = new javax.swing.JTextField();
        jTextAltura = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextPreE = new javax.swing.JTextField();
        jTextEvo = new javax.swing.JTextField();
        jTextPeso = new javax.swing.JTextField();
        jTextPS = new javax.swing.JTextField();
        btnInsertarP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnMedallas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMedallas.setText("MEDALLAS GANADAS");
        getContentPane().add(btnMedallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        btnPE.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPE.setText("POKEMON ENTRENADOR");
        getContentPane().add(btnPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btnEntrenador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEntrenador.setText("ENTRENADOR");
        btnEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        btnPokemon.setBackground(new java.awt.Color(204, 204, 204));
        btnPokemon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPokemon.setForeground(new java.awt.Color(255, 255, 255));
        btnPokemon.setText("POKEMON");
        getContentPane().add(btnPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jTextIDP.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextIDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 150, 35));

        jTextAltura.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 150, 35));

        jTextNombre.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 150, 35));

        jTextPreE.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextPreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, 35));

        jTextEvo.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextEvo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 150, 35));

        jTextPeso.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 385, 150, 35));

        jTextPS.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        getContentPane().add(jTextPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 150, 35));

        btnInsertarP.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnInsertarP.setText("INSERTAR");
        getContentPane().add(btnInsertarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 149, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AcInsertarPokemon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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
            java.util.logging.Logger.getLogger(AcInsertarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcInsertarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcInsertarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcInsertarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcInsertarPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrenador;
    private javax.swing.JButton btnInsertarP;
    private javax.swing.JButton btnMedallas;
    private javax.swing.JButton btnPE;
    private javax.swing.JButton btnPokemon;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextEvo;
    private javax.swing.JTextField jTextIDP;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPS;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextPreE;
    // End of variables declaration//GEN-END:variables
}
