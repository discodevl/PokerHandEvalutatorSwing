package com.don.poker.view;

import com.don.poker.Application;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Frame extends javax.swing.JFrame {

    static{
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ex) {}
    }

    public void init() {
        initComponents();
        setTitle("Poker Hand Evalutator");
        initActions();
        setContentPane(new JScrollPane(Application.getInstance().getView()));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initActions() {
        menu1.setAction(Application.getInstance().getControlFrame().getActionStartGame());
        menu2.setAction(Application.getInstance().getControlFrame().getActionRandomGame());
        menu3.setAction(Application.getInstance().getControlFrame().getActionExit());
    }
    
    public void showMessage(String msg) {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu1 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        menu1.setText("jMenuItem1");
        jMenu1.add(menu1);

        menu2.setText("jMenuItem2");
        jMenu1.add(menu2);

        menu3.setText("jMenuItem3");
        jMenu1.add(menu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu1;
    private javax.swing.JMenuItem menu2;
    private javax.swing.JMenuItem menu3;
    // End of variables declaration//GEN-END:variables

}
