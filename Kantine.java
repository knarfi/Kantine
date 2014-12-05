/**
 * Deze klasse bevat informatie over hoe de kantine werkt. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 1/12/2014
 */

public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;
    
    /**
     * Maakt een kantine instantie aan met een KassaRij en een Kassa. 
     */
    public Kantine() 
    {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }
    
    /**
     * In deze methode kiest een Persoon met een dienblad
     * de artikelen in artikelnamen.
     * @param persoon
     * @artikelnamen
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelNamen) 
    {
        // Loop tot dat alle producten aan bod zijn geweest.
        for(int i = 0; i < artikelNamen.length; i++ ){ 
            // Maak een artikel met de opgegeven artikelnaam.
            Artikel artikel = kantineAanbod.getArtikel(artikelNamen[i]); 
            
            // Voeg het artikel toe aan het dienblad van het de persoon.
            persoon.pakArtikel(artikel); 
            kantineAanbod.checkHoeveelheid(artikel);
            
            // Sluit de persoon achteraan de kassa rij.
            kassarij.sluitAchteraan(persoon);  
        }
    }
    
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() 
    {
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
    public Kassa getKassa()
    {
        return kassa;
    }
    
    /**
     * Set het aanbod van de kantine. 
     */
    public void setKantineAanbod(KantineAanbod kantineAanbod)
    {
        this.kantineAanbod = kantineAanbod;
    }
    
    
    /**
     * Get het kantineAanbod.
     */
    public KantineAanbod getKantineAanbod()
    {
        return kantineAanbod;
    }
}
