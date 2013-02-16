/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Wieza extends Figura{

    public Wieza(KolorGracza kolor) {
        super(kolor);
    }

    @Override
    public NazwaFigur jakaJestesFigura() {
        return NazwaFigur.WIEZA;
    }
    @Override
    public String toString() {
        if (this.kolor == KolorGracza.BIALY) {
            return "____W____";    
        } else {
            return "^^^^W^^^^";    
        }
        
    }
}
