import java.util.*;

public class KantineAanbod {
    // interne opslag voorraad
    private HashMap<String, ArrayList<Artikel>> aanbod;
    
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) 
    {
        aanbod = new HashMap<String, ArrayList<Artikel>>();
        for(int i = 0; i < artikelnaam.length; i++) 
        {
            ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
            for(int j = 0; j < hoeveelheid[i]; j++) 
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /**
     * Private methode om de lijst van artikelen te krijgen op basis van de    
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) 
    {
         return aanbod.get(productnaam); 
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken. 
     * Retourneert null als de stapel leeg is.
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) 
    {
        if (stapel == null) { 
            return null;
        }
        if (stapel.size() == 0)
        {
           return null;
        }
        else 
        {
            Artikel a = stapel.get(0);
            stapel.remove(0);
            return a;
        }
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String naam) 
    {
        return getArtikel(getArrayList(naam));
    }
    
    /**
     * Checkt of er van het artikel bijbesteld moet worden op basis van het minimale
     * aantal producten dat er moet zijn
     * @param   artikel artikel dat gechecked moet worden
     */
    public void checkHoeveelheid(Artikel artikel)
    {
        int aanwezig = 0;
        
        //bekijk het hele aanbod
        for(Map.Entry<String , ArrayList<Artikel>> artikelAanbod: aanbod.entrySet()){
            
            //als de naam van het artikel waar we nu zijn gelijk is aan de naam die we zoeken
            if(artikelAanbod.getKey().equals(artikel.getNaam())){
                
                //bekijk hoeveel er nog is van het artikel
                for(Artikel actueelArtikel : artikelAanbod.getValue()){
                    aanwezig++;
                }
            }
        }
        
        //als het aantal aanwezige artikelen lager is dan dat het zou moeten zijn
        if(aanwezig < KantineSimulatie.MIN_ARTIKELEN_PER_SOORT){
            
            //vul het aantal artikelen tot MIN_ARTIKELEN_PER_SOORT + 100 aan
            for(int i = 0; i < 100; i++){
                aanbod.get(artikel.getNaam()).add(new Artikel(artikel.getNaam(), artikel.getPrijs()));
            }
        }
    }
}
