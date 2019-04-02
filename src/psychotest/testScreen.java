package psychotest;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.RepaintArea;

public class testScreen extends javax.swing.JFrame {
    
    static boolean paBool = false;
    public static testScreen test;
    public static ArrayList<Integer> mouseX = new ArrayList<>();
    public static ArrayList<Integer> mouseY = new ArrayList<>();

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
    
    static void mousePosSave(){
        mouseX.add((int) MouseInfo.getPointerInfo().getLocation().getX());
        mouseY.add((int) MouseInfo.getPointerInfo().getLocation().getY());
    }
    
    public void paintComponents(Graphics g){
        super.paintComponents(g);
        System.out.println("Deneme");
        if(paBool){
            System.out.println("Hey");
            for(int i=0;i<mouseX.size()-1;i++){
                g.drawLine(mouseX.get(i), mouseY.get(i), mouseX.get(i+1), mouseY.get(i+1));
            }
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEvet = new javax.swing.JButton();
        btnHayir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEvet.setText("EVET");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEvet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(btnHayir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHayir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEvet))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvetActionPerformed
        paBool = true;
        test.repaint();
    }//GEN-LAST:event_btnEvetActionPerformed

    private void btnHayirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHayirActionPerformed
        paBool = true;
        test.repaint();
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
                test.setPreferredSize(new Dimension(x,y));
                test.pack();
                test.setLocationRelativeTo(null);
                test.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvet;
    private javax.swing.JButton btnHayir;
    // End of variables declaration//GEN-END:variables
}
