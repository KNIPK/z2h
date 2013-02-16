/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public abstract class Figura {
    KolorGracza kolor;
    
    public Figura(KolorGracza kolor){
        this.kolor = kolor;
    }
    
    abstract public NazwaFigur jakaJestesFigura();
    
}
