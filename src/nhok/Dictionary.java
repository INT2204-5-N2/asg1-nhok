
package nhok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;


public class Dictionary extends javax.swing.JFrame {
    final String EV = "C:\\Github\\asg1-nhok\\asg1-nhok\\src\\database\\E_V.txt";
    final String VE = "C:\\Github\\asg1-nhok\\asg1-nhok\\src\\database\\V_E.txt";
    
   VoiceManager vm;
   Voice v;
    
    public Dictionary() {
        initComponents();
        setTitle("Dictionary");
        setLocationRelativeTo(null);
    }

    public void loadDataIntoMap(String path)
    {
        hashmap = new HashMap<>();
        arraylist = new ArrayList<>();
        String str1,str2,s;
        model = new DefaultListModel<>();
        try
        {   
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF8"));
           
            while((str1 = br.readLine()) != null)

            {
                int i = str1.indexOf("<html>");
                str2 = str1.substring(0, i);
                s = str1.substring(i); 
                hashmap.put(str2, s);
                arraylist.add(str2);
                model.addElement(str2);
            }
            list.setModel(model);
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public void write(String path){
        BufferedWriter bw;
        FileWriter fw;
        try{
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            for(int i=0;i<arraylist.size();i++){
                bw.write(arraylist.get(i));
                bw.write(hashmap.get(arraylist.get(i)));
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (Exception e) {
                e.printStackTrace();
            }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<String>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHTML = new javax.swing.JEditorPane();
        removeButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        evButton = new javax.swing.JRadioButton();
        veButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        speakButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(703, 550));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\background3.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 110);

        jTextField1.setText("Write your word:...");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 110, 180, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\1.jpg")); // NOI18N
        jButton1.setText("Search");
        jButton1.setToolTipText("Search something");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 110, 90, 30);

        list.setBackground(new java.awt.Color(204, 204, 204));
        list.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        list.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        list.setForeground(new java.awt.Color(255, 0, 0));
        list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listKeyTyped(evt);
            }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 140, 250, 319);

        txtHTML.setBackground(new java.awt.Color(204, 204, 204));
        txtHTML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHTML.setContentType("text/html"); // NOI18N
        txtHTML.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jScrollPane3.setViewportView(txtHTML);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(270, 140, 420, 319);

        removeButton.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\3.png")); // NOI18N
        removeButton.setText("Delete");
        removeButton.setToolTipText("Delete");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(380, 110, 110, 30);

        modifyButton.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\4.png")); // NOI18N
        modifyButton.setText("Fix");
        modifyButton.setToolTipText("Fix");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(modifyButton);
        modifyButton.setBounds(490, 110, 100, 30);

        addButton.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\2.jpg")); // NOI18N
        addButton.setText("Add");
        addButton.setToolTipText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(280, 110, 100, 30);

        buttonGroup1.add(evButton);
        evButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        evButton.setForeground(new java.awt.Color(51, 51, 255));
        evButton.setText("English-Vietnamese");
        evButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evButtonActionPerformed(evt);
            }
        });
        getContentPane().add(evButton);
        evButton.setBounds(390, 10, 200, 29);

        buttonGroup1.add(veButton);
        veButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        veButton.setForeground(new java.awt.Color(51, 51, 255));
        veButton.setText("Vietnamese-English");
        veButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veButtonActionPerformed(evt);
            }
        });
        getContentPane().add(veButton);
        veButton.setBounds(390, 50, 190, 29);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("                    Võ Hồng Long && Trần Mạnh Thắng");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 480, 620, 30);

        speakButton.setIcon(new javax.swing.ImageIcon("C:\\Github\\asg1-nhok\\asg1-nhok\\image\\5.jpg")); // NOI18N
        speakButton.setText("Speak");
        speakButton.setToolTipText("Speak out");
        speakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakButtonActionPerformed(evt);
            }
        });
        getContentPane().add(speakButton);
        speakButton.setBounds(590, 110, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Lay Word duoc nhap vao
        String word = jTextField1.getText();
        //Tim nghia cua Word
        String mean;
        if(hashmap.containsKey(word))
        {
            mean = hashmap.get(word);
        }
        else
            mean = "<html><body><font color='red'>"+word+"</font></body></html>";
        //Output nghia cua Word ra 
        txtHTML.setText(mean);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listKeyTyped
        // TODO add your handling code here
        
    }//GEN-LAST:event_listKeyTyped

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
         //TODO add your handling code here:
        if(!list.isSelectionEmpty()){
            int index = list.getSelectedIndex();
            String w = arraylist.get(index);
            txtHTML.setText(hashmap.get(w));
            }
    }//GEN-LAST:event_listValueChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        String text = jTextField1.getText();
        text += evt.getKeyChar();
        for(int i=0;i<model.size();i++)
        {
            String val = model.getElementAt(i);
            if(val.startsWith(text))
           {
                list.setSelectedIndex(i);
                JScrollBar sb=jScrollPane2.getVerticalScrollBar();
                sb.setValue(i*15);
                return;
            }
        }
        list.clearSelection();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        Delete r = new Delete(this);
        r.setVisible(true);
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        Fix m = new Fix(this);
        m.setVisible(true);
    }//GEN-LAST:event_modifyButtonActionPerformed
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Add  a = new Add(this);
        a.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void evButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evButtonActionPerformed
        // TODO add your handling code here:
        loadDataIntoMap(EV);
        check=true;
    }//GEN-LAST:event_evButtonActionPerformed

    private void veButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veButtonActionPerformed
        // TODO add your handling code here: 
        loadDataIntoMap(VE);
        check=false;
    }//GEN-LAST:event_veButtonActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void speakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakButtonActionPerformed
        // TODO add your handling code here:
        String speak;
        if(list.isSelectionEmpty()) speak= jTextField1.getText();
        else {
            int index=list.getSelectedIndex();
            speak = arraylist.get(index);
        }
        System.setProperty("mbrola.base", "mbrola");
       vm = VoiceManager.getInstance();
        v = vm.getVoice("mbrola_us1");
        v.allocate();
        v.speak(speak);
    }//GEN-LAST:event_speakButtonActionPerformed

    public int search(String w, ArrayList<String> k)
    {   
        int i;
        for(i=0;i<k.size();i++){
            if(k.get(i).compareTo(w)>=0){
                break;
            }
        }
        return i;
    }
    public void AddWord(String w, String m)
    {
        hashmap.put(w, m);
        int i = search(w,arraylist);
        arraylist.add(i,w);
        model.add(i, w);
        if(check) write(EV);
            else write(VE);
    }
    
    public void DeleteWord(String w)
    {
        int i = arraylist.indexOf(w);

            arraylist.remove(i);
            hashmap.remove(w);
            model.removeElementAt(i);
        
        if(check) write(EV);
            else write(VE);
    }
    
    public void FixWord(String w, String nw, String m)
    {
            DeleteWord(w);
            AddWord(nw, m); 
        if(check) write(EV);
            else write(VE);
    
   }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         try 
        {
       UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dictionary().setVisible(true);
            }
        });
    }
    private HashMap<String, String> hashmap;
    private ArrayList<String> arraylist;
    private DefaultListModel<String> model;
    private boolean check; // true EV false VE
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton evButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton speakButton;
    private javax.swing.JEditorPane txtHTML;
    private javax.swing.JRadioButton veButton;
    // End of variables declaration//GEN-END:variables
}
