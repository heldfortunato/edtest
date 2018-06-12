
package projetofinaled;

/**
 *
 * @author clistenes
 */
public class TelaInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
    public TelaInicio() {
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
        btnListaSeq = new javax.swing.JButton();
        btnListaSimpEnc = new javax.swing.JButton();
        btnPilhaSeq = new javax.swing.JButton();
        btnFilaEnc = new javax.swing.JButton();
        btnArvoreBin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estrutura de Dados");
        setBackground(new java.awt.Color(73, 2, 21));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um tipo de estrutura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnListaSeq.setText("Lista Sequencial");
        btnListaSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaSeqActionPerformed(evt);
            }
        });

        btnListaSimpEnc.setText("Lista Simplesmente Encadeada");
        btnListaSimpEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaSimpEncActionPerformed(evt);
            }
        });

        btnPilhaSeq.setText("Pilha Sequencial");
        btnPilhaSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilhaSeqActionPerformed(evt);
            }
        });

        btnFilaEnc.setText("Fila Encadeada");
        btnFilaEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilaEncActionPerformed(evt);
            }
        });

        btnArvoreBin.setText("Arvore Binaria");
        btnArvoreBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArvoreBinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPilhaSeq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFilaEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaSeq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaSimpEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(btnArvoreBin, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnListaSimpEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnListaSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnPilhaSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilaEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnArvoreBin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPilhaSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilhaSeqActionPerformed
        
        //instancia um frame do tipo TelaPilha;
        TelaPilha frame = new TelaPilha();
        
        //torna o frame visível;
        frame.setVisible(true);
        
    }//GEN-LAST:event_btnPilhaSeqActionPerformed

    private void btnFilaEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilaEncActionPerformed

        //instancia um frame do tipo TelaPilha;
        TelaFila frame = new TelaFila();
        
        //torna o frame visível;
        frame.setVisible(true);
    }//GEN-LAST:event_btnFilaEncActionPerformed

    private void btnListaSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaSeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaSeqActionPerformed

    private void btnListaSimpEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaSimpEncActionPerformed
        // TODO add your handling code here:
        
        TelaLSE frame = new TelaLSE();
        frame.setVisible(true);
        
    }//GEN-LAST:event_btnListaSimpEncActionPerformed

    private void btnArvoreBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArvoreBinActionPerformed
        // TODO add your handling code here:
        TelaArvoreBin farme = new TelaArvoreBin();
        farme.setVisible(true);
    }//GEN-LAST:event_btnArvoreBinActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArvoreBin;
    private javax.swing.JButton btnFilaEnc;
    private javax.swing.JButton btnListaSeq;
    private javax.swing.JButton btnListaSimpEnc;
    private javax.swing.JButton btnPilhaSeq;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}