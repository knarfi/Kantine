import java.util.Iterator;

/**
 * Deze klasse bevat informatie over hoe de kassa werkt. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 29-11-2014
 */

public class Kassa {
    private int artikelenAfgerekend;
    private double geldInKassa;
    //private KassaRij kassarij;
    
    /**
     * Maakt een instantie van Kassa waarbij er niks in de kassa zit
     * en er nog geen artikelen afgerekend zijn.
     * @param kassarij 
     */
    public Kassa(KassaRij kassarij) {
        //this.kassarij = kassarij;
        artikelenAfgerekend = 0;
        geldInKassa = 0;
    }
    
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen 
     * door een echte betaling door de persoon. 
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        artikelenAfgerekend += artikelenOpDienblad(persoon);
        geldInKassa += totaalPrijsDienblad(persoon);
    }
    
    /**
     * Geeft het aantal artikelen dat de kassa 
     * heeft gepasseerd, 
     * vanaf het moment dat de methode resetWaarden 
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int getArtikelenAfgerekend() {
        return artikelenAfgerekend;
    }
    
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa 
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double getGeldInKassa() {
        return geldInKassa;
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en 
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        artikelenAfgerekend = 0;
        geldInKassa = 0;
    }
    
    public int artikelenOpDienblad(Persoon persoon){
        Iterator artikelen = persoon.getDienblad().getArtikelen();
        int aantal = 0;
        while(artikelen.hasNext()){
            aantal++;
            artikelen.next();
        }
        
        return aantal;
    }
    
    public double totaalPrijsDienblad(Persoon persoon){
        Iterator<Artikel> artikelen = persoon.getDienblad().getArtikelen();
        double totaal = 0;
        for( ; artikelen.hasNext(); ){
            totaal += artikelen.next().getPrijs();
            artikelen.remove();
        }
        
        return totaal;
    }
}

