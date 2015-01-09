/**
 * Omschrijft hoe een persoon met pinpas kan betalen.
 * 
 * @author Frank Noorlander en Rick van der Poel
 * @version 1.1 (08/01/2015)
 */
public class Pinpas extends Betaalwijze {
    private double kredietlimiet;
    
    /**
    * Methode om kredietlimiet te zetten
    * @param kredietlimiet
    */
    public void setKredietLimiet(double kredietlimiet) 
    {
        this.kredietlimiet = kredietlimiet;
    }
    
    /**
    * Methode om betaling af te handelen
    * @throws TeWeinigGeldException Als er te weinig geld is om te betalen.
    */
    public void betaal(double tebetalen) throws TeWeinigGeldException 
    {
        if(kredietlimiet <= saldo - tebetalen) {
            saldo -= tebetalen;
            return;
        }
        throw new TeWeinigGeldException("heeft niet genoeg salso op de pinpas om te betalen."); 
    }
}