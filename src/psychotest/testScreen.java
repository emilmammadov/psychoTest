package psychotest;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testScreen extends javax.swing.JFrame {
    
    public static testScreen test;
    public static ArrayList<Integer> mouseX = new ArrayList<>();
    public static ArrayList<Integer> mouseY = new ArrayList<>();
    public static int x,y;
    
    public testScreen() {
        initComponents();
    }
    
    static void mouseToStart(){
        try {
            
            new Robot().mouseMove(20, y-20);
        } catch (AWTException ex) {
            Logger.getLogger(testScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void mousePosSave(){
        mouseX.add((int) MouseInfo.getPointerInfo().getLocation().getX());
        mouseY.add((int) MouseInfo.getPointerInfo().getLocation().getY());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEvet = new javax.swing.JButton();
        btnHayir = new javax.swing.JButton();
        labelText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEvet.setText("EVET");
        btnEvet.setMaximumSize(new java.awt.Dimension(64, 32));
        btnEvet.setMinimumSize(new java.awt.Dimension(64, 32));
        btnEvet.setPreferredSize(new java.awt.Dimension(64, 32));
        btnEvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvetActionPerformed(evt);
            }
        });

        btnHayir.setText("HAYIR");
        btnHayir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHayirActionPerformed(evt);
            }
        });

        labelText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEvet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(btnHayir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHayir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEvet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(labelText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvetActionPerformed
        WriteFile.write(mouseX, mouseY);
        mouseX.clear();
        mouseY.clear();
        mouseToStart();
    }//GEN-LAST:event_btnEvetActionPerformed

    private void btnHayirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHayirActionPerformed
        WriteFile.write(mouseX, mouseY);
        mouseX.clear();
        mouseY.clear();
        mouseToStart();
    }//GEN-LAST:event_btnHayirActionPerformed

    public static void main(String args[]) {
        x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        y =(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        mouseToStart();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                mousePosSave();
            }
        }, 0,50);
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                test = new testScreen();
                test.setDefaultCloseOperation(testScreen.EXIT_ON_CLOSE);
                test.setPreferredSize(new Dimension(x-20,y-20));
                test.pack();
                test.setLocationRelativeTo(null);
                test.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvet;
    private javax.swing.JButton btnHayir;
    private javax.swing.JLabel labelText;
    // End of variables declaration//GEN-END:variables
}
