package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramTrigonometri {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ProgramTrigonometri");
        frame.setContentPane(new ProgramTrigonometri().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    private JTextField textSudut;
    private JTextArea textHasil;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel LabelSudut;
    private JLabel LabelJudul;
    private JPanel panel;
    private JTextField textJenis;
    private JLabel LabelJenis;
    private JLabel Penjelasan;
    private JComboBox comboJenis;
    String InputSudut;
    double  sudut, sudutDerajat, sudutRadian, hasilSin, hasilCos, hasilTan, hasilAsin, hasilAcos, hasilAtan;

    public ProgramTrigonometri() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                sudutRadian=Math.toRadians(sudut);

                sudutDerajat=Math.toDegrees(sudutRadian);


                String Jenis = textJenis.getText();


                if (Jenis.equals("Sinus") ) {

                    hasilSin=Math.sin(sudutRadian);

                    DecimalFormat digitPresisi= new DecimalFormat("0.000");

                    sudut= Double.parseDouble(textSudut.getText());

                    textHasil.setText("Sinus dari sudut: "+sudut+" adalah"+digitPresisi.format(hasilSin));


                } else if (Jenis.equals("Cosinus")) {

                    hasilCos=Math.cos(sudutRadian);

                    DecimalFormat digitPresisi= new DecimalFormat("0.000");

                    sudut= Double.parseDouble(textSudut.getText());

                    textHasil.setText("Cosinus dari sudut: "+sudut+" adalah "+digitPresisi.format(hasilCos));


                } else if (Jenis.equals("Tangen")) {

                    hasilTan=Math.tan(sudutRadian);

                    DecimalFormat digitPresisi= new DecimalFormat("0.000");

                    sudut= Double.parseDouble(textSudut.getText());

                    textHasil.setText("Tangen dari sudut: "+sudut+" adalah "+digitPresisi.format(hasilTan));


                } else if (Jenis.equals("Arc Sinus")) {

                    hasilSin=Math.sin(sudutRadian);

                    hasilAsin=Math.asin(hasilSin);

                    DecimalFormat digitPresisi= new DecimalFormat("0.000");

                    sudut= Double.parseDouble(textSudut.getText());

                    textHasil.setText("Arc Sinus dari : "+digitPresisi.format(hasilSin)+" adalah "+digitPresisi.format(Math.toDegrees(hasilAsin)));


                } else if (Jenis.equals("Arc Cosinus")) {

                    hasilCos=Math.cos(sudutRadian);

                    hasilAcos=Math.acos(hasilCos);

                    DecimalFormat digitPresisi= new DecimalFormat("0.000");

                    sudut= Double.parseDouble(textSudut.getText());

                    textHasil.setText("Arc Cosinus dari : "+digitPresisi.format(hasilCos)+" adalah "+digitPresisi.format(Math.toDegrees(hasilAcos)));


                } else if (Jenis.equals("Arc Tangen")) {

                    hasilTan=Math.tan(sudutRadian);

                    hasilAtan=Math.atan(hasilTan);

                    DecimalFormat digitPresisi= new DecimalFormat("0.000");

                    sudut= Double.parseDouble(textSudut.getText());

                    textHasil.setText("Arc Tangen dari : " +digitPresisi.format(hasilTan)+ "adalah"+digitPresisi.format(Math.toDegrees(hasilAtan)));


                } else
                for (int i=0;i<=2;i++) {
                    textHasil.setText("Mohon maaf. Mungkin pilihan anda salah.");
                }

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHasil.setText("");
                textSudut.setText("");
                textJenis.setText("");
            }
        });
    }
}