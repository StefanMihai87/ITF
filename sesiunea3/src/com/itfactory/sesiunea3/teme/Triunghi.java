package com.itfactory.sesiunea3.teme;

public class Triunghi {
    private int latura1;
    private int latura2;
    private int latura3;

    public Triunghi(int latura1, int latura2, int latura3)
    {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public int getPerimetru()
    {
        return this.latura1 + this.latura2 + this.latura3;
    }
}
