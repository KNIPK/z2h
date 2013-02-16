/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Krolowa extends Figura{

    public Krolowa(KolorGracza kolor) {
        super(kolor);
    }

    @Override
    public NazwaFigur jakaJestesFigura() {
        return NazwaFigur.KROLOWA;
    }
        @Override
    public String toString() {
        if (this.kolor == KolorGracza.BIALY) {
            return "_KROLOWA_";    
        } else {
            return "^KROLOWA^";    
        }
        
    }
}
