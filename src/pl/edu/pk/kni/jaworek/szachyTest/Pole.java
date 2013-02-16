/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pk.kni.jaworek.szachyTest;

/**
 *
 * @author user
 */
public class Pole {
    public final static int A = 1;
    public final static int B = 2;
    public final static int C = 3;
    public final static int D = 4;
    public final static int E = 5;
    public final static int F = 6;
    public final static int G = 7;
    public final static int H = 8;
    
    int cyfra; 
    int litera;

    public Pole(int cyfra, int litera) {
        this.cyfra = cyfra;
        this.litera = litera;
    }

    public int getCyfra() {
        return cyfra;
    }

    public int getLitera() {
        return litera;
    }
    
    
    
}
