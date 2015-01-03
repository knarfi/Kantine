
/**
 * Omschrijft hoe een persoon contant kan betalen.
 * 
 * @author Frank Noorlander
 * @version 1.0 (30/12/2014)
 */
public class Contant extends Betaalwijze {
    /**
    * Methode om betaling af te handelen
    */
    public boolean betaal(double tebetalen) {
        if(saldo >= tebetalen) {
            saldo -= tebetalen;
            return true;
        } else {
            return false;
        }
    }
}