
import javax.swing.*; // for JFrame, JLabel, JTextField
import java.awt.*; // for FlowLayout
import java.awt.event.*; // for ActionListener, ActionEvent

public class Greeting extends JFrame {

    private static final int WIDTH = 325;
    private static final int HEIGHT = 100;
    private JTextField nameBox; // contiene el nombre del usuario
    private JLabel greeting; // saludos personalizados
    
    public Greeting() {
        setTitle("Greeting");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end constructor
    
    private void createContents() {
        JLabel namePrompt = new JLabel("¿Cómo te llamas?");
        nameBox = new JTextField(15);
        greeting = new JLabel();
        add(namePrompt);
        add(nameBox);
        add(greeting);
        nameBox.addActionListener(new Listener());

    }

    private class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message; // the personalized greeting
            message = "Glad to meet you, " + nameBox.getText() + "!";
            nameBox.setText("");
            greeting.setText(message);
        } // end actionPerformed
    } // end class Listener
    
    public static void main(String args[]) {
        new Greeting();
    } // end main
} // end class Greeting