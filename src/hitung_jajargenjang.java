import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hitung_jajargenjang {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel Main;
    private JButton hitungLuasButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("hitung_jajargenjang");
        frame.setContentPane(new hitung_jajargenjang().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public hitung_jajargenjang() {
        hitungLuasButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,t,hasil;
                a = Integer.parseInt(textField1.getText());
                t = Integer.parseInt(textField2.getText());

                hasil = a*t;
                textField3.setText(Integer.toString(hasil));
            }
        });
    }
}
