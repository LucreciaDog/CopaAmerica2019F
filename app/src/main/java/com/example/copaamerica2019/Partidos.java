package com.example.copaamerica2019;

public class Partidos {
    private String Versus;
    private String Marcador;
    private String Estadio;
    private int PhotoBanderaL;
    private int PhotoBanderaV;

    public Partidos() {
    }

    public Partidos(String versus, String marcador, String estadio, int photoBanderaL, int photoBanderaV) {
        Versus = versus;
        Marcador = marcador;
        Estadio = estadio;
        PhotoBanderaL = photoBanderaL;
        PhotoBanderaV = photoBanderaV;
    }
    //Getter

    public String getVersus() {
        return Versus;
    }

    public String getMarcador() {
        return Marcador;
    }

    public String getEstadio() {
        return Estadio;
    }

    public int getPhotoBanderaL() {
        return PhotoBanderaL;
    }

    public int getPhotoBanderaV() {
        return PhotoBanderaV;
    }
    //Setter

    public void setVersus(String versus) {
        Versus = versus;
    }

    public void setMarcador(String marcador) {
        Marcador = marcador;
    }

    public void setEstadio(String estadio) {
        Estadio = estadio;
    }

    public void setPhotoBanderaL(int photoBanderaL) {
        PhotoBanderaL = photoBanderaL;
    }

    public void setPhotoBanderaV(int photoBanderaV) {
        PhotoBanderaV = photoBanderaV;
    }
}
