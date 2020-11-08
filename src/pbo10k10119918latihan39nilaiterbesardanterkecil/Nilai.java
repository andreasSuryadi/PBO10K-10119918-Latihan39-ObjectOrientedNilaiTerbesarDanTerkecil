/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan39nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Nilai {
    Scanner scanner = new Scanner(System.in);
    private int nilaiMahasiswa[];
    private int nilaiTerkecil = 0, nilaiTerbesar = 0;
    
    private void tampilHasilNilaiMahasiswa (int parBanyakMahasiswa) {
        for (int i = 0; i < parBanyakMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }
    }
    
    private int nilaiTerkecilMahasiswa (int parNilaiMahasiswa[], int parBanyakMahasiswa) {
        nilaiTerkecil = parNilaiMahasiswa[0];
        for (int i = 0; i < parBanyakMahasiswa; i++) {
            if (parNilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = parNilaiMahasiswa[i];
            }
        }
        
        return nilaiTerkecil;
    }
    
    private int nilaiTerbesarMahasiswa (int parNilaiMahasiswa[], int parBanyakMahasiswa) {
        for (int i = 0; i < parBanyakMahasiswa; i++) {
            if (parNilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = parNilaiMahasiswa[i];
            }
        }
        
        return nilaiTerbesar;
    }
    
    public void hasilNilaiTerkecilDanTerbesarMahasiswa (String parNamaPetugas, int parBanyakMahasiswa) {
        nilaiMahasiswa = new int[parBanyakMahasiswa];
        for (int i = 0; i < parBanyakMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        
        System.out.println();
        
        this.tampilHasilNilaiMahasiswa(parBanyakMahasiswa);
        nilaiTerkecil = this.nilaiTerkecilMahasiswa(nilaiMahasiswa, parBanyakMahasiswa);
        nilaiTerbesar = this.nilaiTerbesarMahasiswa(nilaiMahasiswa, parBanyakMahasiswa);
        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + parNamaPetugas);
    }
}
