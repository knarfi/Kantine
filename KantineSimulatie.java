/**
 * Deze klasse bevat informatie de simulatie van de kantine.
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 1/12/2014
 */

public class KantineSimulatie {
    private Kantine kantine;
    
    /**
     * Maakt een KantineSimulatie instantie aan.
     */
    public KantineSimulatie() 
    {
        kantine = new Kantine();
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het 
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) 
    {
        double totaal = 0;
        
        // for lus voor dagen
        for(int dag = 1; dag <= dagen; dag++) {
            
            // for lus voor personen
            for(int j = 0; j < 10 + dag; j++){
                kantine.loopPakSluitAan();
            }
            
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            
            // toon dagtotalen (artikelen en geld in kassa)
            System.out.println("Er zijn in dag " + dag + 
                                " " + kantine.aantalArtikelen() + " artikelen verkocht die samen " +
                                " " + kantine.hoeveelheidGeldInKassa() + " euro opleveren."
                                );
            totaal += kantine.hoeveelheidGeldInKassa();
                                
            // reset de kassa voor de volgende dag
            kantine.resetKassa();
        }
        System.out.println("Er is in " + dagen + " dagen " + totaal + " euro verdiend.");
    }
}
