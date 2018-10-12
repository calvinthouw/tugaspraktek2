/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nama,alamat,tp;
        int A,B,C,hp,bayar,k;
        
        System.out.println("-------------------PERHITUNGAN HARGA TIKET PESAWAT-------------------------");
        System.out.print("Masukkan Nama Anda    = ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda  = ");
        alamat = input.nextLine();
        System.out.print("Masukkan Tipe Pesawat = ");
        tp = input.nextLine();
        System.out.print("Bayar                 = ");
        bayar = input.nextInt();
        
        //ketentuan
        if((tp.equals("A"))){
            hp = 5000000;
        }else if((tp.equals("B"))){
            hp = 2000000;
        }else if((tp.equals("C"))){
            hp = 1000000;
        }else{
            hp = 0;
        }

        //output
        k = bayar-hp;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Nama            = "+nama);
        System.out.println("Alamat          = "+alamat);
        System.out.println("kembali         = "+k);
    }
    
}
