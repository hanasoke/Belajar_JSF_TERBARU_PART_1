package com.study.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("haloBean")
@RequestScoped
public class HaloBean {

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}