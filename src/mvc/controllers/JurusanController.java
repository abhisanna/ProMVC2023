/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.controllers;

import java.util.ArrayList;
import mvc.daos.JurusanDAO;
import mvc.models.CRUD;
import mvc.models.Jurusan;

/**
 *
 * @author abhisanna
 */
public class JurusanController {
    private JurusanDAO dao = new JurusanDAO();
    private CRUD crud;
    
    public void setDAO(JurusanDAO j) {
        dao = j;
    }
    
    public void setDml(Jurusan j, CRUD c) {
        boolean hasil = false;
        this.crud = c;
        
        switch(c) {
            case INPUT: hasil = dao.insert(j);
            break;
            case UBAH: hasil = dao.update(j);
            break;
            case HAPUS: hasil = dao.delete(j);
            break;
        }
    }
    
    public CRUD getCrudState() {
        return crud;
    }
    
    public ArrayList<Jurusan> ambilSemuaDataJurusan() {
        return dao.ambilDataJurusan();
    }
}
