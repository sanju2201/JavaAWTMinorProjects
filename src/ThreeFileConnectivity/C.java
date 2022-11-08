package ThreeFileConnectivity;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C extends Frame implements ActionListener {

    Label l1;
    TextField t1;
    Button b1;

    C(){
        setLayout(null);
        l1 = new Label("Enter a Number");
        l1.setBounds(50,75,100,30);
        add(l1);

        t1 = new TextField("");
        t1.setBounds(175,75,100,30);
        add(t1);

        b1 = new Button("FACTORIAL");
        b1.setBounds(175,125,100,30);
        add(b1);
        b1.addActionListener(this);


    }

    public static void main(String[] args) {
        C obj = new C();
        obj.setSize(350,200);
        obj.setVisible(true);
    }

    public int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }


    public  void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        if(e.getSource()==b1){
            System.out.println(factorial(a));

        }

    }

}
