/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Pionek extends Figura{

    public Pionek(KolorGracza kolor) {
        super(kolor);
    }

    @Override
    public NazwaFigur jakaJestesFigura() {
        return NazwaFigur.PIONEK;
    }

    @Override
    public String toString() {
        if (this.kolor == KolorGracza.BIALY) {
            return "____p____";    
        } else {
            return "^^^^p^^^^";    
        }
        
    }
    
    
    
}
