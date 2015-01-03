/**
 * Deze klasse bevat informatie over de docenten die de kantine bezoeken.
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 12-12-2014
 */
public class Docent extends Persoon implements KortingskaartHouder
{
    private String afkorting;
    private String afdeling;
    
    /**
     * Maak een nieuwe docent aan zonder opgegeven waarden. 
     */
    public Docent()
    {
        super();
        setAfkorting("onbekend");
        setAfdeling("onbekend");
    }
    
    /**
     * Maak een nieuwe docent aan met de opgegeven parameters.
     */
    public Docent(int bsn, String voornaam, String achternaam, int geboorteDag, 
                   int geboorteMaand, int geboorteJaar, char geslacht, String afkorting, String afdeling)
    {
        super(bsn, voornaam, achternaam, geboorteDag, geboorteMaand, geboorteJaar, geslacht);
        setAfkorting(afkorting);
        setAfdeling(afdeling);
        
    }
    
    /**
     * Set de afkorting van een docent.
     * @param afkorting afkorting van de docent
     */
    public void setAfkorting(String afkorting)
    {
        this.afkorting = afkorting;
    }
    
    /**
     * Set de afdeling van een docent.
     * @param afdeling bepaal de afdeling van een docent
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    /**
     * Laat de afkorting van een docent zien.
     * @return de afkorting van een docent
     */
    public String getAfkorting()
    {
        return afkorting;
    }
    
    /**
     * Laat de afdeling van een docent zien.
     * @return de afdeling van een docent
     */
    public String getAfdeling()
    {
        return afdeling;
    }
    
    /**
    * geeft alle gegevens zien van de docent in een leuk en gezellig verhaaltje
    * @return   een string met alle gegevens van de docent
    */
    public String toString()
    {
        String details;
        // Haal de persoon gegevens op uit de super klasse en voeg de specieke docent gegevens toe 
        // en print dit uit.
        details  = super.toString();
        details += "Docent afkorting: " + getAfkorting();
        details += "Afdeling: " + getAfdeling();
        return details;
    }
    
    /**
     * geeft het kortingspercentage wat de kantinemedewerker krijgt aan de kassa
     * @return korting
     */
    public double geefKortingsPercentage(){
        return 25.0;
    }
    
    /**
     * kijkt of de kantinemedewerker een maximum kortingsbedrag heeft
     * @return false als er geen kortingsbedrag is en true als er een kortingsbedrag is
     */
    public boolean heeftMaximum(){
        return true;
    }
    
    /**
     * geeft kortingsbedrag van de kantinemederwerk
     * @return kortingsbedrag
     */
    public double geefMaximum(){
        return 1.0;
    }
}
