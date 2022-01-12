package interfaz2;

import javax.swing.*;
import java.awt.event.*;

public class Interfaz2 extends JFrame implements ActionListener {

    JTextField caja1;
    JTextField caja2;
    JButton boton1;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;

    public Interfaz2() {
        setLayout(null);
        caja1 = new JTextField();
        caja2 = new JTextField();
        caja1.setBounds(120,10,150,20);
        caja2.setBounds(120,40,150,20);
        add(caja1);
        add(caja2);

        boton1 = new JButton("Sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);

        etiqueta1 = new JLabel("valor 1: ");
        etiqueta1.setBounds(50,5,100,30);
        add(etiqueta1);
        etiqueta2 = new JLabel("valor 2: ");
        etiqueta2.setBounds(50,35,100,30);
        add(etiqueta2);
        etiqueta3 = new JLabel("resultado: ");
        etiqueta3.setBounds(120,80,100,30);
        add(etiqueta3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            int num1 = 0, num2 = 0, resultado = 0;
            num1 = Integer.parseInt(caja1.getText());
            num2 = Integer.parseInt(caja2.getText());
            resultado = num1 + num2;
            etiqueta3.setText("Resultado: " + resultado);
        }
    }

    public static void main(String args[]) {
        Interfaz2 interfaz = new Interfaz2();
        interfaz.setBounds(0, 0, 300, 150);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
    }
}
