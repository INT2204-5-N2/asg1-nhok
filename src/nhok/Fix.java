
package nhok;


public class Fix extends javax.swing.JFrame {
    Dictionary dictionary;
    public Fix(Dictionary d) {
        initComponents();
        setLocation(400,150);
        dictionary = d;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        w = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        m = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(312, 272));
        setPreferredSize(new java.awt.Dimension(400, 330));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("FIX WORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 250, 32);

        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        getContentPane().add(w);
        w.setBounds(10, 50, 194, 29);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nhập từ cần sửa:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 120, 29);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nghĩa của từ: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 140, 120, 33);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 250, 100, 23);

        nw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nwActionPerformed(evt);
            }
        });
        getContentPane().add(nw);
        nw.setBounds(10, 110, 194, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nhập từ mới: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 80, 100, 31);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\Ảnh girl 2.jpg")); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 30, 210, 220);

        m.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        getContentPane().add(m);
        m.setBounds(10, 170, 190, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(m.getText().trim().equals(""))
            dictionary.FixWord(w.getText().trim(),nw.getText().trim(),"");
        else
            dictionary.FixWord(w.getText().trim(),nw.getText().trim(),"<html><i></i><br/><ul><li><font color='#cc0000'><b> "+m.getText().trim()+"</b></font></li></ul></html>");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wActionPerformed

    private void nwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nwActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField m;
    private javax.swing.JTextField nw;
    private javax.swing.JTextField w;
    // End of variables declaration//GEN-END:variables
}
