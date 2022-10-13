import java.net.Socket;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class tugas_pbo{

    static void garis(){
        //perulangan while
        int i=0;
        while ( i <= 10 ){
            System.out.print("===");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args){
        //Tipe data & variabel
        String nama;
        String nim;
        String[] prak = new String[5];
        String[] matkul = new String[5];
        String pilih;
        byte nilai;

        nama="Geraldi Jari Assaji"; //inputan statis

        //array multi dimensi
        String[][] daftar = {{"PEMROGRAMAN ORIENTASI OBJEK","01",},
                            {"SISTEM OPERASI (SO)         ","02"},
                            {"BASIS DATA(BASDAT)        ","03"},
                            {"STATISTIKA INFORMATIKA(SI)     ","04"},
                            {"STRUKTUR DATA(SDATA)           ","05"}};

        //input secara dinamis
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kelas Anda : ");
        String kelas = input.nextLine();
        System.out.println("Nim Anda :");
        nim = input.nextLine();
        garis();

        //output array multidimensi
        System.out.println("NAMA PRAKTIKUM \t\t KODE PRAKTIKUM");
        for(int i=0; i < daftar.length; i++){
            ;
            System.out.print(daftar[i][0]);System.out.print("\t"+daftar[i][1]);
            System.out.println();
        }
        //perulangan for,array
        System.out.println("Masukan Praktikum Anda: ");
        for( int i = 0; i < prak.length; i++ ){
            System.out.print("Praktikum ke-" + i + ": ");
            prak[i] = input.nextLine();
        }
        //output
        System.out.println("Nama: "+nama);
        System.out.println("Kelas: "+kelas);
        System.out.println("NIM: "+nim);
        garis();
        //menampilkan array
        for ( String s : prak){
            System.out.println("Praktikum "+s);
        }
        garis();
        //perulangan do whille
        int i = 1;
        System.out.println("Masukan Mata Kuliah Anda: ");
        do {
            System.out.print("-");
            matkul[i] = input.nextLine();
            i++;
        }
        while (i <= matkul.length);
        //if else
        System.out.print("Input Nilai Terbaik Anda  (0 - 100): ");
        nilai = input.nextByte();
        if (nilai >= 90 ) {
        System.out.println("Okelah Dapet Nilai A");
        }
        else if (nilai >= 80 && nilai < 90) {
        System.out.println("Oke Oke B Lumayan");
        }
        else if (nilai >= 60 && nilai < 80) {
        System.out.println("C, Pas KKM duh");
        }
        else if (nilai >= 40 && nilai < 60) {
        System.out.println("Waduh, dibawah KKM nih");
        }
        else if (nilai < 40) {
        System.out.println("No comment");
        }
        else {
        System.out.println("Maaf anda salah menginputkan nilai");
        }
        }
}

