package com.patito;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
    private JPanel MainPanel;
    private JComboBox listaProductosCombo;
    private JTextField IDProducto;
    private JPanel InfoPanel;
    private JTextArea textoUltimaVenta;
    private JTextArea textoUltimoIngreso;
    private JTextArea textoDescripcion;
    private JButton botonMas;
    private JButton BotonMenos;
    private JPanel ListaPanel;
    private JLabel labelListaProductos;
    private JPanel StockPanel;
    private JPanel stockCantidad;
    private JTextField cantidadStockModificar;


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

        BotonMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se apretó el botón menos");
            }
        });

        cantidadStockModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se escribió en la casilla de cantidadStockModificar y se apretó ENTER");
            }
        });
    }
}
