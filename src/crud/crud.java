/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author munn
 */
public class crud {
    private String database_name = "ikan_lele";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static PreparedStatement preparedStatement;
    
    
    
    public crud(){
        try {
            String lokasi = "jdbc:mysql://localhost/" + database_name;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {            
            System.out.println(e.getMessage());
        }
    }
    
     // Methods for Pasien
    public void Simpan_pasien(int id_pasien, String nm_email, String kelamin, String alamat, String nama_pasien, String password) {
        try {
            String sql = "INSERT INTO pasien (id_pasien, nm_email, kelamin, alamat, nama_pasien, password) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, id_pasien);
            perintah.setString(2, nm_email);
            perintah.setString(3, kelamin);
            perintah.setString(4, alamat);
            perintah.setString(5, nama_pasien);
            perintah.setString(6, password);
            perintah.execute();
            System.out.println("Data pasien berhasil disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Ubah_pasien(int id_pasien, String nm_email, String kelamin, String alamat, String nama_pasien, String password) {
        try {
            String sql = "UPDATE pasien SET nm_email = ?, kelamin = ?, alamat = ?, nama_pasien = ?, password = ? WHERE id_pasien = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nm_email);
            perintah.setString(2, kelamin);
            perintah.setString(3, alamat);
            perintah.setString(4, nama_pasien);
            perintah.setString(5, password);
            perintah.setInt(6, id_pasien);
            perintah.execute();
            System.out.println("Data pasien berhasil diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Hapus_pasien(int id_pasien) {
        try {
            String sql = "DELETE FROM pasien WHERE id_pasien = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, id_pasien);
            perintah.execute();
            System.out.println("Data pasien berhasil dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Methods for Penyakit
    public void Simpan_penyakit(int kd_penyakit, String nm_penyakit, String definisi, String solusi) {
        try {
            String sql = "INSERT INTO penyakit (kd_penyakit, nm_penyakit, definisi, solusi) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_penyakit);
            perintah.setString(2, nm_penyakit);
            perintah.setString(3, definisi);
            perintah.setString(4, solusi);
            perintah.execute();
            System.out.println("Data penyakit berhasil disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Ubah_penyakit(int kd_penyakit, String nm_penyakit, String definisi, String solusi) {
        try {
            String sql = "UPDATE penyakit SET nm_penyakit = ?, definisi = ?, solusi = ? WHERE kd_penyakit = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nm_penyakit);
            perintah.setString(2, definisi);
            perintah.setString(3, solusi);
            perintah.setInt(4, kd_penyakit);
            perintah.execute();
            System.out.println("Data penyakit berhasil diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Hapus_penyakit(int kd_penyakit) {
        try {
            String sql = "DELETE FROM penyakit WHERE kd_penyakit = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_penyakit);
            perintah.execute();
            System.out.println("Data penyakit berhasil dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Methods for Gejala
    public void Simpan_gejala(int kd_gejala, String nm_gejala) {
        try {
            String sql = "INSERT INTO gejala (kd_gejala, nm_gejala) VALUES (?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_gejala);
            perintah.setString(2, nm_gejala);
            perintah.execute();
            System.out.println("Data gejala berhasil disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Ubah_gejala(int kd_gejala, String nm_gejala) {
        try {
            String sql = "UPDATE gejala SET nm_gejala = ? WHERE kd_gejala = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nm_gejala);
            perintah.setInt(2, kd_gejala);
            perintah.execute();
            System.out.println("Data gejala berhasil diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Hapus_gejala(int kd_gejala) {
        try {
            String sql = "DELETE FROM gejala WHERE kd_gejala = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_gejala);
            perintah.execute();
            System.out.println("Data gejala berhasil dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Methods for Forum
    public void Simpan_forum(String nama, String email, String topik, String isi, String id_replay, String tanggal) {
        try {
            String sql = "INSERT INTO forum (nama, email, topik, isi, id_replay, tanggal) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, email);
            perintah.setString(3, topik);
            perintah.setString(4, isi);
            perintah.setString(5, id_replay);
            perintah.setString(6, tanggal);
            perintah.execute();
            System.out.println("Data forum berhasil disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Ubah_forum(String nama, String email, String topik, String isi, String id_replay, String tanggal) {
        try {
            String sql = "UPDATE forum SET nama = ?, email = ?, topik = ?, isi = ?, id_replay = ?, tanggal = ? WHERE id_replay = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, email);
            perintah.setString(3, topik);
            perintah.setString(4, isi);
            perintah.setString(5, tanggal);
            perintah.setString(6, id_replay);
            perintah.execute();
            System.out.println("Data forum berhasil diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Hapus_forum(String id_replay) {
        try {
            String sql = "DELETE FROM forum WHERE id_pasien = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, id_replay);
            perintah.execute();
            System.out.println("Data forum berhasil dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan_pasien_dan_forum(int id_pasien, String nm_email, String kelamin, String alamat, String nama_pasien, String password, String email, String topik, String isi, String id_replay, String tanggal) {
        try {
            koneksiDB.setAutoCommit(false); // Disable auto-commit to start transaction

            // Insert into pasien
            Simpan_pasien(id_pasien, nm_email, kelamin, alamat, nama_pasien, password);

            // Insert into forum
            Simpan_forum(nama_pasien, email, topik, isi, id_replay, tanggal);

            koneksiDB.commit(); // Commit transaction
            System.out.println("Data pasien dan forum berhasil disimpan");

        } catch (SQLException e) {
            try {
                koneksiDB.rollback(); // Rollback transaction on error
                System.out.println("Transaction rolled back: " + e.getMessage());
            } catch (SQLException rollbackException) {
                System.out.println("Error during rollback: " + rollbackException.getMessage());
            }
        } finally {
            try {
                koneksiDB.setAutoCommit(true); // Re-enable auto-commit after transaction
            } catch (SQLException finalException) {
                System.out.println("Error re-enabling auto-commit: " + finalException.getMessage());
            }
        }
    }
}
