package com.canard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
    private JPanel MainPanel;

    private JPanel ListaPanel;
    private JLabel labelListaProductos;
    private JComboBox listaProductosCombo;
    private JTextField IDProducto;

    private JPanel InfoPanel;
    private JTextField textFieldStock;
    private JTextField textFieldUltIngres;
    private JLabel textFieldUltVenta;
    private JTextArea textPaneDescrip;

    private JPanel StockPanel;
    private JTextField cantModificarStock;
    private JButton botonMas;
    private JButton botonMenos;


    public UI() {
        setContentPane(MainPanel);
        setTitle("Control de stock de productos");
        setSize(600, 700);
        setMinimumSize(new Dimension(400, 500));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        listaProductosCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se cambió el elemento de la lista Productos (comboBox)");
            }
        });

        IDProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se escribió en la casilla de IDProducto y se apretó ENTER");
            }
        });

        botonMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se apretó el botón más");
            }
        });

        botonMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se apretó el botón menos");
            }
        });

        cantModificarStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se escribió en la casilla de cantidadStockModificar y se apretó ENTER");
            }
        });
    }
}
