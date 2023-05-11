package com.itfactory.sesiunea3.teme;

public class Dreptunghi {
    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime)
    {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getPerimetru()
    {
        return this.lungime * 2 + this.latime * 2;
    }

    public int getArie()
    {
        return this.lungime * this.latime;
    }
}
