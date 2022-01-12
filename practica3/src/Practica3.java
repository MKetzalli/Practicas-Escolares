import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Practica3 extends JFrame implements ActionListener,ChangeListener{
    private JLabel etiqueta;
    private JButton boton;
    private JCheckBox confirmacion;
    public Practica3(){
        setLayout(null);
        //etiqueta
        etiqueta=new JLabel("Aceptar terminos y condiciones");
        etiqueta.setBounds(10,10,400,30);
        add(etiqueta);
        //boton
        boton=new JButton("continuar");
        boton.setBounds(10, 100, 100, 30);
        add(boton);
        boton.addActionListener(this);
        boton.setEnabled(false);
        //checkbox
        confirmacion=new JCheckBox("acepto");
        confirmacion.setBounds(10, 50, 100, 30);
        confirmacion.addChangeListener(this);
        add(confirmacion);
    }
    public void stateChanged(ChangeEvent e){
        if(confirmacion.isSelected()==true){
            boton.setEnabled(true);
        }else{
            boton.setEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        Practica3 TerYCon=new Practica3();
        TerYCon.setBounds(0, 0, 350, 200);
        TerYCon.setVisible(true);
        TerYCon.setResizable(false);
        TerYCon.setLocationRelativeTo(null);
    }
}