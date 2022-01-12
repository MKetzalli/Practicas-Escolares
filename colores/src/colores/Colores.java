package colores;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colores extends JFrame implements ActionListener {

    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;
    JButton boton1;
    JComboBox box1;
    JComboBox box2;
    JComboBox box3;

    public Colores() {
        setLayout(null);
        etiqueta1 = new JLabel("Rojo: ");
        etiqueta2 = new JLabel("Verde: ");
        etiqueta3 = new JLabel("Azul: ");
        etiqueta1.setBounds(10, 10, 100, 30);
        etiqueta2.setBounds(10, 50, 100, 30);
        etiqueta3.setBounds(10, 90, 100, 30);
        add(etiqueta1);
        add(etiqueta2);
        add(etiqueta3);
        
        boton1 = new JButton("Combinar");
        boton1.setBounds(10, 150, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        
        box1 = new JComboBox();
        box2 = new JComboBox();
        box3 = new JComboBox();
        box1.setBounds(120, 10, 50, 30);
        box2.setBounds(120, 50, 50, 30);
        box3.setBounds(120, 90, 50, 30);
        for (int i = 0; i <= 255; i++) {
            box1.addItem(String.valueOf(i));
        }
        for (int i = 0; i <= 255; i++) {
            box2.addItem(String.valueOf(i));
        }
        for (int i = 0; i <= 255; i++) {
            box3.addItem(String.valueOf(i));
        }
        add(box1);
        add(box2);
        add(box3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cad1=box1.getSelectedItem().toString();
            String cad2=box2.getSelectedItem().toString();
            String cad3=box3.getSelectedItem().toString();
            int num1=Integer.parseInt(cad1);
            int num2=Integer.parseInt(cad2);
            int num3=Integer.parseInt(cad3);
            Color color1=new Color(num1,num2,num3);
            //boton1.setBackground(color1);
            this.getContentPane().setBackground(color1);
        }
    }

    public static void main(String args[]) {
        Colores color = new Colores();
        color.setBounds(0, 0, 200, 230);
        color.setVisible(true);
        color.setResizable(false);
        color.setLocationRelativeTo(null);
    }
}
