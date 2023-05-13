package com.itfactory.workshop3.problema6;

public class Persoane {
    private int id;
    private String nume;

    public Persoane(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }


    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
