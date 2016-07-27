package forms;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sql.sqlConnection;

public class girisFrame extends javax.swing.JFrame {
public static sqlConnection sql = new sqlConnection();

    public girisFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        idlbl = new javax.swing.JLabel();
        pwlbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        pwTxt = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        yIdlwl = new javax.swing.JLabel();
        yeniIdTxt = new javax.swing.JTextField();
        yeniIdlbl = new javax.swing.JLabel();
        yeniPwTxt = new javax.swing.JPasswordField();
        yeniBtnUyelik = new javax.swing.JButton();
        yeniPwlbl = new javax.swing.JLabel();
        yeniRpwTxt = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        adminId = new javax.swing.JTextField();
        adminPw = new javax.swing.JPasswordField();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        OnayPw = new javax.swing.JPasswordField();
        onayBtn = new javax.swing.JButton();
        OnayID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        idlbl.setText("Kullanici Adi:");

        pwlbl.setText("Şifre :");

        idTxt.setAutoscrolls(false);
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });

        pwTxt.setAutoscrolls(false);

        btnLogin.setText("Giriş Yap");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idlbl)
                    .addComponent(pwlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(pwTxt)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlbl)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwlbl)
                    .addComponent(pwTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Giriş", jPanel1);

        yIdlwl.setText("Kullanici Adi:");

        yeniIdTxt.setAutoscrolls(false);

        yeniIdlbl.setText("Şifre :");

        yeniPwTxt.setAutoscrolls(false);

        yeniBtnUyelik.setText("Uyelik Al");
        yeniBtnUyelik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniBtnUyelikActionPerformed(evt);
            }
        });

        yeniPwlbl.setText("Şifre Tekrar :");

        yeniRpwTxt.setAutoscrolls(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yIdlwl)
                    .addComponent(yeniIdlbl)
                    .addComponent(yeniPwlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(yeniBtnUyelik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yeniPwTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addComponent(yeniRpwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yIdlwl)
                    .addComponent(yeniIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniIdlbl)
                    .addComponent(yeniPwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniPwlbl)
                    .addComponent(yeniRpwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(yeniBtnUyelik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yeni üyelik", jPanel2);

        lbl.setText("Yönetici ID :");

        adminId.setAutoscrolls(false);

        adminPw.setAutoscrolls(false);

        lbl2.setText("Yönetici Pw :");

        lbl3.setText("Onay ID :");

        lbl4.setText("Onay Pw :");

        OnayPw.setAutoscrolls(false);
        OnayPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnayPwActionPerformed(evt);
            }
        });

        onayBtn.setText("Uyelik Onayla");
        onayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onayBtnActionPerformed(evt);
            }
        });

        OnayID.setAutoscrolls(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4)
                    .addComponent(lbl)
                    .addComponent(lbl2)
                    .addComponent(lbl3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OnayPw, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPw, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onayBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(108, 108, 108))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(OnayID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl)
                    .addComponent(adminId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(adminPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(OnayID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(OnayPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üyelik Onay", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void OnayPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnayPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OnayPwActionPerformed

    private void yeniBtnUyelikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniBtnUyelikActionPerformed
    if(yeniIdTxt.getText().isEmpty() || yeniPwTxt.getText().isEmpty() || yeniRpwTxt.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Boş Alanlari Doldurun Lütfen!","Hata",JOptionPane.ERROR_MESSAGE);
    }else{
    if(yeniPwTxt.getText().equals(yeniRpwTxt.getText()))
    {
       sql.uyelikAl(yeniIdTxt.getText(),yeniPwTxt.getText());
    }else{
       JOptionPane.showMessageDialog(null, "Sifreler Uyumlu Degil!","Hata",JOptionPane.ERROR_MESSAGE); 
    }

    }
    }//GEN-LAST:event_yeniBtnUyelikActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    if(idTxt.getText().isEmpty() || pwTxt.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Boş Alanlari Doldurun Lütfen!","Hata",JOptionPane.ERROR_MESSAGE);
    }else{
       int onay = sql.girisYap(idTxt.getText(),pwTxt.getText());
       if(onay == 1 || onay == 2) dispose();//hide();
       
    }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void onayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onayBtnActionPerformed
     if(adminId.getText().isEmpty() || adminPw.getText().isEmpty() || OnayID.getText().isEmpty() || OnayPw.getText().isEmpty())
     {
         JOptionPane.showMessageDialog(null, "Boş Alanlari Doldurun Lütfen!","Hata",JOptionPane.ERROR_MESSAGE);
     }else{
         sql.uyelikOnayla(adminId.getText(), adminPw.getText(),OnayID.getText(), OnayPw.getText());
     }
    }//GEN-LAST:event_onayBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sql.baglantiKapat();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

       
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
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
    
        //</editor-fold>
        
        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());// tasarimdaki stil

    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        
    } 
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new girisFrame().setVisible(true);     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OnayID;
    private javax.swing.JPasswordField OnayPw;
    private javax.swing.JTextField adminId;
    private javax.swing.JPasswordField adminPw;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel idlbl;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JButton onayBtn;
    private javax.swing.JPasswordField pwTxt;
    private javax.swing.JLabel pwlbl;
    private javax.swing.JLabel yIdlwl;
    private javax.swing.JButton yeniBtnUyelik;
    private javax.swing.JTextField yeniIdTxt;
    private javax.swing.JLabel yeniIdlbl;
    private javax.swing.JPasswordField yeniPwTxt;
    private javax.swing.JLabel yeniPwlbl;
    private javax.swing.JPasswordField yeniRpwTxt;
    // End of variables declaration//GEN-END:variables
}

/*
        java.net.URL imgUrl = getClass().getResource("icons//error.png");
        ImageIcon icon = new ImageIcon(imgUrl);
        JOptionPane.showMessageDialog(null,"test", "Hata", JOptionPane.ERROR_MESSAGE, icon);
        jLabel1.setIcon(icon);
*/