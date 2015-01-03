/**
 * Omschrijft hoe een persoon met pinpas kan betalen.
 * 
 * @author Frank Noorlander
 * @version 1.0 (30/12/2014)
 */
public class Pinpas extends Betaalwijze {
    private double kredietlimiet;
    
    /**
    * Methode om kredietlimiet te zetten
    * @param kredietlimiet
    */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }
    
    /**
    * Methode om betaling af te handelen
    */
    public boolean betaal(double tebetalen) {
        if(kredietlimiet <= saldo - tebetalen) {
            saldo -= tebetalen;
            return true;
        } else {
            return false;
        }
    }
}