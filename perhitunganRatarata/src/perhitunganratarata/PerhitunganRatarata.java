/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitunganratarata;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Axce29
 */
public class PerhitunganRatarata {

public static void nomor1(){
        
        int angka1, angka2, angka3;
        double avg;
        
        Scanner angka = new Scanner(System.in);
        
        System.out.print("number 1 = ");
        angka1 = angka.nextInt();
        System.out.print("number 2 = ");
        angka2 = angka.nextInt();
        System.out.print("number 3 = ");
        angka3 = angka.nextInt();
        
        avg = (angka1+angka2+angka3)/(double)3;
        System.out.println("Rata-rata = " + avg);
}
    public static void nomor2() {
        
        String angka1, angka2, angka3;
        double avg;
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        angka1 = JOptionPane.showInputDialog("Masukkan Nilai Angka 1 = ");
        angka2 = JOptionPane.showInputDialog("Masukkan Nilai Angka 2 = ");
        angka3 = JOptionPane.showInputDialog("Masukkan Nilai Angka 3 = ");
        
        int a = Integer.parseInt(angka1);
        int b = Integer.parseInt(angka2);
        int c = Integer.parseInt(angka3);
        
        avg = (a+b+c)/(double)3;
        
        String mssg = "Number 1 = \t" + a + "\nNumber 2 = \t" + b + 
                       "\nNumber 3 = \t" + c + "\nRata-rata = \t" + avg;
        JOptionPane.showMessageDialog(null, mssg);
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Masukkan Angka !!!");
        }
    }
    public static void main(String[] args) {
    
   nomor1();
   //nomor2();
    }
    
}
