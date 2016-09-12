/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sony
 */
public class Complejo {

    private int real;
    private int imaginario;

    public Complejo(int real, int imaginario) {
        this.imaginario = imaginario;
        this.real = real;

    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }

    public Complejo sumar(Complejo c2) {
        Complejo c;
        int real, imag;

        real = this.real + c2.real;
        imag = this.imaginario + c2.imaginario;

        c = new Complejo(real, imag);
        return c;
    }

    public Complejo restar(Complejo c2) {
        Complejo c;
        int real, imag;

        real = this.real - c2.real;
        imag = this.imaginario - c2.imaginario;

        c = new Complejo(real, imag);
        return c;
    }

    public Complejo multiplicar(Complejo c2) {
        Complejo c;
        int real, imag,r1,r2,i1,i2;

        r1=(this.real * c2.real) ;
        i1= (this.real * c2.imaginario);
        i2= (this.imaginario * c2.real);
        r2= (this.imaginario * c2.imaginario);
        
        
        real = r1-r2;
        imag = i1+i2;

        c = new Complejo(real, imag);
        return c;
    }

    public Complejo dividir(Complejo c2) {
        Complejo c;
        int real,imag,n1,n2,n3,n4,po,po2;
        
        
        n1=this.real * c2.real;
        n2=this.real * c2.imaginario;
        n3=this.imaginario * c2.real;
        n4=this.imaginario * c2.imaginario;
        po=(c2.real*c2.real) + (c2.imaginario*c2.imaginario);
        
        real=(n1-n4)/po;
        imag=(n2+n3)/po;
        
        c = new Complejo(real, imag);
        return c;
    }
    
}
