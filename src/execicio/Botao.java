/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class Botao extends javax.swing.JPanel {

    /**
     * Creates new form Botao
     */
    public Botao() {
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

        btMensagem = new javax.swing.JButton();
        btTeimoso = new javax.swing.JButton();

        btMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/java.png"))); // NOI18N
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setText("Mensagem");
        btMensagem.setToolTipText("Clique aqui para ver a mensagem");
        btMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMensagemActionPerformed(evt);
            }
        });

        btTeimoso.setText("Teimoso");
        btTeimoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTeimosoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTeimosoMouseExited(evt);
            }
        });
        btTeimoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTeimosoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTeimoso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTeimoso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMensagemActionPerformed
        JOptionPane.showMessageDialog(null, "Botão Mensagem");
    }//GEN-LAST:event_btMensagemActionPerformed

    private void btTeimosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTeimosoActionPerformed
        JOptionPane.showMessageDialog(null, "Botão Teimoso");
    }//GEN-LAST:event_btTeimosoActionPerformed

    private void btTeimosoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTeimosoMouseEntered
       btTeimoso.setBounds(50, 20, 100, 25);
    }//GEN-LAST:event_btTeimosoMouseEntered

    private void btTeimosoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTeimosoMouseExited
        btTeimoso.setBounds(50, 70, 100, 25);
    }//GEN-LAST:event_btTeimosoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMensagem;
    private javax.swing.JButton btTeimoso;
    // End of variables declaration//GEN-END:variables
}
