package com.patito;

import javax.swing.*;

public class UI {
    private JFrame ventana;

    public UI(){
        ventana = new JFrame();
        ventana.setTitle("Control de stock de productos");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(800,500);
        ventana.setLocationRelativeTo(null);
    }

    public void show(){
        ventana.setVisible(true);
    }
}
