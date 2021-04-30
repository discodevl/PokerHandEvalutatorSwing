package com.don.poker.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand {
    
    private List<Card> hand = new ArrayList<>();

    public List<Card> getHand () {
        return hand;
    }

    public void addCard (Card c) {
        this.hand.add(c);
    }

    public boolean isPair () { // 2 equal cards
        int n = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((i != j) && (hand.get(i).getRank() == hand.get(j).getRank())) {
                    n ++;
                }
            }
        }
        if (n == 2) {
            return true;
        }
        return false;
    }

    public boolean isPairDouble () { // 2 equal cards + 2 equal cards
        int n = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((i != j) && (hand.get(i).getRank() == hand.get(j).getRank())) {
                    n ++;
                }
            }
        }
        if (n == 4) {
            return true;
        }
        return false;
    }

    public boolean isTriple () { // 3 equal cards
        int n = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((i != j) && (hand.get(i).getRank() == hand.get(j).getRank())) {
                    n ++;
                }
            }
        }
        if (n == 6) {
            return true;
        }
        return false;
    }
    
    private class ComparatorCard implements Comparator<Card>{

        @Override
        public int compare(Card c, Card c1) {
            return Integer.valueOf(c.getRank()).compareTo(c1.getRank());
        }
    }

    public boolean isStraight () {  // 5 cards sequential rank
        int n = 0;
        Collections.sort(hand, new ComparatorCard());

        for (int i = 0; i < hand.size()-1; i++) {
            if (hand.get(i).getRank() == hand.get(i+1).getRank()-1) {
                n++;
            }
        }
        if (n == 4) {
            return true;
        }
        return false;
    }

    public boolean isFull () { // 3 equal cards rank + 2 equal cards rank
        if (hand.get(0).getRank() == hand.get(1).getRank() && hand.get(3).getRank() == hand.get(4).getRank()) {
            if (hand.get(1).getRank() != hand.get(2).getRank() && hand.get(2).getRank() == hand.get(3).getRank()) {
                return true;
            }
        }
        if (hand.get(0).getRank() == hand.get(1).getRank() && hand.get(3).getRank() == hand.get(4).getRank()) {
            if (hand.get(1).getRank() == hand.get(2).getRank() && hand.get(2).getRank() != hand.get(3).getRank()) {
                return true;
            }
        }
        return false;
    }

    public boolean isFlush () { // 4 cards same suit
        int n = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((i != j) && (hand.get(i).getSuit().equals(hand.get(j).getSuit()))) {
                    n ++;
                }
            }
        }
        if (n == 20) {
            return true;
        }
        return false;
    }

    public boolean isQuad () { // 4 cards same rank
        int n = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((i != j) && (hand.get(i).getRank() == hand.get(j).getRank())) {
                    n ++;
                }
            }
        }
        if (n == 12) {
            return true;
        }
        return false;
    }

    public boolean isStraightFlush () { // 5 cards sequential rank and same suit
        int n = 0;
        for (int i = 0; i < hand.size()-1; i++) {
            if (hand.get(i).getRank() == hand.get(i+1).getRank()-1) {
                n++;
            }
        }
        for (int y = 0; y < hand.size(); y++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((y != j) && (hand.get(y).getSuit().equals(hand.get(j).getSuit()))) {
                    n ++;
                }
            }
        }
        if (n == 22) {
            return true;
        }
        return false;
    }
    
    public String getCombination() {
            if (isPairDouble()) {
                return "Double pair";
            } if (isTriple()) {
                return "Triple";
            } if (isStraight()) {
                return "Straight";
            } if (isFull()) {
                return "Full";
            } if (isFlush()) {
                return "Flush";
            } if (isQuad()) {
                return "Quad";
            } if (isStraightFlush()) {
                return "Straight Flush";
            }if (isPair()) {
                return "Pair";
            }
            return "NULL";
        }
    
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < hand.size(); i++) {
            sb.append("Card n." + (i+1) + ": ").append(hand.get(i));
        }
        return sb.toString();
    }
}
