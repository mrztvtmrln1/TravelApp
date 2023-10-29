import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToursFrame extends JFrame {
    JButton buttonDubai;
    JButton buttonTurkey;
    JButton buttonThiland;
    JButton buttonFrance;
    JButton buttonPhuket;

    JLabel label;

    public ToursFrame(){
        setSize(600,400);
        setTitle("TemirAir");
        setDefaultCloseOperation(2);
        setLayout(null);

        label = new JLabel("HOT TOURS!");
        label.setBounds(200,30,200,40);
        add(label);

        buttonDubai = new JButton("Tours to Dubai!");
        buttonFrance = new JButton("Tours to France!");
        buttonPhuket = new JButton("Tours to Phuket!");
        buttonThiland = new JButton("Tours to Thiland!");
        buttonTurkey = new JButton("Tours to Turkey!");

        buttonDubai.setBounds(70,70,120,30);
        add(buttonDubai);
        buttonTurkey.setBounds(200,70,120,30);
        add(buttonTurkey);
        buttonFrance.setBounds(330,70,120,30);
        add(buttonFrance);
        buttonPhuket.setBounds(100,130,120,30);
        add(buttonPhuket);
        buttonDubai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TourDubai tourDubai = new TourDubai();
                tourDubai.setVisible(true);
            }
        });

    }
}
