/**
 * Deze klasse bevat informatie over de docenten die de kantine bezoeken.
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 12-12-2014
 */
public class Docent extends Persoon
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
    * Laat alle gegevens zien van de docent zien in.
    */
    public void drukAf()
    {
        // Haal de persoon gegevens op uit de super klasse en voeg de specieke docent gegevens toe 
        // en print dit uit.
        super.drukAf();
        System.out.println("Docent afkorting: " + getAfkorting());
        System.out.println("Afdeling: " + getAfdeling());
    }
}
