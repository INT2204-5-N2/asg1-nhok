
package nhok;


public class Delete extends javax.swing.JFrame {
    Dictionary dictionary;
    
    public Delete(Dictionary d) {
        initComponents();
        setLocation(400,150);
        dictionary =d;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(355, 250));
        setPreferredSize(new java.awt.Dimension(355, 250));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nhập từ bạn muốn xóa:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 49, 210, 33);

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 93, 173, 33);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 144, 110, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("DELETE WORD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 200, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(10000, 10000));
        jLabel3.setMinimumSize(new java.awt.Dimension(400, 651));
        jLabel3.setPreferredSize(new java.awt.Dimension(400, 651));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-150, 0, 140, 10);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10 TIMT\\Pictures\\tải xuống (1).jpg")); // NOI18N
        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 40, 250, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //dic.getData[0] = jTextField1.getText();
        dictionary.DeleteWord(jTextField1.getText());
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
