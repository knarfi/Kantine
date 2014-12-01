import java.util.LinkedList;

/**
 * Deze klasse bevat informatie over hoe de kassa-rij wordt verwerk. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 29-11-2014
 */

public class KassaRij {
    // Velden
    private LinkedList<Persoon> personen;
        
    /**
     * Maakt een KassaRij instantie aan met een nieuwe personen collectie. 
     */
    public KassaRij() {
        personen = new LinkedList<Persoon>();
    }
    
    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) {
        personen.add(persoon);
    }
    
    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren. 
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        if(erIsEenRij()){
            Persoon eersteInRij = personen.get(0);
            personen.remove(0);
            return eersteInRij;
        } else {
            return null;
        }
    }
    
    /**
     * Methode kijkt of er personen in de rij staan. 
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        return (personen.size() > 0);
    }
}
