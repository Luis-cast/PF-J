package com.company;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{


    private static final long serialVersionUID = 1L;

    JScrollPane JSP;
    portadaFrame P1;
    pruebaFrame P2;
    JButton A1;

    public Ventana()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,500);
        setTitle("Examen Final - Plataforma de Evaluacion");
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(200, 200, 200));
        iniciarComponentes();
    }

    private void iniciarComponentes()
    {
        P1 = new portadaFrame();
        JSP = new JScrollPane();
        JSP.setBounds(0, 0, 800, 400);
        JSP.setViewportView(P1);

        A1 = new JButton("Siguiente");
        A1.setBounds(500, 410, 100, 30);
        A1.setBackground(new java.awt.Color(86, 186, 237));
        A1.setForeground(Color.WHITE);
        A1.setFocusable(false);
        A1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        A1.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 12));
       A1.addActionListener((ActionListener) this);

        add(JSP);
        add(A1);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == A1){

            A1.setEnabled(false);
            P2 = new pruebaFrame(this);
            JSP.setViewportView(P2);

        }
    }

}
