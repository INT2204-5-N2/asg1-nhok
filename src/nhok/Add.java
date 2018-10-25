
package nhok;


public class Add extends javax.swing.JFrame {

    Dictionary dictionary;
    public Add (Dictionary d) {
        initComponents();
        setLocation(400,150);
        dictionary = d;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(420, 234));
        setPreferredSize(new java.awt.Dimension(390, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ADD WORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 230, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Từ muốn thêm");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 60, 110, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nghĩa của từ: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 110, 100, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 80, 170, 30);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 180, 100, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ảnh girl 1.jpg"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 20, 190, 210);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(0, 130, 170, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dictionary.AddWord(jTextField1.getText(), "<html><i>"+"</i><br/><ul><li><font color='#cc0000'><b> "+jTextField2.getText()+"</b></font></li></ul></html>");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
