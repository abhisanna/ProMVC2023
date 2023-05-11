/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.daos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.models.Jurusan;
import mvc.models.Mahasiswa;

/**
 *
 * @author abhisanna
 */
public class MahasiswaDAO {
    public List<Mahasiswa> getAllMahasiswa() {
        ArrayList<Mahasiswa> allMahasiswa = new ArrayList<Mahasiswa>();
        String sql = "SELECT * FROM tmahasiswa inner join " + "tjurusan on tjurusan.kodeJur = tdosen.kodeJur";
        
        try {
            if(Koneksi.bukaKoneksi() == null) {
                return null;
            } else {
                PreparedStatement stat = Koneksi.bukaKoneksi().prepareStatement(sql);
                ResultSet rs = stat.executeQuery();
                
                while(rs.next()) {
                    Mahasiswa d = new Mahasiswa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), new Jurusan(rs.getString(5)));
                    
                    allMahasiswa.add(d);
                }
                stat.close();
            }
        } catch(Exception e) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
        return allMahasiswa;
    }
    
    public boolean insert(Mahasiswa mhs) {
        String sql = "INSERT INTO tmahasiswa VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stat = Koneksi.bukaKoneksi().prepareStatement(sql);
            stat.setString(1, mhs.getNim());
            stat.setString(2, mhs.getNama());
            stat.setString(3, mhs.getJk());
            stat.setInt(4, mhs.getTelepon());
            stat.setString(5, mhs.getJurusan().getKodeJur());
            
            int row = stat.executeUpdate();
            if(row > 0) {
                return true;
            }
            
            stat.close();
        } catch(Exception e) {
            Logger.getLogger(Mahasiswa.class.getName()). log(Level.SEVERE, null, e);
        }
        
        return false;
    }
}
