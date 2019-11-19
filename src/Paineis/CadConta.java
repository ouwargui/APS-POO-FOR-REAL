/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import aps.poo.pkgfor.real.Banco;
import aps.poo.pkgfor.real.Conta;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyky
 */
public class CadConta extends javax.swing.JPanel {

    /**
     * Creates new form CadConta
     */
    public CadConta() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btnCadastrar = new customButton.customButton();
        btnLimpar = new customButton.customButton();
        jLabel6 = new javax.swing.JLabel();
        cmbNumCliente = new rojerusan.RSComboMetro();
        chkEspecial = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRAR CONTA");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel2.setText("NÚM. CLIENTE:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel3.setText("SALDO INICIAL (OPCIONAL):");

        txtSaldo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 153));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setColorHover(new java.awt.Color(0, 102, 102));
        btnCadastrar.setColorNormal(new java.awt.Color(0, 153, 153));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar.setText("LIMPAR");
        btnLimpar.setColorHover(new java.awt.Color(0, 102, 102));
        btnLimpar.setColorNormal(new java.awt.Color(0, 153, 153));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UAMLOGO.png"))); // NOI18N

        cmbNumCliente.setForeground(new java.awt.Color(0, 0, 0));
        cmbNumCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cmbNumCliente.setColorArrow(new java.awt.Color(0, 153, 153));
        cmbNumCliente.setColorBorde(new java.awt.Color(0, 153, 153));
        cmbNumCliente.setColorFondo(new java.awt.Color(255, 255, 255));
        cmbNumCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cmbNumCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNumClienteActionPerformed(evt);
            }
        });

        chkEspecial.setBackground(new java.awt.Color(255, 255, 255));
        chkEspecial.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chkEspecial.setText("Conta Especial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEspecial)
                            .addComponent(cmbNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(62, 62, 62)
                    .addComponent(jLabel6)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(cmbNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(chkEspecial)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(jLabel2)
                            .addGap(61, 61, 61)
                            .addComponent(jLabel3)
                            .addGap(9, 9, 9)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        int numero;
        double saldo;
        String data;

        if (txtSaldo.getText() == "") {

            saldo = 0.0;

        } else {

            saldo = Double.parseDouble(txtSaldo.getText());

        }

        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("dd'/'MM'/'yyyy");
        data = String.format(formatador.format(calendar.getTime()));

        numero = Integer.parseInt(String.valueOf(cmbNumCliente.getSelectedItem()));

        try {

            Banco banco = Banco.getInstance();
            Conta conta = new Conta();

            conta.setCliente(numero);
            conta.setDataAbertura(data);
            conta.setNumero(conta.getNumero());
            conta.setSaldo(saldo);

            banco.adicionar(conta);
               
            JOptionPane.showMessageDialog(null, conta.imprimir());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

            txtSaldo.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtSaldo.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void cmbNumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNumClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customButton.customButton btnCadastrar;
    private customButton.customButton btnLimpar;
    private javax.swing.JCheckBox chkEspecial;
    private rojerusan.RSComboMetro cmbNumCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
