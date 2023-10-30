package dimensao.bidimensional;

public class TrianguloRetangulo
{
    double cateto1, cateto2;
    double hipotenusa, alturaHipotenusa;
    
    public double areaTriangulo()
    {
        return hipotenusa*alturaHipotenusa/2;
    }
    
    public double PerimetroTriangulo()
    {
        return cateto1+cateto2+hipotenusa;
    }

    public TrianguloRetangulo()
    {
        cateto1 = 0;
        cateto2 = 0;
        hipotenusa = 0;
        alturaHipotenusa = 0;
    }

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa)
    {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturaHipotenusa = alturaHipotenusa;
    }

    public void setCateto1(double cateto1)
    {
        this.cateto1 = cateto1;
    }

    public void setCateto2(double cateto2)
    {
        this.cateto2 = cateto2;
    }

    public void setHipotenusa(double hipotenusa)
    {
        this.hipotenusa = hipotenusa;
    }

    public void setAlturaHipotenusa(double alturaHipotenusa)
    {
        this.alturaHipotenusa = alturaHipotenusa;
    }

    public double getCateto1()
    {
        return cateto1;
    }

    public double getCateto2()
    {
        return cateto2;
    }

    public double getHipotenusa()
    {
        return hipotenusa;
    }

    public double getAlturaHipotenusa()
    {
        return alturaHipotenusa;
    }
    
}
