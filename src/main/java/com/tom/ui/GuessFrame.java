package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("Guess 1~10");
    JTextField number = new JTextField(8);
    int secret = new Random().nextInt(10)+1;
    //Constructors
    public GuessFrame() {
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        Random t = new Random();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Hello!");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
//                label.setText("Hello");
                if(num >secret){
                    label.setText("Smaller");
                }else if(num < secret) {
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo "+"the secret number is : "+secret);
                }
            }
        });


        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }
    //Methods


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setVisible(true);
  }
}
