package swing;


import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class result extends javax.swing.JFrame {
    
public String id;
public DefaultListModel mod=new DefaultListModel();
public result(String abc, String xyz) {
  
    System.out.println(abc+ " " +xyz);
    String url="jdbc:derby://localhost:1527/muskan_thakur";
    String username="muskan";
    String password="muskan";
    
        try
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
         ResultSet res=st.executeQuery("select * from compdata where cname ='" + abc+"' and yearr = '"+xyz+"'");
   while(res.next())
   {
       mod.addElement(res.getInt(("id"))+"--------------------->" +res.getString(("sname")));
   }
   con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }   

   initComponents();
      Icon i=l1.getIcon();
        ImageIcon icon=(ImageIcon) i;
       
       Image image= icon.getImage().getScaledInstance(l1.getWidth(),  l1.getHeight(), Image.SCALE_SMOOTH);
       l1.setIcon(new ImageIcon(image));
       
        Icon ii=l2.getIcon();
        ImageIcon ion=(ImageIcon) ii;
       
       Image imag= ion.getImage().getScaledInstance(l2.getWidth(),  l2.getHeight(), Image.SCALE_SMOOTH);
       l2.setIcon(new ImageIcon(imag));  
       setLocationRelativeTo(null);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list.setModel(mod);
        jScrollPane1.setViewportView(list);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 270, 160));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, 40));

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/formbg.jpg"))); // NOI18N
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 106, 420, 270));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/bggg.jpg"))); // NOI18N
        jPanel2.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     id=list.getSelectedValue().toString();
                 id=id.substring(0,4);
        System.out.println(id);
        new fulldata(id).setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JList<String> list;
    // End of variables declaration//GEN-END:variables
}
