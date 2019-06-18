package com.example.copaamerica2019;

public class Equipos {
    private String Grupo;
    private String Equipo1;
    private String Equipo2;
    private String Equipo3;
    private String Equipo4;
    private String Puntos1;
    private String Puntos2;
    private String Puntos3;
    private String Puntos4;

    public Equipos() {
    }

    public Equipos(String grupo, String equipo1, String equipo2, String equipo3, String equipo4, String puntos1, String puntos2, String puntos3, String puntos4) {
        Grupo = grupo;
        Equipo1 = equipo1;
        Equipo2 = equipo2;
        Equipo3 = equipo3;
        Equipo4 = equipo4;
        Puntos1 = puntos1;
        Puntos2 = puntos2;
        Puntos3 = puntos3;
        Puntos4 = puntos4;
    }
    //Getter

    public String getGrupo() {
        return Grupo;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public String getEquipo3() {
        return Equipo3;
    }

    public String getEquipo4() {
        return Equipo4;
    }

    public String getPuntos1() {
        return Puntos1;
    }

    public String getPuntos2() {
        return Puntos2;
    }

    public String getPuntos3() {
        return Puntos3;
    }

    public String getPuntos4() {
        return Puntos4;
    }
    //Setter

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public void setEquipo1(String equipo1) {
        Equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        Equipo2 = equipo2;
    }

    public void setEquipo3(String equipo3) {
        Equipo3 = equipo3;
    }

    public void setEquipo4(String equipo4) {
        Equipo4 = equipo4;
    }

    public void setPuntos1(String puntos1) {
        Puntos1 = puntos1;
    }

    public void setPuntos2(String puntos2) {
        Puntos2 = puntos2;
    }

    public void setPuntos3(String puntos3) {
        Puntos3 = puntos3;
    }

    public void setPuntos4(String puntos4) {
        Puntos4 = puntos4;
    }
}

