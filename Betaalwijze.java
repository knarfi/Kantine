
/**
 * Superclass voor verschillende betaalwijzen.
 * 
 * @author Frank Noorlander en Rick van der Poel
 * @version 1.1 (08/01/2015)
 */
public abstract class Betaalwijze {
    protected double saldo;
    
    /**
    * Methode om krediet te initialiseren
    * @param krediet
    */
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    /**
    * Methode om betaling af te handelen
    * @param tebetalen
    * @return Boolean om te kijken of er voldoende saldo is
    * @throws TeWeinigGeldException Als er te weinig geld is om te betalen.
    */
    public abstract void betaal(double tebetalen) throws TeWeinigGeldException;
}