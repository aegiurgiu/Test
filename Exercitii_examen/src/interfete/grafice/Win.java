package interfete.grafice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Win extends JFrame {

    private JTextField tFile1;
    private JTextField tFile2;
    private JButton but;

    public Win() {
        this.setLayout(null);
        setTitle("Titlul");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240, 120);
        init();
        setVisible(true);

    }

    public void init() {
        tFile1 = new JTextField();
        tFile1.setBounds(20, 20, 80, 20);

        tFile2 = new JTextField();
        tFile2.setBounds(120, 20, 80, 20);

        but = new JButton("Salveaza");
        but.setBounds(60, 45, 90, 20);

        but.addActionListener(new Actiune());

        add(tFile1);
        add(tFile2);
        add(but);

    }


    class Actiune implements ActionListener {

        private String nume;
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        if(tFile1.getText() != null){
            nume = (String)tFile1.getText();
            System.out.println("S-a citit numele");
        }
        if(tFile2.getText() != null){
            try {
                PrintWriter out1 = new PrintWriter(
                        new BufferedWriter(new FileWriter(nume)));
                out1.write(tFile2.getText());
                out1.close();
                System.out.println("S-a scris mesajul");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }
    }
}
class Main{
    public static void main(String[] args) {
        new Win();
    }
}

