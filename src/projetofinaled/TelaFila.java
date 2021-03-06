package projetofinaled;

import PacoteCanvas.Canvas;
import PacoteCanvas.Retangulo;
import FilaEnc.FilaArray;
import javax.swing.JOptionPane;

/**
 *
 * @author jpedr
 */
public class TelaFila extends javax.swing.JFrame {

    private Canvas canvas;
    private FilaArray fila;
    private Retangulo retangulo;
            
    int x, y;

    public TelaFila() {
        initComponents();
        canvas = new Canvas();
        canvas.setBounds(HEIGHT + 2, WIDTH + 150, 660, 415);
        this.add(canvas);
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
        lblTamanho = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblElemRemovido = new javax.swing.JLabel();
        inserirNaFila = new javax.swing.JButton();
        removerDaFila = new javax.swing.JButton();
        buscarNaFila = new javax.swing.JButton();
        criaFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fila Encadeada");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informação da fila"));

        lblTamanho.setText("Tamanho: ");

        lblInicio.setText("Inicio: ");

        lblElemRemovido.setText("Elemento Removido: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTamanho)
                    .addComponent(lblInicio)
                    .addComponent(lblElemRemovido))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblElemRemovido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inserirNaFila.setText("Inserir na Fila");
        inserirNaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirNaFilaActionPerformed(evt);
            }
        });

        removerDaFila.setText("Remover da Fila");
        removerDaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerDaFilaActionPerformed(evt);
            }
        });

        buscarNaFila.setText("Buscar na Fila");
        buscarNaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNaFilaActionPerformed(evt);
            }
        });

        criaFila.setText("Criar Fila");
        criaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inserirNaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removerDaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarNaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(criaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removerDaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inserirNaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarNaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirNaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirNaFilaActionPerformed
        //se a inserção na fila for bem sucedida ele pinta na tela;
        if (fila.insereElem(Integer.parseInt(JOptionPane.showInputDialog("Valor que será enfileirado?")))) {

            //distancia entre os retangulos;
            x = (x + 70);

            //instanciando o retangulo e passando os atributos;
            retangulo = new Retangulo();
            retangulo.setCoordX(x);
            retangulo.setCoordY(y);
            retangulo.setValor(Integer.toString(fila.consultaElem()));
            retangulo.setBasePx(50);
            retangulo.setAlturaPx(25);

            //adicionando retangulo no canvas;
            canvas.adicionar(retangulo);
            
            //adicionando retangulo de representação da fila no canvas;
            retangulo.setValor(Integer.toString(fila.consultaElem()));
            canvas.AddRepresentaFila(retangulo);
            
            //gerando o retangulo de representação da fila na tela;
            canvas.PintaRepresentaFila(canvas.getGraphics());

            //gerando o retangulo na tela;
            canvas.paintFila(canvas.getGraphics());

            //printando no label o tamanho da fila;
            lblTamanho.setText(String.valueOf("Tamanho: " + fila.tamanhoFila()));

            //printando no label o Inicio da fila;
            lblInicio.setText(String.valueOf("Inicio: " + fila.consultarElem()));

            //printando o label elemento removido;
            lblElemRemovido.setText("Elemento Removido: null");

        } else {
            //exibe mensagem de erro;
            JOptionPane.showMessageDialog(null, "A fila está cheia!", "Falha na inserção do Elemento", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inserirNaFilaActionPerformed

    private void criaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaFilaActionPerformed
        //se a estrutura estiver vázia lancará uma mensagem de erro;
        if (canvas.Tamanho() == 0) {
            // instanciando a fila;
            fila = new FilaArray();

            //printando no label o tamanho:
            lblTamanho.setText("Tamanho: " + fila.tamanhoFila());

            //printando no label inicio da fila;
            lblInicio.setText(String.valueOf("Inicio: " + fila.getInicio()));

            //printando o label elemento removido;
            lblElemRemovido.setText("Elemento Removido: null");

            //passando posição que começará a fila;
            x = 0;
            y = 50;

            //instancia retangulo e faço as alterações para fila;
            retangulo = new Retangulo();

        } else {
            //exibe uma mensagem de erro;
            JOptionPane.showMessageDialog(null, "Uma estrutura já foi criada. Remova todos os elementos"
                    + " da estrutura para criar outra !", "CRIAR FILA", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_criaFilaActionPerformed

    private void removerDaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerDaFilaActionPerformed
        //confere se a fila está vazia
        if (!fila.vazio()) {
            //criando uma variavel para armazenar o elemento removido;
            int aux;
            
            //remove elemento da fila;
            aux = fila.removeElem();
            
            //remove elemento do canvas;
            canvas.RemoveFilaCanvas();

            //printa todos os elementos que restão na tela;
            canvas.paintFila(canvas.getGraphics());

            //diminui a distancia de um quadrado para outro;
            x = x - 70;

            //atualiza o label elemento do inicio;
            lblInicio.setText("Inicio: " + fila.consultarElem());

            //printando no label o tamanho:
            lblTamanho.setText("Tamanho: " + fila.tamanhoFila());

            //printando o label elemento removido;
            lblElemRemovido.setText("Elemento Removido: " + aux);

        } else {
            //exibe uma mensagem na tela se a fila estiver vazia;
            JOptionPane.showMessageDialog(null, "A fila está vazia.", "ERRO AO REMOVER ELEMENTO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_removerDaFilaActionPerformed

    private void buscarNaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNaFilaActionPerformed
        //verifica se a fila está vazia;
        if (!fila.vazio()) {
                
                //mosta o valor no topo da fila;
                JOptionPane.showMessageDialog(null, "O valor no Inicio da Fila é: " + fila.consultarElem(), "CONSULTA ELEMENTO", JOptionPane.INFORMATION_MESSAGE);
            } else {
            
                //exibe uma mensagem de erro se a pilha estiver vazia;
                JOptionPane.showMessageDialog(null, "A fila está vazia.", "CONSULTA ELEMENTO", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_buscarNaFilaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarNaFila;
    private javax.swing.JButton criaFila;
    private javax.swing.JButton inserirNaFila;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblElemRemovido;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JButton removerDaFila;
    // End of variables declaration//GEN-END:variables
}
