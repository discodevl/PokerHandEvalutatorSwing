package com.don.poker.view;

import com.don.poker.Application;
import com.don.poker.model.Consts;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class View extends javax.swing.JPanel {
    
    public void init() {
        initComponents();
        setComboBox(comboRank1);
        setComboBox(comboRank2);
        setComboBox(comboRank3);
        setComboBox(comboRank4);
        setComboBox(comboRank5);
        buttonStartGame.setAction(Application.getInstance().getControlFrame().getActionStartGame());
        buttonRandom.setAction(Application.getInstance().getControlFrame().getActionRandomGame());
    }
    
    public static final Logger logger = LoggerFactory.getLogger(View.class);
    
    
    private void setComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem(Consts.RANK_ACE);
        comboBox.addItem("2");
        comboBox.addItem("3");
        comboBox.addItem("4");
        comboBox.addItem("5");
        comboBox.addItem("6");
        comboBox.addItem("7");
        comboBox.addItem("8");
        comboBox.addItem("9");
        comboBox.addItem("10");
        comboBox.addItem(Consts.RANK_JACK);
        comboBox.addItem(Consts.RANK_QUEEN);
        comboBox.addItem(Consts.RANK_KING);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupCard1 = new javax.swing.ButtonGroup();
        groupCard2 = new javax.swing.ButtonGroup();
        groupCard3 = new javax.swing.ButtonGroup();
        groupCard4 = new javax.swing.ButtonGroup();
        groupCard5 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioSuitClub1 = new javax.swing.JRadioButton();
        radioSuitHeart1 = new javax.swing.JRadioButton();
        radioSuitSpades1 = new javax.swing.JRadioButton();
        radioSuitDiamond1 = new javax.swing.JRadioButton();
        radioSuitClub2 = new javax.swing.JRadioButton();
        radioSuitHeart2 = new javax.swing.JRadioButton();
        radioSuitSpades2 = new javax.swing.JRadioButton();
        radioSuitDiamond2 = new javax.swing.JRadioButton();
        radioSuitClub3 = new javax.swing.JRadioButton();
        radioSuitHeart3 = new javax.swing.JRadioButton();
        radioSuitSpades3 = new javax.swing.JRadioButton();
        radioSuitDiamond3 = new javax.swing.JRadioButton();
        radioSuitClub4 = new javax.swing.JRadioButton();
        radioSuitHeart4 = new javax.swing.JRadioButton();
        radioSuitSpades4 = new javax.swing.JRadioButton();
        radioSuitDiamond4 = new javax.swing.JRadioButton();
        radioSuitClub5 = new javax.swing.JRadioButton();
        radioSuitHeart5 = new javax.swing.JRadioButton();
        radioSuitSpades5 = new javax.swing.JRadioButton();
        radioSuitDiamond5 = new javax.swing.JRadioButton();
        comboRank1 = new javax.swing.JComboBox<>();
        comboRank2 = new javax.swing.JComboBox<>();
        comboRank3 = new javax.swing.JComboBox<>();
        comboRank4 = new javax.swing.JComboBox<>();
        comboRank5 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelMain = new javax.swing.JLabel();
        buttonStartGame = new javax.swing.JButton();
        buttonRandom = new javax.swing.JButton();
        labelCard1 = new javax.swing.JLabel();
        labelCard2 = new javax.swing.JLabel();
        labelCard3 = new javax.swing.JLabel();
        labelCard4 = new javax.swing.JLabel();
        labelCard5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel21.setText("jLabel21");

        setBackground(new java.awt.Color(5, 140, 66));

        jPanel1.setBackground(new java.awt.Color(5, 140, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose your cards"));

        radioSuitClub1.setBackground(new java.awt.Color(5, 140, 66));
        groupCard1.add(radioSuitClub1);
        radioSuitClub1.setText("Club");
        radioSuitClub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuitClub1ActionPerformed(evt);
            }
        });

        radioSuitHeart1.setBackground(new java.awt.Color(5, 140, 66));
        groupCard1.add(radioSuitHeart1);
        radioSuitHeart1.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitHeart1.setText("Heart");
        radioSuitHeart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuitHeart1ActionPerformed(evt);
            }
        });

        radioSuitSpades1.setBackground(new java.awt.Color(5, 140, 66));
        groupCard1.add(radioSuitSpades1);
        radioSuitSpades1.setText("Spades");

        radioSuitDiamond1.setBackground(new java.awt.Color(5, 140, 66));
        groupCard1.add(radioSuitDiamond1);
        radioSuitDiamond1.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitDiamond1.setText("Diamond");

        radioSuitClub2.setBackground(new java.awt.Color(5, 140, 66));
        groupCard2.add(radioSuitClub2);
        radioSuitClub2.setText("Club");
        radioSuitClub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuitClub2ActionPerformed(evt);
            }
        });

        radioSuitHeart2.setBackground(new java.awt.Color(5, 140, 66));
        groupCard2.add(radioSuitHeart2);
        radioSuitHeart2.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitHeart2.setText("Heart");

        radioSuitSpades2.setBackground(new java.awt.Color(5, 140, 66));
        groupCard2.add(radioSuitSpades2);
        radioSuitSpades2.setText("Spades");

        radioSuitDiamond2.setBackground(new java.awt.Color(5, 140, 66));
        groupCard2.add(radioSuitDiamond2);
        radioSuitDiamond2.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitDiamond2.setText("Diamond");

        radioSuitClub3.setBackground(new java.awt.Color(5, 140, 66));
        groupCard3.add(radioSuitClub3);
        radioSuitClub3.setText("Club");

        radioSuitHeart3.setBackground(new java.awt.Color(5, 140, 66));
        groupCard3.add(radioSuitHeart3);
        radioSuitHeart3.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitHeart3.setText("Heart");

        radioSuitSpades3.setBackground(new java.awt.Color(5, 140, 66));
        groupCard3.add(radioSuitSpades3);
        radioSuitSpades3.setText("Spades");
        radioSuitSpades3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuitSpades3ActionPerformed(evt);
            }
        });

        radioSuitDiamond3.setBackground(new java.awt.Color(5, 140, 66));
        groupCard3.add(radioSuitDiamond3);
        radioSuitDiamond3.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitDiamond3.setText("Diamond");

        radioSuitClub4.setBackground(new java.awt.Color(5, 140, 66));
        groupCard4.add(radioSuitClub4);
        radioSuitClub4.setText("Club");

        radioSuitHeart4.setBackground(new java.awt.Color(5, 140, 66));
        groupCard4.add(radioSuitHeart4);
        radioSuitHeart4.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitHeart4.setText("Heart");

        radioSuitSpades4.setBackground(new java.awt.Color(5, 140, 66));
        groupCard4.add(radioSuitSpades4);
        radioSuitSpades4.setText("Spades");

        radioSuitDiamond4.setBackground(new java.awt.Color(5, 140, 66));
        groupCard4.add(radioSuitDiamond4);
        radioSuitDiamond4.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitDiamond4.setText("Diamond");
        radioSuitDiamond4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuitDiamond4ActionPerformed(evt);
            }
        });

        radioSuitClub5.setBackground(new java.awt.Color(5, 140, 66));
        groupCard5.add(radioSuitClub5);
        radioSuitClub5.setText("Club");

        radioSuitHeart5.setBackground(new java.awt.Color(5, 140, 66));
        groupCard5.add(radioSuitHeart5);
        radioSuitHeart5.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitHeart5.setText("Heart");

        radioSuitSpades5.setBackground(new java.awt.Color(5, 140, 66));
        groupCard5.add(radioSuitSpades5);
        radioSuitSpades5.setText("Spades");

        radioSuitDiamond5.setBackground(new java.awt.Color(5, 140, 66));
        groupCard5.add(radioSuitDiamond5);
        radioSuitDiamond5.setForeground(new java.awt.Color(255, 0, 0));
        radioSuitDiamond5.setText("Diamond");

        comboRank1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRank2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRank3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRank4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRank5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerResizedSpadesDef.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerHeartDef.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerIconDef1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerDiamond.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerIconDef1.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerIconDef1.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerHeartDef.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerIconDef1.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerIconDef1.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerHeartDef.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerHeartDef.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerHeartDef.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerResizedSpadesDef.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerResizedSpadesDef.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerResizedSpadesDef.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerResizedSpadesDef.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerDiamond.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerDiamond.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerDiamond.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokerDiamond.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboRank1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitClub1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitHeart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitSpades1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitDiamond1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSuitClub2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitHeart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitSpades2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitDiamond2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(comboRank2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSuitClub3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitHeart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitSpades3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitDiamond3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(comboRank3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSuitClub4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitHeart4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitSpades4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuitDiamond4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(comboRank4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(radioSuitSpades5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioSuitHeart5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioSuitClub5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(radioSuitDiamond5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(comboRank5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioSuitClub1)
                            .addComponent(radioSuitClub2)
                            .addComponent(radioSuitClub3)
                            .addComponent(radioSuitClub4)
                            .addComponent(radioSuitClub5)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioSuitHeart5)
                        .addComponent(radioSuitHeart4))
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(radioSuitHeart3)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioSuitHeart2)
                            .addComponent(radioSuitHeart1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioSuitSpades1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioSuitDiamond1))
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioSuitSpades5)
                            .addComponent(radioSuitSpades4)
                            .addComponent(radioSuitSpades3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(radioSuitSpades2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioSuitDiamond2)
                            .addComponent(radioSuitDiamond5)
                            .addComponent(radioSuitDiamond4)
                            .addComponent(radioSuitDiamond3)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRank1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRank2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRank3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRank4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRank5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelMain.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        buttonStartGame.setText("jButton1");

        buttonRandom.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonStartGame, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(buttonRandom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 424, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(labelCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(labelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonStartGame)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRandom))
                    .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioSuitClub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuitClub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSuitClub1ActionPerformed

    private void radioSuitHeart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuitHeart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSuitHeart1ActionPerformed

    private void radioSuitClub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuitClub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSuitClub2ActionPerformed

    private void radioSuitDiamond4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuitDiamond4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSuitDiamond4ActionPerformed

    private void radioSuitSpades3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuitSpades3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSuitSpades3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRandom;
    private javax.swing.JButton buttonStartGame;
    private javax.swing.JComboBox<String> comboRank1;
    private javax.swing.JComboBox<String> comboRank2;
    private javax.swing.JComboBox<String> comboRank3;
    private javax.swing.JComboBox<String> comboRank4;
    private javax.swing.JComboBox<String> comboRank5;
    private javax.swing.ButtonGroup groupCard1;
    private javax.swing.ButtonGroup groupCard2;
    private javax.swing.ButtonGroup groupCard3;
    private javax.swing.ButtonGroup groupCard4;
    private javax.swing.ButtonGroup groupCard5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCard1;
    private javax.swing.JLabel labelCard2;
    private javax.swing.JLabel labelCard3;
    private javax.swing.JLabel labelCard4;
    private javax.swing.JLabel labelCard5;
    private javax.swing.JLabel labelMain;
    private javax.swing.JRadioButton radioSuitClub1;
    private javax.swing.JRadioButton radioSuitClub2;
    private javax.swing.JRadioButton radioSuitClub3;
    private javax.swing.JRadioButton radioSuitClub4;
    private javax.swing.JRadioButton radioSuitClub5;
    private javax.swing.JRadioButton radioSuitDiamond1;
    private javax.swing.JRadioButton radioSuitDiamond2;
    private javax.swing.JRadioButton radioSuitDiamond3;
    private javax.swing.JRadioButton radioSuitDiamond4;
    private javax.swing.JRadioButton radioSuitDiamond5;
    private javax.swing.JRadioButton radioSuitHeart1;
    private javax.swing.JRadioButton radioSuitHeart2;
    private javax.swing.JRadioButton radioSuitHeart3;
    private javax.swing.JRadioButton radioSuitHeart4;
    private javax.swing.JRadioButton radioSuitHeart5;
    private javax.swing.JRadioButton radioSuitSpades1;
    private javax.swing.JRadioButton radioSuitSpades2;
    private javax.swing.JRadioButton radioSuitSpades3;
    private javax.swing.JRadioButton radioSuitSpades4;
    private javax.swing.JRadioButton radioSuitSpades5;
    // End of variables declaration//GEN-END:variables

    public String getComboRank1() {
        return (String) comboRank1.getSelectedItem();
    }

    public String getComboRank2() {
        return (String) comboRank2.getSelectedItem();
    }

    public String getComboRank3() {
        return (String) comboRank3.getSelectedItem();
    }

    public String getComboRank4() {
        return (String) comboRank4.getSelectedItem();
    }

    public String getComboRank5() {
        return (String) comboRank5.getSelectedItem();
    }
    
    public String getSelectedRadioButtom1() {
        if (radioSuitClub1.isSelected()) {
            return Consts.SUIT_CLUB;
        } if (radioSuitHeart1.isSelected()) {
            return Consts.SUIT_HEART;
        } if (radioSuitDiamond1.isSelected()) {
            return Consts.SUIT_DIAMOND;
        } 
        return Consts.SUIT_SPADES;
    }
    public String getSelectedRadioButtom2() {
        if (radioSuitClub2.isSelected()) {
            return Consts.SUIT_CLUB;
        } if (radioSuitHeart2.isSelected()) {
            return Consts.SUIT_HEART;
        } if (radioSuitDiamond2.isSelected()) {
            return Consts.SUIT_DIAMOND;
        } 
        return Consts.SUIT_SPADES;
    }
    public String getSelectedRadioButtom3() {
        if (radioSuitClub3.isSelected()) {
            return Consts.SUIT_CLUB;
        } if (radioSuitHeart3.isSelected()) {
            return Consts.SUIT_HEART;
        } if (radioSuitDiamond3.isSelected()) {
            return Consts.SUIT_DIAMOND;
        } 
        return Consts.SUIT_SPADES;
    }
    public String getSelectedRadioButtom4() {
        if (radioSuitClub4.isSelected()) {
            return Consts.SUIT_CLUB;
        } if (radioSuitHeart4.isSelected()) {
            return Consts.SUIT_HEART;
        } if (radioSuitDiamond4.isSelected()) {
            return Consts.SUIT_DIAMOND;
        } 
        return Consts.SUIT_SPADES;
    }
    public String getSelectedRadioButtom5() {
        if (radioSuitClub5.isSelected()) {
            return Consts.SUIT_CLUB;
        } if (radioSuitHeart5.isSelected()) {
            return Consts.SUIT_HEART;
        } if (radioSuitDiamond5.isSelected()) {
            return Consts.SUIT_DIAMOND;
        } 
        return Consts.SUIT_SPADES;
    }

    public JLabel getLabelMain() {
        return labelMain;
    }

    public JLabel getLabelCard1() {
        return labelCard1;
    }

    public JLabel getLabelCard2() {
        return labelCard2;
    }

    public JLabel getLabelCard3() {
        return labelCard3;
    }

    public JLabel getLabelCard4() {
        return labelCard4;
    }

    public JLabel getLabelCard5() {
        return labelCard5;
    }
    
}
