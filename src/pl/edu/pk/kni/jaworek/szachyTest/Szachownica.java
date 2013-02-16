/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Szachownica {

    private Figura[][] plansza;

    public Szachownica() {
        plansza = new Figura[8][8];
        //przyjmijmy ze pierwszą wspolrzedna zawsze bedzie cyfra, druga litera
        plansza[1][0] = new Pionek(KolorGracza.BIALY);
        plansza[1][1] = new Pionek(KolorGracza.BIALY);
        plansza[1][2] = new Pionek(KolorGracza.BIALY);
        plansza[1][3] = new Pionek(KolorGracza.BIALY);
        plansza[1][4] = new Pionek(KolorGracza.BIALY);
        plansza[1][5] = new Pionek(KolorGracza.BIALY);
        plansza[1][6] = new Pionek(KolorGracza.BIALY);
        plansza[1][7] = new Pionek(KolorGracza.BIALY);

        plansza[0][0] = new Wieza(KolorGracza.BIALY);
        plansza[0][1] = new Kon(KolorGracza.BIALY);
        plansza[0][2] = new Laufer(KolorGracza.BIALY);
        plansza[0][3] = new Krolowa(KolorGracza.BIALY);
        plansza[0][4] = new Krol(KolorGracza.BIALY);
        plansza[0][5] = new Laufer(KolorGracza.BIALY);
        plansza[0][6] = new Kon(KolorGracza.BIALY);
        plansza[0][7] = new Wieza(KolorGracza.BIALY);

        plansza[6][0] = new Pionek(KolorGracza.CZARNY);
        plansza[6][1] = new Pionek(KolorGracza.CZARNY);
        plansza[6][2] = new Pionek(KolorGracza.CZARNY);
        plansza[6][3] = new Pionek(KolorGracza.CZARNY);
        plansza[6][4] = new Pionek(KolorGracza.CZARNY);
        plansza[6][5] = new Pionek(KolorGracza.CZARNY);
        plansza[6][6] = new Pionek(KolorGracza.CZARNY);
        plansza[6][7] = new Pionek(KolorGracza.CZARNY);

        plansza[7][0] = new Wieza(KolorGracza.CZARNY);
        plansza[7][1] = new Kon(KolorGracza.CZARNY);
        plansza[7][2] = new Laufer(KolorGracza.CZARNY);
        plansza[7][4] = new Krolowa(KolorGracza.CZARNY);
        plansza[7][3] = new Krol(KolorGracza.CZARNY);
        plansza[7][5] = new Laufer(KolorGracza.CZARNY);
        plansza[7][6] = new Kon(KolorGracza.CZARNY);
        plansza[7][7] = new Wieza(KolorGracza.CZARNY);

    }

    public void nowaGra() {

        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                plansza[i][j] = null;
            }
        }

        plansza[1][0] = new Pionek(KolorGracza.BIALY);
        plansza[1][1] = new Pionek(KolorGracza.BIALY);
        plansza[1][2] = new Pionek(KolorGracza.BIALY);
        plansza[1][3] = new Pionek(KolorGracza.BIALY);
        plansza[1][4] = new Pionek(KolorGracza.BIALY);
        plansza[1][5] = new Pionek(KolorGracza.BIALY);
        plansza[1][6] = new Pionek(KolorGracza.BIALY);
        plansza[1][7] = new Pionek(KolorGracza.BIALY);

        plansza[0][0] = new Wieza(KolorGracza.BIALY);
        plansza[0][1] = new Kon(KolorGracza.BIALY);
        plansza[0][2] = new Laufer(KolorGracza.BIALY);
        plansza[0][3] = new Krolowa(KolorGracza.BIALY);
        plansza[0][4] = new Krol(KolorGracza.BIALY);
        plansza[0][5] = new Laufer(KolorGracza.BIALY);
        plansza[0][6] = new Kon(KolorGracza.BIALY);
        plansza[0][7] = new Wieza(KolorGracza.BIALY);

        plansza[6][0] = new Pionek(KolorGracza.CZARNY);
        plansza[6][1] = new Pionek(KolorGracza.CZARNY);
        plansza[6][2] = new Pionek(KolorGracza.CZARNY);
        plansza[6][3] = new Pionek(KolorGracza.CZARNY);
        plansza[6][4] = new Pionek(KolorGracza.CZARNY);
        plansza[6][5] = new Pionek(KolorGracza.CZARNY);
        plansza[6][6] = new Pionek(KolorGracza.CZARNY);
        plansza[6][7] = new Pionek(KolorGracza.CZARNY);

        plansza[7][0] = new Wieza(KolorGracza.CZARNY);
        plansza[7][1] = new Kon(KolorGracza.CZARNY);
        plansza[7][2] = new Laufer(KolorGracza.CZARNY);
        plansza[7][4] = new Krolowa(KolorGracza.CZARNY);
        plansza[7][3] = new Krol(KolorGracza.CZARNY);
        plansza[7][5] = new Laufer(KolorGracza.CZARNY);
        plansza[7][6] = new Kon(KolorGracza.CZARNY);
        plansza[7][7] = new Wieza(KolorGracza.CZARNY);
    }

    public Figura ktoryPionekStoiNa(Pole pole) {
        return plansza[pole.getCyfra() - 1][pole.getLitera() - 1];
    }

    @Override
    public String toString() {
        String wynik = new String();
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                if (plansza[7 - i][j] != null) {
                    wynik += plansza[7 - i][j].toString();

                } else {
                    wynik += "        ";
                }
                wynik += "\t";
            }
            wynik += "\n";
        }
        return wynik;
    }

    public void przeniesPionek (Pole z, Pole na) throws Exception {
        if (plansza[na.getCyfra() - 1][na.getLitera() - 1] == null
                || plansza[na.getCyfra() - 1][na.getLitera() - 1].kolor != plansza[z.getCyfra() - 1][z.getLitera() - 1].kolor) {
            plansza[na.getCyfra() - 1][na.getLitera() - 1] = plansza[z.getCyfra() - 1][z.getLitera() - 1];
            plansza[z.getCyfra() - 1][z.getLitera() - 1] = null;
        }
        else{ 
            throw new Exception("Na tym polu stoi twój pionek!");
        }

    }
}
