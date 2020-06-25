package interfete.grafice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicatia2 extends JFrame {

    JButton b1;
    JTextField tArea1;
    JTextField tArea2;
    JLabel l1;
    JLabel l2;
    //HashMap<String,String> Users = new HashMap<String, String>();

    public Aplicatia2() {
        setTitle("Interfata");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        init();
        setVisible(true);
    }

    public void init() {
        this.setLayout(null);
        b1 = new JButton("Save");
        b1.setBounds(100, 100, 100, 20);
        tArea1 = new JTextField("date.txt");
        tArea1.setBounds(100, 20, 100, 20);
        tArea2 = new JTextField();
        tArea2.setBounds(100, 60, 100, 20);

        l1 = new JLabel("Nume fisier");
        l1.setBounds(30,20,100, 20);
        l2 = new JLabel("Text");
        l2.setBounds(60,60,100, 20);

        b1.addActionListener(new TratareButon2());

        add(b1);
        add(tArea1);
        add(tArea2);
        add(l1);
        add(l2);
    }

    class TratareButon2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //String text = tArea2.getText();   
            //System.out.println(pass);
       try {
		FileWriter f=new FileWriter("C:\\Users\\Andreea\\eclipse-workspace\\date.txt");
		f.write(tArea2.getText());
	} catch (IOException e1) {
		e1.printStackTrace();
	}
            tArea2.setText(null);
    }
 }
    public static void main(String[] args) {
       Aplicatia2 fereastra = new Aplicatia2();
    }

}

/*public static void main(String[] args){
    FileWriter f;
    f = new FileWriter("C:\\Users\\Andreea\\eclipse-workspace\\Exercitii_examen\\src\\interfete\\grafice\\data.txt");
    
} */
