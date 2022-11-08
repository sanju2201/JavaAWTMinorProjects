package ThreeFileConnectivity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class B extends Frame implements ActionListener {
    Button sum;
    Label l1,l2;
    TextField t1,t2;

    B(){
        setLayout(null);
        l1 = new Label("Enter 1st Number");
        l1.setBounds(50,50,100,30);
        add(l1);

        l2 = new Label("Enter 2nd Number");
        l2.setBounds(50,100,100,30);
        add(l2);

        t1 = new TextField("");
        t1.setBounds(200,50,100,30);
        add(t1);

        t2 = new TextField("");
        t2.setBounds(200,100,100,30);
        add(t2);

        sum = new Button("SUM");
        sum.setBounds(250,160,75,30);
        add(sum);
        sum.addActionListener(this);


    }

    public static void main(String[] args) {
        B obj = new B();
        obj.setSize(400,250);
        obj.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource()==sum){
            c=a+b;
            System.out.println(c);
        }


    }

}
