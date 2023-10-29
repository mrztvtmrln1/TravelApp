import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class MainFrame extends JFrame{
    JLabel label1;
    JButton button1;
    JButton button2;
    public MainFrame() {
        setSize(600,400);
        setTitle("TemirAir");
        setDefaultCloseOperation(2);
        setLayout(null);

        label1 = new JLabel("Welcome to the LOG IN/SIGN IN page!");
        label1.setLocation(150,20);
        label1.setSize(300,20);
        add(label1);

        button1 = new JButton("LOG IN");
        button1.setBounds(100,150,100,20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Loginpage loginpage = new Loginpage();
                loginpage.setVisible(true);
            }
        });
        add(button1);

        button2 = new JButton("SIGN IN");
        button2.setBounds(300,150,100,20);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signinpage signinpage = new Signinpage();
                signinpage.setVisible(true);
            }
        });
        add(button2);
    }
}
