/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.models;

/**
 *
 * @author abhisanna
 */
public class Jurusan {
    private String kodeJur;
    private String namaJur;
    
    public Jurusan(String kodeJur, String namaJur) {
        this.kodeJur = kodeJur;
        this.namaJur = namaJur;
    }
    
    public Jurusan(String kodeJur) {
        this.kodeJur = kodeJur;
    }

    public String getKodeJur() {
        return kodeJur;
    }

    public void setKodeJur(String kodeJur) {
        this.kodeJur = kodeJur;
    }

    public String getNamaJur() {
        return namaJur;
    }

    public void setNamaJur(String namaJur) {
        this.namaJur = namaJur;
    }
    
    @Override
    public String toString() {
        return this.namaJur;
    }
}