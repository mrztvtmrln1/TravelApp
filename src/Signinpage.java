import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Signinpage extends JFrame {

    JLabel labelusername;
    JLabel lablepassword;

    JTextField jTextFieldname;
    JTextField jTextFieldpassword;
    JButton button1;
    public Signinpage(){
        setSize(600,400);
        setTitle("Sign in page");
        setDefaultCloseOperation(2);
        setLayout(null);

        labelusername = new JLabel("Id:");
        lablepassword = new JLabel("PASSWORD:");

        jTextFieldname = new JTextField();
        jTextFieldpassword = new JTextField();

        labelusername.setBounds(100,100,150,30);
        lablepassword.setBounds(100,150,150,30);

        jTextFieldname.setBounds(300,100,150,30);
        jTextFieldpassword.setBounds(300,150,150,30);

        add(labelusername);
        add(lablepassword);
        add(jTextFieldname);
        add(jTextFieldpassword);

        button1 = new JButton("Sign in");
        button1.setBounds(200,300,200,30);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userid = Integer.parseInt(jTextFieldname.getText());
                ArrayList <User>users = DBManeger.getAllUsers();
                User user = DBManeger.getUser(userid);
                String userpassword = user.getPassword();
                if (user != null && userpassword.equals(jTextFieldpassword.getText())) {
                    Temirairframe temirairframe = new Temirairframe();
                    temirairframe.setVisible(true);
                }
                else{
                    ErrorPage errorPage = new ErrorPage();
                    errorPage.setVisible(true);
                }

            }
        });
        add(button1);

    }
}
