/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.models;

/**
 *
 * @author abhisanna
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private Jurusan jurusan;
    private String jk;
    private int telepon;
    

    public Mahasiswa(String nim, String nama, String jk, int telepon, Jurusan jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.jk = jk;
        this.telepon = telepon;
    }
    
    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public String getJk() {
        return jk;
    }

    public int getTelepon() {
        return telepon;
    }
}
