import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Temirairframe extends JFrame {



    TicketControl ticketControl = new TicketControl();


    JLabel labele1;
    JLabel labele2;
    JLabel labele3;
    JLabel labele4;
    JTextField jTextField1;
    JTextField jTextField2;
    JTextField jTextField3;
    JTextField jTextField4;
    JTextField jTextField5;

    JLabel name;
    JLabel balance;

    JButton button1;
    JButton button2;

    JButton button3;
    public Temirairframe(){

        setSize(600,400);
        setTitle("TemirAir");
        setDefaultCloseOperation(2);
        setLayout(null);

        labele1 = new JLabel("from");
        labele2 = new JLabel("to");

        labele1.setBounds(30,50,50,30);
        labele2.setBounds(30,120,50,30);


        add(labele1);
        add(labele2);

        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField1.setBounds(90,50,100,30);
        jTextField2.setBounds(90,120,100,30);
        add(jTextField1);
        add(jTextField2);

        labele3 = new JLabel("->\n<-");
        labele3.setBounds(120,110,40,40);
        add(labele3);

        button1 = new JButton("Find");
        button1.setBounds(90,170,100,20);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String from = jTextField1.getText();
                String to = jTextField2.getText();
                System.out.println(from);
                System.out.println(to);
                System.out.println("40000");
                for (int i = 0; i < ticketControl.getTickets().size(); i++) {

                    if(ticketControl.getTickets().get(i).getFrom()==from&&ticketControl.getTickets().get(i).getTo()==to)
                    {
                        System.out.println(from+to);
                    }
                }
            }
        });
        add(button1);
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();

        jTextField3.setBounds(250,50,100,30);
        jTextField4.setBounds(250,120,100,30);
        jTextField5.setBounds(250,190,100,30);
        add(jTextField3);
        add(jTextField4);
        add(jTextField5);

        button2 = new JButton("Sell");
        button2.setBounds(250,260,100,20);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String from = jTextField3.getText();
                String to = jTextField4.getText();
                Integer price = Integer.parseInt(jTextField5.getText());
                Tickets tickets = new Tickets(from,to,price);
                ArrayList<Tickets> tickets1 = new ArrayList<>();
                tickets1.add(tickets);
                ticketControl.setTickets(tickets1);
            }
        });

        add(button2);

        button3= new JButton("Tours");
        button3.setBounds(400,300,100,20);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToursFrame toursFrame = new ToursFrame();
                toursFrame.setVisible(true);
            }
        });
        add(button3);
    }
}
