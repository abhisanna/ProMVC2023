/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.models.Jurusan;
/**
 *
 * @author abhisanna
 */
public class JurusanDAO {
    public boolean insert(Jurusan j) {
        String sql = "INSERT INTO tjurusan VALUES(?, ?)";
        try {
            PreparedStatement stat = Koneksi.bukaKoneksi().prepareStatement(sql);
            stat.setString(1, j.getKodeJur());
            stat.setString(2, j.getNamaJur());
            int row = stat.executeUpdate();
            if(row > 0) {
                return true;
            }
            
            stat.close();
        } catch(Exception e) {
            Logger.getLogger(Jurusan.class.getName()).log(Level.SEVERE,null, e);
        }
        
        return false;
    }
    
    public boolean update(Jurusan j) {
        String sql = "UPDATE tjurusan SET namaJur=? WHERE kodeJur=?";
        try {
            PreparedStatement stat = Koneksi.bukaKoneksi().prepareStatement(sql);
            stat.setString(1, j.getNamaJur());
            stat.setString(2, j.getKodeJur());
            
            int row = stat.executeUpdate();
            stat.close();
        } catch(Exception e) {
            Logger.getLogger(Jurusan.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return false;
    }
    
    public boolean delete(Jurusan j) {
        String sql = "DELETE FROM tJurusan WHERE KodeJur=?";
        try {
            PreparedStatement statement = Koneksi.bukaKoneksi().prepareStatement(sql);
            statement.setString(1, j.getKodeJur());
            int row = statement.executeUpdate();
            statement.close();
        } catch(Exception e) {
            Logger.getLogger(Jurusan.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public ArrayList<Jurusan> ambilDataJurusan() {
        ArrayList<Jurusan> dataJurusan = new ArrayList<Jurusan>();
        String sql = "SELECT * FROM tjurusan";
        try {
            if(Koneksi.bukaKoneksi() == null) {
                return null;
            } else {
                PreparedStatement stat = Koneksi.bukaKoneksi().prepareStatement(sql);
                ResultSet rs = stat.executeQuery();
                while(rs.next()) {
                   Jurusan j = new Jurusan(rs.getString(1), rs.getString(2));
                   dataJurusan.add(j);
                }
                stat.close();
            }
        } catch(Exception e) {
            Logger.getLogger(Jurusan.class.getName()).log(Level.SEVERE, null, e);
        }
        return dataJurusan;
    }
}
