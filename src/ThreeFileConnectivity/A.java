package ThreeFileConnectivity;

import java.awt.*;
import java.awt.event.*;

public class A extends Frame implements ActionListener {

    Button addition,factorial;


    A(){
        setLayout(null);
        addition = new Button("ADDITION");
        addition.setBounds(100,50,100,50);
        add(addition);
        addition.addActionListener(this);


        factorial = new Button("FACTORIAL");
        factorial.setBounds(100,150,100,50);
        add(factorial);
        factorial.addActionListener(this);



    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addition){
            B obj1 = new B();
            obj1.setSize(400,250);
            obj1.setVisible(true);
        }
        if(e.getSource()==factorial){
            C obj2 = new C();
            obj2.setVisible(true);
            obj2.setSize(350,200);
        }

    }

    public static void main(String[] args) {
        A objA = new A();
        objA.setSize(300,250);
        objA.setVisible(true);

    }
}
