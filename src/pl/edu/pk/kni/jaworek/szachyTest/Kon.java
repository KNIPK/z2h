/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Kon extends Figura{

    public Kon(KolorGracza kolor) {
        super(kolor);
    }

    @Override
    public NazwaFigur jakaJestesFigura() {
        return NazwaFigur.KON;
    }
    
    @Override
    public String toString() {
        if (this.kolor == KolorGracza.BIALY) {
            return "___KON___";    
        } else {
            return "^^^KON^^^";    
        }
        
    }
    
}
