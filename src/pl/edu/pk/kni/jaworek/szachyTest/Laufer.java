/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Laufer extends Figura {

    public Laufer(KolorGracza kolor) {
        super(kolor);
    }

    @Override
    public NazwaFigur jakaJestesFigura() {
        return NazwaFigur.LAUFER;
    }

    @Override
    public String toString() {
        if (this.kolor == KolorGracza.BIALY) {
            return "____L____";
        } else {
            return "^^^^L^^^^";
        }

    }
}
