/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.controllers;

import java.util.List;
import mvc.daos.MahasiswaDAO;
import mvc.models.CRUD;
import mvc.models.Mahasiswa;

/**
 *
 * @author abhisanna
 */
public class MahasiswaController {
    private MahasiswaDAO dao = new MahasiswaDAO();
    private CRUD crud;
    public void setDAO(MahasiswaDAO m) {
        dao = m;
    }
    
    public void setDml(Mahasiswa mhs, CRUD crud) {
        boolean hasil = false;
        this.crud = crud;
        
        switch(crud) {
            
        }
    }
    
    public CRUD getCrudState() {
        return crud;
    }
    
    public List<Mahasiswa>ambilSemuaDataMahasiswa() {
        return dao.getAllMahasiswa();
    }
}