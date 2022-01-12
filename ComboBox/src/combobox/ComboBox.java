package combobox;
import javax.swing.*;
import java.awt.event.*;
public class ComboBox extends JFrame implements ItemListener{
    JComboBox combo1;
    public ComboBox(){
        setLayout(null);
        combo1=new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == combo1){
            String seleccion=combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    public static void main(String args[]){
        ComboBox lista=new ComboBox();
        lista.setBounds(0, 0, 300, 300);
        lista.setLocationRelativeTo(null);
        lista.setVisible(true);
        lista.setResizable(false);
    }
}