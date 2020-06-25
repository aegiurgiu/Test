package interfete.grafice;

import java.io.*;
public class CountChar {
    public static void main(String[] args) throws Exception{
        FileReader f;
        f = new FileReader("C:\\Users\\Andreea\\eclipse-workspace\\Exercitii_examen\\src\\interfete\\grafice\\data.txt");
        int i,count=0;
        System.out.println("The character you are looking for is:");
        char c = ( char ) System.in.read();
        while((i=f.read())!= -1){
            if((char) i==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
