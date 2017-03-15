/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Git3 {

    private static JLabel label = new JLabel("--");
    private static JButton btnlimpia = new JButton("Limpia");
    private static JButton btnescribe = new JButton("Escribe");

//    public static void acciones(ActionEvent e) {
//        Object obj = e.getSource();
//        if (obj == btnlimpia) {
//            label.setText("");
//        }
//        if (obj == btnescribe) {
//            label.setText("Hola mundo");
//        }
//
//    }
    public static class LimpiaEscribeActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            if (obj == btnlimpia) {
                label.setText("");
            }
            if (obj == btnescribe) {
                label.setText("Hola mundo");
            }
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
        }

        JFrame frame = new JFrame("Controlando Eventos ");
//            btnlimpia.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    acciones(e);
//                }
//            });
//
//            btnescribe.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    acciones(e);
//                }
//            });

        ActionListener miListener =new LimpiaEscribeActionListener();
        btnlimpia.addActionListener(miListener);
        btnescribe.addActionListener(miListener);

        frame.getContentPane().add(label);
        frame.getContentPane().add(btnlimpia);
        frame.getContentPane().add(btnescribe);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLayout(new GridLayout(0, 1));
        frame.pack();
        frame.setVisible(true);

    }
}

