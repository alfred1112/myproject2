package com.tom.ui;

import javax.swing.*;
import java.awt.*;

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
        MyActionListener listener = new MyActionListener();
        button.addActionListener(listener);
        //Layout
//        frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());   //(流水式)
        frame.add(button);
//        frame.add(new JButton("Testing"));



        frame.setVisible(true);
        System.out.println("END?");
    }
}
