package mcqQuestion;
import java.sql.SQLOutput;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Question extends  Frame implements ActionListener{

    String []q = {"Capital of INDIA ?", "PMO of INDIA ?", "CM of Chhattisgarh ?","What is your name ?","Gender ?","Age ?","School ?","College ?","Family Members ?","Branch ?"};
    String []op1 = {"Delhi" , "Rahul Gandhi", "Mamta DIDI","sanju","Female","20","Shakuntala","Rungta","2","CSE"};
    String []op2 = {"Bhopal" ,"Narendra Modi", "Mayawati","Ram","Male","21","Krishna","Shankra","3","Electrical"};
    String []op3 = {"Raipur", "Akhilesh yadav", "Bhupesh Baghel","Shyam","Not Defined","22","Augraha","BIT","4","Mechanical"};
    String []op4 = {"Mumbai","Mukesh Ambani", "Raman Singh","Manan","NA","24","Gov.","CCET","5","ET&T"};
    int []ans = {1,2,3,1,2,4,1,4,1,3};


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Label que;
    Button next,prev,submit,finish;
    Checkbox opt1,opt2,opt3,opt4;
    CheckboxGroup options;
    int index;
    int result[]= {0,0,0,0,0,0,0,0,0,0};
    int total =result.length;


    Question(){
        setLayout(null);
        b1 = new Button("1");
        b1.setBounds(50,50,50,50);
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("2");
        b2.setBounds(125,50,50,50);
        add(b2);
        b2.addActionListener(this);

        b3 = new Button("3");
        b3.setBounds(200,50,50,50);
        add(b3);
        b3.addActionListener(this);

        b4 = new Button("4");
        b4.setBounds(275,50,50,50);
        add(b4);
        b4.addActionListener(this);

        b5 = new Button("5");
        b5.setBounds(350,50,50,50);
        add(b5);
        b5.addActionListener(this);

        b6 = new Button("6");
        b6.setBounds(425,50,50,50);
        add(b6);
        b6.addActionListener(this);

        b7= new Button("7");
        b7.setBounds(500,50,50,50);
        add(b7);
        b7.addActionListener(this);

        b8 = new Button("8");
        b8.setBounds(575,50,50,50);
        add(b8);
        b8.addActionListener(this);

        b9 = new Button("9");
        b9.setBounds(650,50,50,50);
        add(b9);
        b9.addActionListener(this);

        b10 = new Button("10");
        b10.setBounds(725,50,50,50);
        add(b10);
        b10.addActionListener(this);

        que = new Label("xxx");
        que.setBounds(50,150,500,30);
        add(que);

        options = new CheckboxGroup();
        opt1 = new Checkbox("",options,false);
        opt1.setBounds(50,200,150,25);
        opt2 = new Checkbox("",options,false);
        opt2.setBounds(300,200,150,25);
        opt3 = new Checkbox("",options,false);
        opt3.setBounds(50,250,150,25);
        opt4 = new Checkbox("",options,false);
        opt4.setBounds(300,250,150,25);
        add(opt1); add(opt2); add(opt3); add(opt4);

        prev = new Button("PREV");
        prev.setBounds(50,300,100,25);
        add(prev);
        prev.addActionListener(this);

        next = new Button("NEXT");
        next.setBounds(200,300,100,25);
        add(next);
        next.addActionListener(this);

        submit = new Button("SUBMIT");
        submit.setBounds(500,300,100,25);
        add(submit);
        submit.addActionListener(this);

        finish = new Button("FINISH");
        finish.setBounds(650,300,100,26);
        add(finish);
        finish.addActionListener(this);

    }

    public static void main(String[] args) {
        Question q= new Question();
        q.setVisible(true);
        q.setSize(825,350);

    }

     public void actionPerformed(ActionEvent e){
      if(e.getSource()==b1){
          index=0;
          que.setText(q[0]);
          opt1.setLabel(op1[0]);
          opt2.setLabel(op2[0]);
          opt3.setLabel(op3[0]);
          opt4.setLabel(op4[0]);
      }
         if(e.getSource()==b2){
             index=1;
             que.setText(q[1]);
             opt1.setLabel(op1[1]);
             opt2.setLabel(op2[1]);
             opt3.setLabel(op3[1]);
             opt4.setLabel(op4[1]);
         }

         if(e.getSource()==b3){
             index=2;
             que.setText(q[2]);
             opt1.setLabel(op1[2]);
             opt2.setLabel(op2[2]);
             opt3.setLabel(op3[2]);
             opt4.setLabel(op4[2]);
         }

         if(e.getSource()==b4){
             index=3;
             que.setText(q[1]);
             opt1.setLabel(op1[3]);
             opt2.setLabel(op2[3]);
             opt3.setLabel(op3[3]);
             opt4.setLabel(op4[3]);
         }

         if(e.getSource()==b5){
             index=4;
             que.setText(q[4]);
             opt1.setLabel(op1[4]);
             opt2.setLabel(op2[4]);
             opt3.setLabel(op3[4]);
             opt4.setLabel(op4[4]);
         }

         if(e.getSource()==b6){
             index=5;
             que.setText(q[5]);
             opt1.setLabel(op1[5]);
             opt2.setLabel(op2[5]);
             opt3.setLabel(op3[5]);
             opt4.setLabel(op4[5]);
         }

         if(e.getSource()==b7){
             index=6;
             que.setText(q[6]);
             opt1.setLabel(op1[6]);
             opt2.setLabel(op2[6]);
             opt3.setLabel(op3[6]);
             opt4.setLabel(op4[6]);
         }

         if(e.getSource()==b8){
             index=7;
             que.setText(q[7]);
             opt1.setLabel(op1[7]);
             opt2.setLabel(op2[7]);
             opt3.setLabel(op3[7]);
             opt4.setLabel(op4[7]);
         }

         if(e.getSource()==b9){
             index=8;
             que.setText(q[8]);
             opt1.setLabel(op1[8]);
             opt2.setLabel(op2[8]);
             opt3.setLabel(op3[8]);
             opt4.setLabel(op4[8]);
         }

         if(e.getSource()==b10){
             index=9;
             que.setText(q[9]);
             opt1.setLabel(op1[9]);
             opt2.setLabel(op2[9]);
             opt3.setLabel(op3[9]);
             opt4.setLabel(op4[9]);
         }

             if(e.getSource()==next && index<9){
                 index++;
                 que.setText(q[index]);
                 opt1.setLabel(op1[index]);
                 opt2.setLabel(op2[index]);
                 opt3.setLabel(op3[index]);
                 opt4.setLabel(op4[index]);
             }

             if(e.getSource()==prev && index>0){
                 index--;
                 que.setText(q[index]);
                 opt1.setLabel(op1[index]);
                 opt2.setLabel(op2[index]);
                 opt3.setLabel(op3[index]);
                 opt4.setLabel(op4[index]);

             }

             if(e.getSource()==submit){
                 int a=0;
                 if(opt1.getState()){
                     a=1;
                 }
                 if(opt2.getState()){
                     a=2;
                 }
                 if(opt3.getState()){
                     a=3;
                 }
                 if(opt4.getState()){
                     a=4;
                 }



                 if(a==0){
                     System.out.println("Please choose the Correct Answer");
                 }
                 else {
                     if (a == ans[index]) {
                         System.out.println("Right Answer");
                         result[index]= 1;
                     } else {
                         System.out.println("Wrong Answer");
                         result[index]= 0;
                     }
                 }
             }

             // Finish Button
         int correct =0;
          if(e.getSource()==finish){
              for(int i=0;i<total;i++){
                  correct+=result[i];
              }
              System.out.println(correct +" / "+total);
          }

     }
}
