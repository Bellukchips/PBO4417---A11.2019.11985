/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author nothing
 */
public class NilaiModel {

    private Integer id_mhs;
    private String nama_mhs;
    private String nama_matkul;
    private Integer semester;
    private Integer sks;
    private Integer uts;
    private Integer uas;
    private Integer rata_rata;

    public Integer getRata_rata() {
        return rata_rata;
    }

    public void setRata_rata(Integer rata_rata) {
        this.rata_rata = rata_rata;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public Integer getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(Integer id_mhs) {
        this.id_mhs = id_mhs;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public Integer getUts() {
        return uts;
    }

    public void setUts(Integer uts) {
        this.uts = uts;
    }

    public Integer getUas() {
        return uas;
    }

    public void setUas(Integer uas) {
        this.uas = uas;
    }
}
