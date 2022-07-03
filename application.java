import java.awt.;
import java.awt.event.;
import javax.swing.*;

public class Phone implements ActionListener{
private JFrame f1;
private JPanel p1;
private JLabel l1;
private JTextField tf1;
private JButton b0, b1 ,b2, b3, b4, b5, b6, b7, b8, b9, bHash, bDot;
private String number;

public Phone(){
    method();
}

public void method(){
    f1 = new JFrame("Telephone");
    f1.setSize(175, 225);

    p1 = new JPanel();
    l1 = new JLabel("Number to dail: ");
    tf1 = new JTextField("", 10);
    b0 = new JButton("0");
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    bHash = new JButton("#");
    bDot = new JButton(".");

    b0.addActionListener( this);
    b1.addActionListener( this);
    b2.addActionListener( this);
    b3.addActionListener( this);
    b4.addActionListener( this);
    b5.addActionListener( this);
    b6.addActionListener( this);
    b7.addActionListener( this);
    b8.addActionListener( this);
    b9.addActionListener( this);
    bHash.addActionListener( this);
    bDot.addActionListener( this);

    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(bDot);
    p1.add(b0);
    p1.add(bHash);
    p1.add(l1);
    p1.add(tf1);
    f1.getContentPane().add(p1);

    f1.setVisible(true);

}

public void actionPerformed(ActionEvent d){
    if(d.getSource () == b1){
        String str1 = "1";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }
    if(d.getSource () == b2){
        String str1 = "2";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b3){
        String str1 = "3";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b4){
        String str1 ="6";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b5){
        String str1 = "5";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b6){
        String str1 = "6";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b7){
        String str1 = "7";
        number += str1;
        tf1.setText(number);

    }

    if(d.getSource () == b8){
        String str1 = "8";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b9){
        String str1 = "9";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == bDot){
        String str1 = ".";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == b0){
        String str1 = "0";
        number += str1;
        String target= number.copyValueOf("null".toCharArray());
        number = number.replace(target, "");
        tf1.setText(number);

    }

    if(d.getSource () == bHash){
        JOptionPane.showMessageDialog(f1, "Dialing\nCalling the phone number: " + number);
    }
}
}