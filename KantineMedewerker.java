/**
 * Deze klasse bevat informatie over de kantine medewerkers die werken in de kantine. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 12-12-2014
 */
public class KantineMedewerker extends Persoon
{
    private int medewerkersnummer;
    private boolean magAchterKassa;
    
    /**
     * Maak een nieuwe medewerker aan zonder opgegeven waarden. 
     */
    public KantineMedewerker()
    {
        super();
        setMedewerkersnummer(0); 
        setMagAchterKassa(false); 
        
    }
    
    /**
     * Maak een nieuwe student aan met de opgegeven parameters.
     */
    public KantineMedewerker(int bsn, String voornaam, String achternaam, int geboorteDag, 
                   int geboorteMaand, int geboorteJaar, char geslacht, int medewerkersnummer, boolean magAchterKassa)
    {
        super(bsn, voornaam, achternaam, geboorteDag, geboorteMaand, geboorteJaar, geslacht);
        setMedewerkersnummer(medewerkersnummer); 
        setMagAchterKassa(magAchterKassa); 
        
    }
    
    /**
     * Set de medewerkersnummer van een kassamedewerker.
     * @param medewerkersnummer medewerkersnummer van kassamedewerker 
     */
    public void setMedewerkersnummer(int medewerkersnummer)
    {
        this.medewerkersnummer = medewerkersnummer;
    }
    
    /**
     * Set de medewerkersnummer van een kassamedewerker. 
     * @param magAchterKassa bepaald of een kassamedewerker achter een kassa mag staan of niet
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {
        this.magAchterKassa = magAchterKassa;
    }
    
    /**
     * Laat het medewerkersnummer van een kassamedewerker zien.
     * @return het medewekersnummer van een kassamedewerker
     */
    public int getMedewerkersnummer()
    {
        return medewerkersnummer;
    }
    
    /**
     * Laat zien of de kassamedewerker achter de kassa mag staan
     * @return true als de kassamedewerker achter de kassa mag staan, false als dat niet mag.
     */
    public boolean getMagAchterKassa()
    {
        return magAchterKassa;
    }
    
    /**
    * Laat alle gegevens zien van de kassamedewerker zien.
    */
    public void drukAf()
    {
        String temp = "";
        //Zet de waardes "true" en "false" om in "Ja" en "Nee".
        if(getMagAchterKassa() == true){
            temp = "Ja";
        } else {
            temp = "Nee";
        }
        // Haal de persoon gegevens op uit de super klasse en voeg de specieke kassamedewerker gegevens toe
        // en print dit uit.
        super.drukAf();
        System.out.println("Medewerkersnummer: " + getMedewerkersnummer());
        System.out.println("Mag achter een kassa staan: " + temp);
    }
}
