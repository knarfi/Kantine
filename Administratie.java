/**
 * Deze klasse leest kassagegevens uit en voert daarmee statische berekeningen uit.
 * Er kan geen instantie van deze klass gemaakt worden.
 * 
 * @author Frank Noorlander 
 * @version 1.0 (12/12/2014)
 */
public class Administratie {
    final static int DAYS_IN_WEEK = 7;
    
    /**
     * maakt een object, doordat de constructor private is kan er geen instantie
     * van Administratie gemaakt worden.
     */
    private Administratie(){
        
    }
    
    /**     
     * Deze methode berekent van de int array aantal de gemiddelde waarde     
     * @param aantal array ints waarvan het gemiddelde berekend moet worden
     * @return het gemiddelde     
     */    
    public static double berekenGemiddeldAantal(int[] aantal) {    
        int totaal = 0;
        int grootte = 0;
        for(int getal: aantal){
            totaal += getal;
            grootte++;
        }
        return  (double) totaal / grootte;
    }
            
    /**     
     * Deze methode berekent van de double array omzet de gemiddelde waarde     
     * @param omzet     
     * @return Het gemiddelde     
     */    
    public static double berekenGemiddeldeOmzet(double[] omzet) {        
        double totaal = 0;
        int grootte = 0;
        for(double getal: omzet){
            totaal += getal;
            grootte++;
        }
        return (double) totaal / grootte;  
    }
    
    /**
     * Methode om totalle dagomzet uit te rekenen van een bepaadle periode. 
     * De teruggegeven string bevat 7 elementen die allemaal een dag voorstellen.
     * @param omzet per dag in een array van doubles
     * @return array (7 elementen) met dagomzetten
     */
    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[DAYS_IN_WEEK];
        int counter = 0;
        for(double dagOmzet : omzet){
            temp[counter] += dagOmzet;
            counter++;
            if(counter == DAYS_IN_WEEK){
                counter = 0;
            }
        }
        return temp;
    }

}