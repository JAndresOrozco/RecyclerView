package com.example.recyclerview;

public class Pais {
    private String nombre;
    private String desc;
    private int foto;

    public Pais(String nombre, String desc, int foto) {
        this.nombre = nombre;
        this.desc = desc;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
