package practicainterfaz;

import javax.swing.*;
import java.awt.event.*;

public class PracticaInterfaz extends JFrame implements ActionListener {

    JButton boton1;
    JButton boton2;
    JButton boton3;
    JLabel etiqueta1;
    JTextField cuadro1;
    JTextArea zona1;
    JScrollPane barra1;
    String texto="";

    public PracticaInterfaz() {
        //ventana
        setLayout(null);
        //botones
        boton1 = new JButton("Cerrar");
        boton2 = new JButton("Aceptar");
        boton3=new JButton("Pasar");
        boton1.setBounds(120, 70, 90, 30);
        boton2.setBounds(10, 70, 90, 30);
        boton3.setBounds(220,20,90,30);
        add(boton1);
        add(boton2);
        add(boton3);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        //etiqueta
        etiqueta1 = new JLabel("Nombre: ");
        etiqueta1.setBounds(10, 20, 90, 30);
        add(etiqueta1);
        //cuadro
        cuadro1 = new JTextField();
        cuadro1.setBounds(70, 20, 140, 30);
        add(cuadro1);
        //zona
        zona1 = new JTextArea();
        //zona1.setBounds(10, 130, 400, 300);
        //add(zona1);
        //barra
        barra1=new JScrollPane(zona1);
        barra1.setBounds(10,130,400,300);
        add(barra1);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {//verifica que ese es el boton apretado
            System.exit(0);
        }
        if (e.getSource() == boton2) {
            texto = cuadro1.getText();
            setTitle(texto); //coloca texto en titulo
            etiqueta1.setText(texto); //coloca texto antes del cuadro
        }
        if(e.getSource()==boton3){
            texto+=cuadro1.getText()+"\n";
            zona1.setText(texto);
            cuadro1.setText("");
        }
    }

    public static void main(String args[]) {
        PracticaInterfaz interfaz = new PracticaInterfaz();
        interfaz.setBounds(0, 0, 500, 500);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
    }
}
