package com.example.ad2_asm.model;

public class Product {
    private int masp;
    private String tensp;
    private int giaban, soluong;

    public Product(int masp, String tensp, int giaban, int soluong) {
        this.giaban = giaban;
        this.masp = masp;
        this.soluong = soluong;
        this.tensp = tensp;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
}
