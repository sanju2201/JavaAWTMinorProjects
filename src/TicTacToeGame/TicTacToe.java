package TicTacToeGame;

import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends Frame implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, winner;
    Label tg,tgn,cg,cgn,p1,p1p,p2,p2p,pw;
    int t = 1;
    int totalGame = 5;
    int currentGame = 1;
    int player1Point = 0;
    int player2Point = 0;

    public void setPlayer1Point(int player1Point) {
        this.player1Point = player1Point;
    }

    public int getPlayer1Point() {
        return player1Point;
    }
    public void setPlayer2Point(int player2Point) {
        this.player2Point = player2Point;
    }

    public int getPlayer2Point() {
        return player2Point;
    }



    TicTacToe() {
        setLayout(null);
        b1 = new Button("");
        b1.setBounds(50, 50, 100, 100);
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("");
        b2.setBounds(200, 50, 100, 100);
        add(b2);
        b2.addActionListener(this);

        b3 = new Button("");
        b3.setBounds(350, 50, 100, 100);
        add(b3);
        b3.addActionListener(this);

        b4 = new Button("");
        b4.setBounds(50, 200, 100, 100);
        add(b4);
        b4.addActionListener(this);

        b5 = new Button("");
        b5.setBounds(200, 200, 100, 100);
        add(b5);
        b5.addActionListener(this);

        b6 = new Button("");
        b6.setBounds(350, 200, 100, 100);
        add(b6);
        b6.addActionListener(this);

        b7 = new Button("");
        b7.setBounds(50, 350, 100, 100);
        add(b7);
        b7.addActionListener(this);

        b8 = new Button("");
        b8.setBounds(200, 350, 100, 100);
        add(b8);
        b8.addActionListener(this);

        b9 = new Button("");
        b9.setBounds(350, 350, 100, 100);
        add(b9);
        b9.addActionListener(this);

        winner= new Button("Winner");
        winner.setBounds(100,620,100,30);
        add(winner);
        winner.addActionListener(this);

    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        ttt.setVisible(true);
        ttt.setSize(500, 700);



    }

    void restart()
    {
        b1.setLabel(""); b2.setLabel(""); b3.setLabel(""); b4.setLabel(""); b5.setLabel("");
        b6.setLabel(""); b7.setLabel(""); b8.setLabel(""); b9.setLabel("");
        t=1;
    }

    public void actionPerformed(ActionEvent e) {
        // b1
        if (e.getSource() == b1) {
            if(b1.getLabel().length()==0) {
                if (t % 2 == 1)
                    b1.setLabel("x");
                else
                    b1.setLabel("o");
                t++;
            }
        }

        // b2
        if (e.getSource() == b2) {
            if(b2.getLabel().length()==0) {
                if (t % 2 == 1)
                    b2.setLabel("x");
                else
                    b2.setLabel("o");
                t++;
            }
        }
        // b3
        if (e.getSource() == b3) {
            if(b3.getLabel().length()==0) {
                if (t % 2 == 1)
                    b3.setLabel("x");
                else
                    b3.setLabel("o");
                t++;
            }
        }
        // b4
        if (e.getSource() == b4) {
            if(b4.getLabel().length()==0) {
                if (t % 2 == 1)
                    b4.setLabel("x");
                else
                    b4.setLabel("o");
                t++;
            }
        }
        // b5
        if (e.getSource() == b5) {
            if(b5.getLabel().length()==0) {
                if (t % 2 == 1)
                    b5.setLabel("x");
                else
                    b5.setLabel("o");
                t++;
            }
        }
        // b6
        if (e.getSource() == b6) {
            if(b6.getLabel().length()==0) {
                if (t % 2 == 1)
                    b6.setLabel("x");
                else
                    b6.setLabel("o");
                t++;
            }
        }

        // b7
        if (e.getSource() == b7) {
           if(b7.getLabel().length()==0) {
               if (t % 2 == 1)
                   b7.setLabel("x");
               else
                   b7.setLabel("o");
               t++;
           }
        }

        // b8
        if (e.getSource() == b8) {
            if(b8.getLabel().length()==0) {
                if (t % 2 == 1)
                    b8.setLabel("x");
                else
                    b8.setLabel("o");
                t++;
            }
        }

        // b9
        if (e.getSource() == b9) {
            if(b9.getLabel().length()==0) {
                if (t % 2 == 1)
                    b9.setLabel("x");
                else
                    b9.setLabel("o");
                t++;
            }
        }

        String x1 = b1.getLabel();
        String x2 = b2.getLabel();
        String x3 = b3.getLabel();
        String x4 = b4.getLabel();
        String x5 = b5.getLabel();
        String x6 = b6.getLabel();
        String x7 = b7.getLabel();
        String x8 = b8.getLabel();
        String x9 = b9.getLabel();

        // Checking 1st Row
        if((x1.length()!=0 && x2.length()!=0 && x3.length()!=0) && (x1.equals(x2) && x1.equals(x3))){
            restart();
            if(x1.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 2nd Row
        if((x4.length()!=0 && x5.length()!=0 && x6.length()!=0) && (x4.equals(x5) && x4.equals(x6))){
            restart();
            if(x4.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 3rd Row
        if((x7.length()!=0 && x8.length()!=0 && x9.length()!=0) && (x7.equals(x8) && x7.equals(x9))){
            restart();
            if(x7.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 1st Column
        if((x1.length()!=0 && x4.length()!=0 && x7.length()!=0) && (x1.equals(x4) && x1.equals(x7))){
            restart();
            if(x1.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 2nd Column
        if((x2.length()!=0 && x5.length()!=0 && x8.length()!=0) && (x2.equals(x5) && x2.equals(x8))){
            restart();
            if(x2.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 3rd Column
        if((x3.length()!=0 && x6.length()!=0 && x9.length()!=0) && (x3.equals(x6) && x3.equals(x9))){
            restart();
            if(x3.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 1st to 9th
        if((x1.length()!=0 && x5.length()!=0 && x9.length()!=0) && (x1.equals(x5) && x1.equals(x9))){
            restart();
            if(x1.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking 7th to 3rd
        if((x7.length()!=0 && x5.length()!=0 && x3.length()!=0) && (x7.equals(x5) && x7.equals(x3))){
            restart();
            if(x7.equals("x")){
                System.out.println("Winner is Player 1");
            }
            else{
                System.out.println("Winner is Player 2");
            }
        }

        // Checking for the Draw
        if(t==10){
            System.out.println("Draw");
            restart();
            t=1;

        }


    }

}
