package albanianvirus;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;


public class AlbanianVirus {

    public static void main(String[] args) {
        String text = "Hi, I am Albanian virus. But because of poor technology in my country "
                + "unfortunately I am not able to harm your computer.\n"
                + "Please be so kind to delete one of your important files yourself and then forward me to other users.\n"
                + "Many thanks for your cooperation.\n"
                + "Best regards, Albanian virus.";
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, text, "Virus alert!", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
}
