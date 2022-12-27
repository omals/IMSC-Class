
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Akshay
 */
public class delete_venue extends javax.swing.JFrame {

    /**
     * Creates new form delete_venue
     */
    public delete_venue() {
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

        heading = new javax.swing.JLabel();
        heading1 = new javax.swing.JLabel();
        delete_button = new javax.swing.JButton();
        venue_box = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heading.setText("DELETE VENUE");

        heading1.setText("SELECT VENUE");

        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        venue_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        venue_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venue_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(venue_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_button)
                            .addComponent(heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(heading)
                .addGap(32, 32, 32)
                .addComponent(heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(venue_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(delete_button)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        // TODO add your handling code here:
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/sports_complex","root","root");
      Statement stmt=conn.createStatement();
      
      String venue=venue_box.getSelectedItem().toString();
      
      String q1="DELETE FROM venues WHERE venue='"+venue+"';";
      String q2="select venue from venues";
      //System.out.print(q1);
      
      //String[] data;
      stmt.executeUpdate(q1);
      ResultSet rs2=stmt.executeQuery(q2);
      //System.out.println("123");
      venue_box.removeAllItems();
      //removeAllItems();
      //int count=0;
      while (rs2.next()){
        System.out.print(rs2.getString(1)+" \n");
        String data=rs2.getString(1);
        venue_box.addItem(data);
        //count++;
      }
      //return data;
    } 
    catch (Exception ex) {
      System.out.print("\n--ERROR--\n");
      System.out.print(ex.getMessage());
    }   
        
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void venue_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venue_boxActionPerformed
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_venue_boxActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         if (mouse_count()==1){  
        //dekete==.setVisible(false);
        try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/sports_complex","root","root");
      Statement stmt=conn.createStatement();
      
      String q1="select venue from venues";
      //String q2="select count(id) from sports_items where quantity!=0";
      //System.out.print(q1);
      //ResultSet rs2=stmt.executeQuery(q2);
      //String[] data;
      ResultSet rs=stmt.executeQuery(q1);
      
      //System.out.println("123");
      venue_box.removeAllItems();
      //removeAllItems();
      //int count=0;
      while (rs.next()){
        System.out.print(rs.getString(1)+" \n");
        String data=rs.getString(1);
        venue_box.addItem(data);
        //count++;
      }
      //return data;
    } 
    catch (Exception ex) {
      System.out.print("\n--ERROR--\n");
      System.out.print(ex.getMessage());
    }
    }

    }//GEN-LAST:event_formMouseMoved

    int a=0;
    public int mouse_count(){ 
        a++;
        return a;
    }
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
            java.util.logging.Logger.getLogger(delete_venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_venue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading1;
    private javax.swing.JComboBox<String> venue_box;
    // End of variables declaration//GEN-END:variables
}
