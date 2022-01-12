package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menus extends JFrame implements ActionListener {

    JMenuBar menu;
    JMenu opciones;
    JMenuItem op1;
    JMenuItem op2;
    JMenuItem op3;

    public Menus() {
        setLayout(null);
        menu = new JMenuBar();
        setJMenuBar(menu);

        opciones = new JMenu("Opciones");
        menu.add(opciones);

        op1 = new JMenuItem("Rojo");
        op1.addActionListener(this);
        opciones.add(op1);
        op2 = new JMenuItem("Verde");
        op2.addActionListener(this);
        opciones.add(op2);
        op3 = new JMenuItem("Azul");
        op3.addActionListener(this);
        opciones.add(op3);
    }

    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();
        if (e.getSource() == op1) {
            fondo.setBackground(Color.red);
        }
        if (e.getSource() == op2) {
            fondo.setBackground(Color.green);
        }
        if (e.getSource() == op3) {
            fondo.setBackground(Color.blue);
        }
    }

    public static void main(String args[]) {
        Menus barra = new Menus();
        barra.setBounds(0, 0, 500, 500);
        //barra.setResizable(false);
        barra.setLocationRelativeTo(null);
        barra.setVisible(true);
    }
}
