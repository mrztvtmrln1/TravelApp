import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Loginpage extends JFrame {
    JLabel labelname;
    JLabel labelsurname;
    JLabel labeldob;
    JLabel labelcreditcard;
    JLabel labelcvv;

    JLabel labelusername;
    JLabel labelpassword;

    JTextField jTextFieldname;
    JTextField jTextFieldsurname;
    JTextField jTextFielddob;
    JTextField jTextFieldcreditcard;
    JTextField jTextFieldcvv;
    JTextField jTextFieldusername;
    JTextField jTextFieldpassword;
    JButton button1;

    UserControl control = new UserControl();
    User user;
    public Loginpage()
    {
        setSize(600,400);
        setTitle("Log in page");
        setDefaultCloseOperation(2);
        setLayout(null);

        labelname = new JLabel("Name:");
        labelsurname = new JLabel("Surname:");
        labeldob = new JLabel("Age:");
        labelcreditcard = new JLabel("Credit Card:");
        labelcvv = new JLabel("CVV:");
        labelusername = new JLabel("Balance:");
        labelpassword = new JLabel("Password:");


        labelname.setBounds(100,20,150,30);
        add(labelname);

        labelsurname.setBounds(100,60,150,30);
        add(labelsurname);

        labeldob.setBounds(100,100,150,30);
        add(labeldob);

        labelcreditcard.setBounds(100,140,150,30);
        add(labelcreditcard);

        labelcvv.setBounds(100,180,150,30);
        add(labelcvv);

        labelusername.setBounds(100,220,150,30);
        add(labelusername);

        labelpassword.setBounds(100,260,150,30);
        add(labelpassword);

        jTextFieldname = new JTextField("Temirlan");
        jTextFieldsurname = new JTextField("Myrzataev");
        jTextFielddob = new JTextField("18");
        jTextFieldcreditcard = new JTextField("1600 0000 0000 0000");
        jTextFieldcvv = new JTextField("123");
        jTextFieldusername = new JTextField("150000.5");
        jTextFieldpassword = new JTextField();

        jTextFieldname.setBounds(300,20,150,30);
        jTextFieldsurname.setBounds(300,60,150,30);
        jTextFielddob.setBounds(300,100,150,30);
        jTextFieldcreditcard.setBounds(300,140,150,30);
        jTextFieldcvv.setBounds(300,180,150,30);
        jTextFieldusername.setBounds(300,220,150,30);
        jTextFieldpassword.setBounds(300,260,150,30);

        add(jTextFieldname);
        add(jTextFieldsurname);
        add(jTextFielddob);
        add(jTextFieldcreditcard);
        add(jTextFieldcvv);
        add(jTextFieldusername);
        add(jTextFieldpassword);

        button1 = new JButton("LOGIN");
        button1.setBounds(200,300,200,30);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jTextFieldname.getText();
                String surname = jTextFieldsurname.getText();
                int age = Integer.parseInt(jTextFielddob.getText());
                String creditcard = jTextFieldcreditcard.getText();
                int cvv = Integer.parseInt(jTextFieldcvv.getText());
                double balance = Double.parseDouble(jTextFieldusername.getText());
                String password = jTextFieldpassword.getText();
                User user = new User(name,surname,age,creditcard,cvv,balance,password);
                try {
                    DBManeger.addUser(user);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        add(button1);

    }
}
