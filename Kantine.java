/**
 * Deze klasse bevat informatie over hoe de kantine werkt. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 1/12/2014
 */

public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    
    /**
     * Maakt een kantine instantie aan met een KassaRij en een Kassa. 
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }
    
    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats 
     * deze op het dienblad.   
     * Tenslotte sluit de Persoon zich aan bij de rij 
     * voor de kassa.
     */
    public void loopPakSluitAan() {
        Dienblad dienblad = new Dienblad();
        Artikel aardappel = new Artikel("aardappel", 2.68);
        Artikel worst = new Artikel("worst", 5.00);
        Persoon rick = new Persoon(2321890, "Rick", "van der Poel", 31, 7, 1989, 'm');
        
        dienblad.voegToe(aardappel);
        dienblad.voegToe(worst);
        
        rick.pakDienblad(dienblad);
        kassarij.sluitAchteraan(rick);
    }
    
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        // Gebruik de erIsEenRij methode van de class 'KassaRij'.
        while(kassarij.erIsEenRij()) {
            // Gebruik de rekenAf methode van de class 'Kassa' en de eerstePersoonInRij methode van de class 'KassaRij'. 
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }
    
    /**
     * Geeft de kassa die in de kantine staat
     * @return  kassa object
     */
    public Kassa getKassa(){
        return kassa;
    }
}
