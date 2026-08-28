package com.study.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("haloBean")
@RequestScoped
public class HaloBean {

    private String nama;
    private String pesan;

    public void tampilkan() {
        if (nama == null || nama.trim().isEmpty()) {
            pesan = "Silakan masukkan nama.";
        } else {
            pesan = "Halo, " + nama + "!";
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesan() {
        return pesan;
    }
}