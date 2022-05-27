package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //swing ,SWT,JavaFX
        //extension
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //add Component
        JButton button = new JButton("OK");
        //匿名類別, Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        //Layout
//        frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());   //(流水式)
        frame.add(button);
//        frame.add(new JButton("Testing"));



        frame.setVisible(true);
        System.out.println("END?");
    }
}
