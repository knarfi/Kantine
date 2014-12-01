/**
 * Deze klasse bevat informatie over hoe de kassa werkt. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 29-11-2014
 */

public class Kassa {
    private int aantalArtikelenAfgerekend;
    private double geldInKassa;
    
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        aantalArtikelenAfgerekend = 0;
        geldInKassa = 0;
    }
    
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen 
     * door een echte betaling door de persoon. 
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        aantalArtikelenAfgerekend += persoon.getAantalArtikelen();
        geldInKassa += persoon.getTotaalPrijs();
    }
    
    /**
     * Geeft het aantal artikelen dat de kassa 
     * heeft gepasseerd, 
     * vanaf het moment dat de methode resetWaarden 
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return aantalArtikelenAfgerekend;
    }
    
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa 
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return geldInKassa;
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en 
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        aantalArtikelenAfgerekend = 0;
        geldInKassa = 0;
    }
}

