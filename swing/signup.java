package swing;


import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muskan
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
         Icon i=l2.getIcon();
        ImageIcon icon=(ImageIcon) i;
       
       Image image= icon.getImage().getScaledInstance(l2.getWidth(),  l2.getHeight(), Image.SCALE_SMOOTH);
       l2.setIcon(new ImageIcon(image));
       
         Icon ii=l3.getIcon();
        ImageIcon ion=(ImageIcon) ii;
       
       Image imge= ion.getImage().getScaledInstance(l3.getWidth(),  l3.getHeight(), Image.SCALE_SMOOTH);
       l3.setIcon(new ImageIcon(imge));
       setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        c1 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        c5 = new javax.swing.JRadioButton();
        y1 = new javax.swing.JRadioButton();
        y2 = new javax.swing.JRadioButton();
        y3 = new javax.swing.JRadioButton();
        y4 = new javax.swing.JRadioButton();
        y5 = new javax.swing.JRadioButton();
        y6 = new javax.swing.JRadioButton();
        y7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("COMPANY NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 118, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("YEAR");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 297, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("FATHER NAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 537, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PERCENTAGE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 581, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("AGE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 618, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("EMAIL");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 653, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PHONE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 693, -1, -1));
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 33, 229, -1));
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 78, 229, -1));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 531, 229, -1));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 575, 229, -1));
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 615, 229, -1));
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 229, -1));
        jPanel2.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 229, -1));

        buttonGroup1.add(c1);
        c1.setText("Microsoft");
        c1.setAlignmentX(0.5F);
        jPanel2.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 118, -1, -1));

        buttonGroup1.add(c2);
        c2.setText("Netflix");
        c2.setAlignmentX(0.5F);
        jPanel2.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 143, -1, -1));

        buttonGroup1.add(c3);
        c3.setText("Google");
        c3.setAlignmentX(0.5F);
        jPanel2.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 173, -1, -1));

        buttonGroup1.add(c4);
        c4.setText("Amazon");
        c4.setAlignmentX(0.5F);
        jPanel2.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 198, -1, -1));

        buttonGroup1.add(c5);
        c5.setText("Flipkart");
        c5.setAlignmentX(0.5F);
        jPanel2.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 228, -1, -1));

        buttonGroup2.add(y1);
        y1.setText("2000-2001");
        jPanel2.add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 293, -1, -1));

        buttonGroup2.add(y2);
        y2.setText("2001-2002");
        jPanel2.add(y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 318, -1, -1));

        buttonGroup2.add(y3);
        y3.setText("2002-2003");
        jPanel2.add(y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 348, -1, -1));

        buttonGroup2.add(y4);
        y4.setText("2003-2004");
        jPanel2.add(y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 378, -1, -1));

        buttonGroup2.add(y5);
        y5.setText("2004-2005");
        jPanel2.add(y5, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 408, -1, -1));

        buttonGroup2.add(y6);
        y6.setText("2005-2006");
        jPanel2.add(y6, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 438, -1, -1));

        buttonGroup2.add(y7);
        y7.setText("2006-2007");
        jPanel2.add(y7, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 468, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 170, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setText("GO BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 740, 200, -1));

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/formbg.jpg"))); // NOI18N
        jPanel2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 830));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 510, 810));

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/formbg.jpg"))); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 520, 770));

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/bggg.jpg"))); // NOI18N
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new loginsignup().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id=t1.getText();
        String sname=t2.getText();
        String father=t3.getText();
        String per=t4.getText();
        String age=t5.getText();
        String email=t6.getText();
        String phone=t7.getText();
        String company="";
        String yearr="";

        if(c1.isSelected())
        {
            company=c1.getText();
        }
        if(c2.isSelected())
        {
            company=c2.getText();
        }  if(c3.isSelected())
        {
            company=c3.getText();
        }  if(c4.isSelected())
        {
            company=c4.getText();
        }  if(c5.isSelected())
        {
            company=c5.getText();
        }

        if(y1.isSelected())
        {
            yearr=y1.getText();
        }
        if(y2.isSelected())
        {
            yearr=y2.getText();
        }  if(y3.isSelected())
        {
            yearr=y3.getText();
        }  if(y4.isSelected())
        {
            yearr=y4.getText();
        }  if(y5.isSelected())
        {
            yearr=y5.getText();
        }
        if(y6.isSelected())
        {
            yearr=y6.getText();
        }

        yearr= yearr.substring(0,4);

        String url="jdbc:derby://localhost:1527/muskan_thakur";
        String username="muskan";
        String password="muskan";

        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            System.out.println(id+" "+sname+" "+company+" "+yearr+" "+father+" "+per+" "+age+" "+email+" "+phone+" ");
            st.executeUpdate("insert into compdata values (' "+id+"','"+sname+"','"+company+"','"+yearr+"','"+father+"','"+per+"','"+age+"','"+email+"','"+phone+"')");
             JOptionPane.showMessageDialog(this, "Data Submit");
//System.out.println(" done.!");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton c5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JRadioButton y1;
    private javax.swing.JRadioButton y2;
    private javax.swing.JRadioButton y3;
    private javax.swing.JRadioButton y4;
    private javax.swing.JRadioButton y5;
    private javax.swing.JRadioButton y6;
    private javax.swing.JRadioButton y7;
    // End of variables declaration//GEN-END:variables
}
