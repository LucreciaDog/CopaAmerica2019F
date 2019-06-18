package com.example.copaamerica2019;

public class Jugador {
    private String Nombre;
    private String Numero;
    private String NombreEquipo;
    private int PhotoEquipo;
    private int PhotoEscudo;
    private int PhotoJugador;

    public Jugador() {
    }

    public Jugador(String nombre, String numero, String nombreEquipo, int photoEquipo, int photoEscudo, int photoJugador) {
        Nombre = nombre;
        Numero = numero;
        NombreEquipo = nombreEquipo;
        PhotoEquipo = photoEquipo;
        PhotoEscudo = photoEscudo;
        PhotoJugador = photoJugador;
    }
    //Getter

    public String getNombre() {
        return Nombre;
    }

    public String getNumero() {
        return Numero;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public int getPhotoEquipo() {
        return PhotoEquipo;
    }

    public int getPhotoEscudo() {
        return PhotoEscudo;
    }

    public int getPhotoJugador() {
        return PhotoJugador;
    }
    //Setter

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public void setNombreEquipo(String nombreEquipo) {
        NombreEquipo = nombreEquipo;
    }

    public void setPhotoEquipo(int photoEquipo) {
        PhotoEquipo = photoEquipo;
    }

    public void setPhotoEscudo(int photoEscudo) {
        PhotoEscudo = photoEscudo;
    }

    public void setPhotoJugador(int photoJugador) {
        PhotoJugador = photoJugador;
    }
}
