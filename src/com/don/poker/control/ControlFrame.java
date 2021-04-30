package com.don.poker.control;

import com.don.poker.Application;
import com.don.poker.model.Card;
import com.don.poker.model.Consts;
import com.don.poker.model.Hand;
import com.don.poker.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControlFrame {
    
    private Action actionStartGame = new ActionStartGame();
    private Action actionRandomGame = new ActionRandomGame();
    private Action actionExit = new ActionExit();
    
    public static final Logger logger = LoggerFactory.getLogger(View.class);

    public Action getActionStartGame() {
        return actionStartGame;
    }

    public Action getActionRandomGame() {
        return actionRandomGame;
    }
    
    public Action getActionExit() {
        return actionExit;
    }
    
    private class ActionStartGame extends AbstractAction{

        public ActionStartGame() {
            putValue(NAME, "Start game");
            putValue(SHORT_DESCRIPTION, "Start a new game");
            putValue(MNEMONIC_KEY, KeyEvent.VK_S);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl alt S"));
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            int c1Rank = convetCombo(Application.getInstance().getView().getComboRank1());
            String c1Suit = Application.getInstance().getView().getSelectedRadioButtom1();
            Card c1 = new Card(c1Rank, c1Suit);
            
            int c2Rank = convetCombo(Application.getInstance().getView().getComboRank2());
            String c2Suit = Application.getInstance().getView().getSelectedRadioButtom2();
            Card c2 = new Card(c2Rank, c2Suit);
            
            int c3Rank = convetCombo(Application.getInstance().getView().getComboRank3());
            String c3Suit = Application.getInstance().getView().getSelectedRadioButtom3();
            Card c3 = new Card(c3Rank, c3Suit);
            
            int c4Rank = convetCombo(Application.getInstance().getView().getComboRank4());
            String c4Suit = Application.getInstance().getView().getSelectedRadioButtom4();
            Card c4 = new Card(c4Rank, c4Suit);
            
            int c5Rank = convetCombo(Application.getInstance().getView().getComboRank5());
            String c5Suit = Application.getInstance().getView().getSelectedRadioButtom5();
            Card c5 = new Card(c5Rank, c5Suit);
            
            Hand hand = new Hand();
            hand.addCard(c5);hand.addCard(c4);hand.addCard(c3);hand.addCard(c2);hand.addCard(c1);
            Application.getInstance().getModel().putBean(Consts.HAND_GAME, hand);
            
            Application.getInstance().getView().getLabelMain().setText(hand.getCombination());
            
            Application.getInstance().getView().getLabelCard1().setText(c1.toString());
            Application.getInstance().getView().getLabelCard2().setText(c2.toString());
            Application.getInstance().getView().getLabelCard3().setText(c3.toString());
            Application.getInstance().getView().getLabelCard4().setText(c4.toString());
            Application.getInstance().getView().getLabelCard5().setText(c5.toString());
            
            logger.debug(hand.toString());
            
            //Application.getInstance().getDialogView().init();
        }
        
        private int convetCombo(String rank) {
            if (rank.equalsIgnoreCase(Consts.RANK_ACE)) {
                return 1;
            } else if (rank.equalsIgnoreCase(Consts.RANK_JACK)) {
                return 11;
            } else if (rank.equalsIgnoreCase(Consts.RANK_QUEEN)) {
                return 12;
            }  else if (rank.equalsIgnoreCase(Consts.RANK_KING)) {
                return 13;
            } else{
                return Integer.parseInt(rank);
            }
        }
    }
    
    private class ActionRandomGame extends AbstractAction{
        
        public ActionRandomGame() {
            putValue(NAME, "Random game");
            putValue(SHORT_DESCRIPTION, "Start a game with auto-generated cards");
            putValue(MNEMONIC_KEY, KeyEvent.VK_R);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl alt R"));
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int randomRank1 = random.nextInt(13)+1;
            int randomRank2 = random.nextInt(13)+1;
            int randomRank3 = random.nextInt(13)+1;
            int randomRank4 = random.nextInt(13)+1;
            int randomRank5 = random.nextInt(13)+1;
            
            int randomSuit1 = random.nextInt(4)+1;
            int randomSuit2 = random.nextInt(4)+1;
            int randomSuit3 = random.nextInt(4)+1;
            int randomSuit4 = random.nextInt(4)+1;
            int randomSuit5 = random.nextInt(4)+1;
            
            Card c1 = new Card(randomRank1, convertSuit(randomSuit1));
            Card c2 = new Card(randomRank2, convertSuit(randomSuit2));
            Card c3 = new Card(randomRank3, convertSuit(randomSuit3));
            Card c4 = new Card(randomRank4, convertSuit(randomSuit4));
            Card c5 = new Card(randomRank5, convertSuit(randomSuit5));
            Hand randHand = new Hand();
            randHand.addCard(c1);randHand.addCard(c2);randHand.addCard(c3);randHand.addCard(c4);
            randHand.addCard(c5);
            
            Application.getInstance().getModel().putBean(Consts.HAND_GAME, randHand);
            
            Application.getInstance().getView().getLabelMain().setText(randHand.getCombination());
            
            Application.getInstance().getView().getLabelCard1().setText(c1.toString());
            Application.getInstance().getView().getLabelCard2().setText(c2.toString());
            Application.getInstance().getView().getLabelCard3().setText(c3.toString());
            Application.getInstance().getView().getLabelCard4().setText(c4.toString());
            Application.getInstance().getView().getLabelCard5().setText(c5.toString());
            
            logger.debug(randHand.toString());
            
            //Application.getInstance().getDialogView().init();
        }
        
        private String convertSuit(int rank) {
            if (rank == 1) {
                return Consts.SUIT_CLUB;
            } if (rank == 2) {
                return Consts.SUIT_HEART;
            } if (rank == 3) {
                return Consts.SUIT_DIAMOND;
            }
            return Consts.SUIT_SPADES;
        }
    }
    
    private class ActionExit extends AbstractAction{

        public ActionExit() {
            putValue(NAME, "Exit");
            putValue(SHORT_DESCRIPTION, "Exit from the application");
            putValue(MNEMONIC_KEY, KeyEvent.VK_E);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl alt E"));
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    }
}
