/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan39nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Mengnampilkan nilai terbesar dan terkecil
 *
 */

public class PBO10K10119918Latihan39NilaiTerbesarDanTerkecil {
    private static int banyaknyaMahasiswa;
    private static String namaPetugas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Nilai nilai = new Nilai();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Jumlah Nilai Mahasiswa : ");
        banyaknyaMahasiswa = scanner.nextInt();
        
        nilai.hasilNilaiTerkecilDanTerbesarMahasiswa(namaPetugas, banyaknyaMahasiswa);
    }
    
}
