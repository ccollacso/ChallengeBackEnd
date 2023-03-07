import javax.swing.*;
import java.awt.*;

public class SelectorDivisas {


    private JPanel Conversor;
    private JComboBox comboBox1;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new SelectorDivisas().Conversor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Conversor de Monedas");
        frame.setVisible(true);
        frame.pack();
    }
}
