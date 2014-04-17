package com.sipe.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author kensipe
 */
public class UglyButtons {


    public static void main(String[] args) {
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();

        oldSchool(button1, button2, button3);

        java8(button1, button2, button3);

    }

    private static void java8(JButton button1, JButton button2, JButton button3) {

        button1.addActionListener(e -> setBackgroundColor(Color.BLACK));
        button2.addActionListener(e -> setBackgroundColor(Color.BLUE));
        button3.addActionListener(e -> setBackgroundColor(Color.BLACK));

    }

    private static void oldSchool(JButton button1, JButton button2, JButton button3) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackgroundColor(Color.BLACK);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackgroundColor(Color.BLUE);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackgroundColor(Color.BLACK);
            }
        });
    }

    // faked method for demo purposes
    public static void setBackgroundColor(Color color) {

    }
}
