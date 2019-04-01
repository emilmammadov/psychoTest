package psychotest;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testScreen extends javax.swing.JFrame {

    public static int x,y;
    
    public testScreen() {
        initComponents();
    }
    
    static void mouseToStart(){
        try {
            
            new Robot().mouseMove(0, y);
        } catch (AWTException ex) {
            Logger.getLogger(testScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("HAYIR");

        jButton2.setText("EVET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        y =(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        mouseToStart();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                testScreen test = new testScreen();
                test.setDefaultCloseOperation(testScreen.EXIT_ON_CLOSE);
                test.setPreferredSize(new Dimension(x,y));
                test.pack();
                test.setLocationRelativeTo(null);

                test.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
