package pbo;

import java.util.Scanner;

public class Zakat {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("Nama\t: Muh Bayu Adjie Nugroh");
        System.out.println("NIM\t: 23533779");
        System.out.println("=========================================\n");
//        Deklarasi nisab berdasarkan harga emas 85 gram
        double harga_emas = 1483000;
        double nisab = 85 * harga_emas;
        
//        Deklarasi variabel untuk mengambil input dan menentukan jml zakat
        double harta, jml_zakat;
        double zakat = 0.025;
        
//        Membuat scanner baru untuk mengambil input keyboard dari user
        Scanner keyboard = new Scanner(System.in);
        
//        Deklarasi variabel untuk melakukan perulangan
        String ulang;
        
//Melakukan perulangan do while
        do{
//        Statement untuk memasukan jumlah harta
            System.out.println("=========================================\n");
            System.out.print("Masukan total Harta anda(Dalam bentuk uang): Rp.");
            harta = keyboard.nextDouble();
            
//        Melakukan pengecekan wajib zakat mal1
            if ( harta >= nisab){
                jml_zakat = harta*zakat;
                System.out.println("Total zakat yang harus dikeluarkan adalah: Rp." + jml_zakat);

            } else {
                System.out.println("Anda tidak wajib melakukan zakat mal");
            }
            System.out.println("\n=========================================\n");
            
//            Melakukan konfirmasi untuk mengulangi program
            System.out.println("Y/N");
            System.out.println("Apakah anda ingin melakukan pengecekan zakat lagi?: ");
            ulang = keyboard.next();
           
        }while(ulang.equalsIgnoreCase("Y"));
        
        System.out.println("\n-----Anda telah keluar dari program-----");
    }
}
