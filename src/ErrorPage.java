import javax.swing.*;
import java.awt.*;

public class ErrorPage extends JFrame {
    public ErrorPage() {
        setSize(100,100);
        setTitle("Error");
        setDefaultCloseOperation(2);
        setLayout(null);
        JLabel label = new JLabel("Invalid id or password!");
        label.setBounds(20,20,50,50);
        add(label);

    }
}
