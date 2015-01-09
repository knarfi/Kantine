import java.util.Iterator;

/**
 * Deze klasse bevat informatie over hoe de kassa werkt. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 08-01-2015
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
     * laat de persoon betalen
     * @param persoon die moet afrekenen
     * @throws TeWeinigGeldException Als er te weinig geld is om te betalen.
     */
    public void rekenAf(Persoon persoon) {
        artikelenAfgerekend += artikelenOpDienblad(persoon);
        Betaalwijze betaalwijze = persoon.getBetaalwijze();
        double teBetalen = totaalPrijsDienblad(persoon);
        if(persoon instanceof KortingskaartHouder){
            double korting = teBetalen * (((KortingskaartHouder)persoon).geefKortingsPercentage() * 0.01);
            if(((KortingskaartHouder)persoon).heeftMaximum()){
                if(korting > ((KortingskaartHouder)persoon).geefMaximum()){
                    korting = ((KortingskaartHouder)persoon).geefMaximum();
                }
            }
            teBetalen -= korting;
        }
        
        try {
            betaalwijze.betaal(teBetalen);
            
            geldInKassa += totaalPrijsDienblad(persoon);
            System.out.println(persoon.getVoornaam() + " " + persoon.getAchternaam() + " heeft betaald en verlaat de kantine");
        }
        catch(TeWeinigGeldException e) {
            System.out.println(persoon.getVoornaam() + " " + persoon.getAchternaam() + " " + e.getFoutmelding());
        }
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
    
    /**
     * geeft het aantal artikelen op het dienblad van de persoon
     * 
     * @return  aantal artikelen
     */
    public int artikelenOpDienblad(Persoon persoon){
        Iterator artikelen = persoon.getDienblad().getArtikelen();
        int aantal = 0;
        while(artikelen.hasNext()){
            aantal++;
            artikelen.next();
        }
        
        return aantal;
    }
    
    /**
     * geeft de totaalprijs van de artikelen op het dienblad van de persoon
     * 
     * @return  totaalprijs van dienblad
     */
    public double totaalPrijsDienblad(Persoon persoon){
        Iterator<Artikel> artikelen = persoon.getDienblad().getArtikelen();
        double totaal = 0;
        for( ; artikelen.hasNext(); ){
            totaal += artikelen.next().getPrijs();
        }
        
        return totaal;
    }
}

