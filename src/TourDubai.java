import javax.swing.*;
import java.awt.*;

public class TourDubai extends JFrame {
    JLabel label;
    JTextField jTextField;
    public TourDubai(){
        setSize(600,400);
        setTitle("TemirAir");
        setDefaultCloseOperation(2);
        setLayout(null);

        label = new JLabel("hot tour to Dubai! Cheap prices, hotel with 5 stars,\n free breakfast and tour in Dubai!");
        label.setBounds(100,30,200,100);
        add(label);

        jTextField = new JTextField("Phone numb");
        jTextField.setBounds(200,300,200,30);
        add(jTextField);

    }
}
