
package EmpGUI;

import EmpDbutil.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionFrame extends javax.swing.JFrame {

   
    public OptionFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrDeleteEmp = new javax.swing.JRadioButton();
        jrUpdateEmp = new javax.swing.JRadioButton();
        jrSearchEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrQuit = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OPTIONS FRAME");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jrAddEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrAddEmp);
        jrAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Employees");

        jrDeleteEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrDeleteEmp);
        jrDeleteEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrDeleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrDeleteEmp.setText("Delete Employees");

        jrUpdateEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrUpdateEmp);
        jrUpdateEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrUpdateEmp.setText("Updata Employees");

        jrSearchEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrSearchEmp);
        jrSearchEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrSearchEmp.setText("Search Employees");

        jrViewEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrViewEmp);
        jrViewEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Employees");

        jrQuit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrQuit);
        jrQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrQuit.setText("Quit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddEmp)
                    .addComponent(jrSearchEmp))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDeleteEmp)
                    .addComponent(jrViewEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrUpdateEmp)
                    .addComponent(jrQuit))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAddEmp)
                    .addComponent(jrDeleteEmp)
                    .addComponent(jrUpdateEmp))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrSearchEmp)
                    .addComponent(jrViewEmp)
                    .addComponent(jrQuit))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnDoTask.setBackground(new java.awt.Color(153, 153, 153));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Option");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDoTask))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoTask)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed

        
       if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please make a selection first!","No selection!", JOptionPane.INFORMATION_MESSAGE);
            return;
       }
        
        JFrame userChoiceFrame=null;
        
        if(jrAddEmp.isSelected()){
           userChoiceFrame=new AddEmployees();
           
        }
        else if(jrDeleteEmp.isSelected()){
            userChoiceFrame=new DeleteEmployees();
            
        }
        else if(jrSearchEmp.isSelected()){
            userChoiceFrame=new SearchEmployees();
            
        }
        else if(jrViewEmp.isSelected()){
            userChoiceFrame=new ViewEmployees();  
        }
        
        else if(jrUpdateEmp.isSelected()){
            userChoiceFrame=new UpdateEmployees();
           
        }
        else{
                   
               JOptionPane.showMessageDialog(null, ", Thank you so much for using the app!");
               DBConnection.closeConnection();
               System.exit(0);
               
}
        
        userChoiceFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrDeleteEmp;
    private javax.swing.JRadioButton jrQuit;
    private javax.swing.JRadioButton jrSearchEmp;
    private javax.swing.JRadioButton jrUpdateEmp;
    private javax.swing.JRadioButton jrViewEmp;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {

       if(jrQuit.isSelected()==false && jrDeleteEmp.isSelected()==false && jrAddEmp.isSelected()==false &&
               jrSearchEmp.isSelected()==false && jrViewEmp.isSelected()==false && jrUpdateEmp.isSelected()==false){
             return false;
       }
       return true;  
    }
}
