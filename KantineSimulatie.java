import java.util.Random;
import java.text.DecimalFormat;
import java.lang.Math;

/**
 * Deze klasse bevat informatie over de kantineSimulatie.
 * Deze klasse simuleert de werking van een kantine.
 * 
 * @autheur Frank Noorlander & Rick van der Poel
 * @versie 08/12/2014
 */

public class KantineSimulatie {
    // kantine
    private Kantine kantine;
    
    // kantineaanbod
    private KantineAanbod kantineaanbod;
    
    // random generator
    private Random random;
    
    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 6;
    
    // artikelen
    private static final String[] artikelnamen = 
    new String[] {"Koffie", "Broodje hamburger", "Broodje kaas", "Melk", "Water", "Snelle Jelle"};
    
    // prijzen
    private static double[] artikelprijzen =
    new double[]{1.50, 2.10, 1.65, 1.65, 1,00, 2,50};   
    
    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10000;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20000;
    
    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;
    
    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;
    
    /**
     * Constructor
     */
    public KantineSimulatie()
    {
        kantine = new Kantine();
        random = new Random();
        int[] hoeveelheden = getRandomArray(
        AANTAL_ARTIKELEN, MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(artikelnamen, artikelprijzen, 
        hoeveelheden); 
        kantine.setKantineAanbod(kantineaanbod);
    }
    
    /**
     * Methode om een array van random getallen liggend tussen min en max 
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) 
    {
        int[] temp = new int[lengte];
        for(int i = 0; i < lengte; i++) {
            temp[i] = getRandomValue(min, max);
        }
        return temp;
    }
    
    /**
     * Methode om een random getal tussen min(incl) en 
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) 
    {
        return random.nextInt(max-min+1) + min;
    }
    
    /**
     * Methode om op basis van een array van indexen voor de array 
     * artikelnamen de bijhorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) 
    {
        String[] artikelen = new String[indexen.length];
        for(int i = 0; i < indexen.length; i++) { 
            artikelen[i] = artikelnamen[indexen[i]];
        }
        return artikelen;
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het 
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) 
    {
        //zorgt ervoor dat er 2.20 komt en niet 2.2
        DecimalFormat df = new DecimalFormat("#.00");
        int aantalPersonen[] = new int[dagen];
        double dagOmzetten[] = new double[dagen];
        
        // for lus voor dagen
        for(int i = 0; i < dagen; i++) {
            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);
            
            // laat de docenten maar komen...
            for(int j = 0; j < aantalpersonen; j++) {
                // maak persoon en dienblad aan, koppel ze
                Persoon persoon;
                
                int random = getRandomValue(1, 100);
                String typePersoon;
                if (random == 1) {
                    persoon = new KantineMedewerker();
                    typePersoon = "kantinemedewerker";
                }
                else if (random > 1 && random < 12) {
                    persoon = new Docent();
                    typePersoon = "docent";
                }
                else {
                    persoon = new Student();
                    typePersoon = "student";
                }
                System.out.println("Een " + typePersoon + " liep de kantine binnen.");
                
                persoon.pakDienblad(new Dienblad());
                
                // bedenk hoeveel artikelen worden gepakt
                int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);
                
                // genereer de “artikelnummers”, dit zijn indexen 
                // van de artikelnamen array  
                int[] tepakken = getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);
                
                // vind de artikelnamen op basis van 
                // de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);
                
                // loop de kantine binnen, pak de gewenste 
                // artikelen, sluit aan
                kantine.loopPakSluitAan(persoon, artikelen);
            }
            
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            
            // druk de dagtotalen af en hoeveel personen binnen 
            // zijn gekomen
            System.out.println("Dag: " + (i + 1));
            System.out.println("Er zijn vandaag " + aantalpersonen + 
                                " personen gekomen die samen " + df.format(kantine.getKassa().getGeldInKassa()) +
                                " euro aan producten hebben gekocht");
            System.out.println();
            
            aantalPersonen[i] = aantalpersonen;
            dagOmzetten[i] = kantine.getKassa().getGeldInKassa();
            
            // reset de kassa voor de volgende dag
            kantine.getKassa().resetKassa();
        }
        
        System.out.println("Het gemiddeld aantal personen dat er in " + dagen + " dagen per dag is gekomen is " + Math.round(Administratie.berekenGemiddeldAantal(aantalPersonen)) + ".");
        System.out.println("De gemiddelde omzet die in " + dagen + " dagen per dag is gemaakt is " + df.format(Administratie.berekenGemiddeldeOmzet(dagOmzetten)) + " euro.");
        
        int temp = (dagen < Administratie.DAYS_IN_WEEK - 1) ? dagen : Administratie.DAYS_IN_WEEK;
        
        for(int dag = 0; dag < temp; dag++){
            String dagString;
            switch(dag) {
                case 0: dagString = "maandag";
                        break;
                case 1: dagString = "dinsdag";
                        break;
                case 2: dagString = "woensdag";
                        break;
                case 3: dagString = "donderdag";
                        break;
                case 4: dagString = "vrijdag";
                        break;
                case 5: dagString = "zaterdag";
                        break;
                case 6: dagString = "zondag";
                        break;
                default: dagString = "onbekend";
            }
            System.out.println("Voor alle " + dagString + "en is de totale omzet " + df.format(Administratie.berekenDagOmzet(dagOmzetten)[dag]) + " euro.");
        }
    }
}
