/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Krol extends Figura {

    public Krol(KolorGracza kolor) {
        super(kolor);
    }

    @Override
    public NazwaFigur jakaJestesFigura() {
        return NazwaFigur.KROL;
    }

    @Override
    public String toString() {
        if (this.kolor == KolorGracza.BIALY) {
            return "___KROL__";
        } else {
            return "^^^KROL^^";
        }

    }
}
