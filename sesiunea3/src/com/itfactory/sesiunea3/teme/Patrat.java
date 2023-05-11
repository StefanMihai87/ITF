package com.itfactory.sesiunea3.teme;

public class Patrat {
    private int latura;

    public Patrat(int latura)
    {
        this.latura = latura;
    }

    public int getPerimetru()
    {
        return this.latura * 4;
    }

    public int getArie()
    {
        return this.latura * this.latura;
    }
}
