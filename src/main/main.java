/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import crud.crud;
import java.util.Scanner;
/**
 *
 * @author munn
 */
public class main {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        crud myObject = new crud();
        
//        Input Simpan
        // Tabel pasien
//        System.out.println("Masukkan ID Pasien:");
//        int id_Pasien = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character
//
//        System.out.println("Masukkan Nama Email:");
//        String nm_email = scanner.nextLine();
//
//        System.out.println("Masukkan Jenis Kelamin:");
//        String kelamin = scanner.nextLine();
//
//        System.out.println("Masukkan Alamat:");
//        String alamat = scanner.nextLine();
//
//        System.out.println("Masukkan Nama:");
//        String nama_pasien = scanner.nextLine();
//
//        System.out.println("Masukkan Password:");
//        String password = scanner.nextLine();
//        
//        myObject.Simpan_pasien(id_Pasien, nm_email, kelamin, alamat, nama_pasien, password);
//        
//        //tabel penyakit
//        System.out.println("Masukkan Kode Penyakit:");
//        int kd_penyakit = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character
//
//        System.out.println("Masukkan Nama Penyakit:");
//        String nm_penyakit = scanner.nextLine();
//
//        System.out.println("Masukkan Definisi:");
//        String definisi = scanner.nextLine();
//
//        System.out.println("Masukkan Solusit:");
//        String solusi = scanner.nextLine();
//
//        myObject.Simpan_penyakit(kd_penyakit, nm_penyakit, definisi, solusi);
//        
//        // tabel gejala
//        System.out.println("Masukkan Kode Gejala:");
//        int kd_gejala = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character
//
//        System.out.println("Masukkan Nama Gejala:");
//        String nm_gejala = scanner.nextLine();
//
//
//        myObject.Simpan_gejala(kd_penyakit, nm_penyakit);
//        
//        //tabel Forum
//        System.out.println("Masukkan Nama:");
//        String nama = scanner.nextLine();
//
//        System.out.println("Masukkan Email:");
//        String email = scanner.nextLine();
//
//        System.out.println("Masukkan Topik:");
//        String topik = scanner.nextLine();
//
//        System.out.println("Masukkan Isi:");
//        String isi = scanner.nextLine();
//
//        System.out.println("Masukkan id_replay :");
//        String id_replay = scanner.nextLine();
//        
//        System.out.println("Masukkan Tanggal:");
//        String tanggal = scanner.nextLine();
//        
//
//         myObject.Simpan_forum(nama, email, topik, isi, id_replay, tanggal);
//         
//         input Update

//        System.out.println("Masukkan ID Pasien:");
//        int id_Pasien = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character
//
//        System.out.println("Masukkan Nama Email:");
//        String nm_email = scanner.nextLine();
//
//        System.out.println("Masukkan Jenis Kelamin:");
//        String kelamin = scanner.nextLine();
//
//        System.out.println("Masukkan Alamat:");
//        String alamat = scanner.nextLine();
//
//        System.out.println("Masukkan Nama:");
//        String nama_pasien = scanner.nextLine();
//
//        System.out.println("Masukkan Password:");
//        String password = scanner.nextLine();
//        
//        myObject.Ubah_pasien(id_Pasien, nm_email, kelamin, alamat, nama_pasien, password);
//        
        //tabel penyakit
//        System.out.println("Masukkan Kode Penyakit:");
//        int kd_penyakit = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character
//
//        System.out.println("Masukkan Nama Penyakit:");
//        String nm_penyakit = scanner.nextLine();
//
//        System.out.println("Masukkan Definisi:");
//        String definisi = scanner.nextLine();
//
//        System.out.println("Masukkan Solusit:");
//        String solusi = scanner.nextLine();
//
//        myObject.Ubah_penyakit(kd_penyakit, nm_penyakit, definisi, solusi);
//        
//        // tabel gejala
//        System.out.println("Masukkan Kode Gejala:");
//        int kd_gejala = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character
//
//        System.out.println("Masukkan Nama Gejala:");
//        String nm_gejala = scanner.nextLine();
//
//
//        myObject.Ubah_gejala(kd_penyakit, nm_penyakit);
//        
//        //tabel Forum
//        
//        System.out.println("Masukkan Nama:");
//        String nama = scanner.nextLine();
//
//        System.out.println("Masukkan Email:");
//        String email = scanner.nextLine();
//
//        System.out.println("Masukkan Topik:");
//        String topik = scanner.nextLine();
//
//        System.out.println("Masukkan Isi:");
//        String isi = scanner.nextLine();
//
//        System.out.println("Masukkan id_replay :");
//        String id_replay = scanner.nextLine();
//        
//        System.out.println("Masukkan Tanggal:");
//        String tanggal = scanner.nextLine();
//        
//
//         myObject.Ubah_forum( nama, email, topik, isi, id_replay, tanggal);
         


//         input Delete

        // Tabel pasien
        System.out.println("Masukkan ID Pasien:");
        int id_Pasien = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        
        myObject.Hapus_pasien(id_Pasien);
        
        //tabel penyakit
        System.out.println("Masukkan Kode Penyakit:");
        int kd_penyakit = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        myObject.Hapus_penyakit(kd_penyakit);
        
        // tabel gejala
        System.out.println("Masukkan Kode Gejala:");
        int kd_gejala = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        myObject.Hapus_gejala(kd_gejala);
        
        //tabel Forum
        System.out.println("Masukkan id_replay :");
        String id_replay = scanner.nextLine();

         myObject.Hapus_forum(id_replay);
    }
    
}
