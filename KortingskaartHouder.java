/**
 * Een KortingskaartHouder krijgt korting bij de kassa afhankelijk van de soort persoon.
 * 
 * @author Frank Noorlander
 * @version 1.0 (03/01/2015)
 */
public interface KortingskaartHouder {
    // methode om kortingspercentage op te vragen
    public double geefKortingsPercentage();
    
    // methode om op te vragen of er maximum per keer aan de korting zit
    public boolean heeftMaximum();
    
    // methode om het maximum kortingsbedrag op te vragen
    public double geefMaximum();
}
