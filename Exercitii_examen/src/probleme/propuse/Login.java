package probleme.propuse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login extends JFrame {

    JButton b1;
    JButton b2;
    JTextArea tArea1;
    JTextArea tArea2;
    JLabel l1;
    JLabel l2;
    HashMap<String,String> Users = new HashMap<String, String>();

    public Login() {
        setTitle("Interfata");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(250, 200);
        setVisible(true);
    }

    public void init() {
        this.setLayout(null);
        b1 = new JButton("Save");
        b1.setBounds(10, 100, 100, 20);
        b2 = new JButton("Login");
        b2.setBounds(110, 100, 100, 20);
        tArea1 = new JTextArea();
        tArea1.setBounds(100, 20, 100, 20);
        tArea2 = new JTextArea();
        tArea2.setBounds(100, 60, 100, 20);

        l1 = new JLabel("User");
        l1.setBounds(30,20,100, 20);
        l2 = new JLabel("Password");
        l2.setBounds(30,60,100, 20);

        b1.addActionListener(new TratareButon1());
        b2.addActionListener(new TratareButon2());

        add(b1);
        add(b2);
        add(tArea1);
        add(tArea2);
        add(l1);
        add(l2);
    }

    class TratareButon1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
               String user = tArea1.getText();
               String pass = tArea2.getText();
               tArea1.setText(null);
               tArea2.setText(null);
               Users.put(user,pass);
            for (String i : Users.keySet()) {
                //System.out.println("key: " + i + " value: " + Users.get(i));
            }
        }
    }

    class TratareButon2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String user = tArea1.getText();
            String pass = tArea2.getText();
            for(String i:Users.keySet()) {
                if(i.equals(user) && Users.get(i).equals(pass) ) {
                    System.out.println("Exista user-ul");
                }
                else {
                    System.out.println("NU");
                }
                System.out.println(i + " " + Users.get(i) + "\n" );
            }
            System.out.println(user + " " + pass);
            tArea1.setText(null);
            tArea2.setText(null);
        }
    }

    public static void main(String[] args) {
        Login lg = new Login();
    }

}
