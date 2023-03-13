import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste extends JFrame {
    private JPanel painelMain;
    private JTextField txtName;
    private JButton btnClick;

    public teste() {
        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, txtName.getText() + " hello");
            }
        });
    }

    public static void main(String[] args) {
        teste teste = new teste();
        teste.setContentPane(teste.painelMain);
        teste.setTitle("Ola marilene!");
        teste.setSize(300,400);
        teste.setVisible(true);
        teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
