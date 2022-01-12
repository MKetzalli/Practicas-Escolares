package sub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sub extends JFrame implements ActionListener{
    JMenuBar menu;
    JMenu opciones;
    JMenu dimensiones;
    JMenu color;
    JMenuItem dim1,dim2;
    JMenuItem color1,color2;
    public Sub(){
        setLayout(null);
        
        menu=new JMenuBar();
        opciones=new JMenu("Opciones");
        dimensiones=new JMenu("Dimensiones");
        color=new JMenu("Color");
        dim1=new JMenuItem("300x200");
        dim2=new JMenuItem("400x200");
        color1=new JMenuItem("Rojo");
        color2=new JMenuItem("Verde");
        
        setJMenuBar(menu);
        menu.add(opciones);
        opciones.add(dimensiones);
        opciones.add(color);
        dimensiones.add(dim1);
        dimensiones.add(dim2);
        color.add(color1);
        color.add(color2);
        
        dim1.addActionListener(this);
        dim2.addActionListener(this);
        color1.addActionListener(this);
        color2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Container fondo=this.getContentPane();
        if(e.getSource()==dim1){
            setSize(300,200);
        }
        if(e.getSource()==dim2){
            setSize(400,200);
        }
        if(e.getSource()==color1){
            fondo.setBackground(Color.red);
        }
        if(e.getSource()==color2){
            fondo.setBackground(Color.green);
        }
    }
    public static void main(String args[]){
        Sub menus=new Sub();
        menus.setBounds(0, 0, 500, 500);
        menus.setVisible(true);
        menus.setResizable(false);
        menus.setLocationRelativeTo(null);
    }
}