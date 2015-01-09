
/**
 * Omschrijft hoe een persoon contant kan betalen.
 * 
 * @author Frank Noorlander en Rick van der Poel
 * @version 1.1 (08/01/2015)
 */
public class Contant extends Betaalwijze {
    /**
    * Methode om betaling af te handelen
    * @throws TeWeinigGeldException Als er te weinig geld is om te betalen.
    */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if(saldo >= tebetalen) {
            saldo -= tebetalen;
            return;
        }
        throw new TeWeinigGeldException("heeft niet genoeg contant geld om te betalen.");
    }
}