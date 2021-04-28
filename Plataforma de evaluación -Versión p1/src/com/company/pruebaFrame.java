package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebaFrame extends JPanel implements ActionListener {

    JButton B1;
    Ventana obj;

    public pruebaFrame(Ventana object){
        setLayout(null);
        setBackground(new java.awt.Color(200, 200, 200));
        iniciarComponentes();
        obj=object;
    }

    private void iniciarComponentes(){

        B1 = new JButton("prueba");
        B1.setBounds(200, 200, 100, 30);
        B1.setBackground(new java.awt.Color(86, 186, 237));
        B1.setForeground(Color.WHITE);
        B1.setFocusable(false);
        B1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        B1.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 12));
        B1.addActionListener((ActionListener) this);

        add(B1);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == B1){
            B1.setEnabled(false);
            obj.A1.setEnabled(true);
        }
    }


}
