/**
 * Deze klasse bevat informatie over artikelen in de kantine
 * 
 * @author Frank Noorlander
 * @version 29/11/2014
 */
public class Artikel
{
    // declaratie van variable naam en prijs
    private String naam;
    private double prijs;

    /**
     * Constructor voor de class Artikel, voor elk artikel dat
     * gemaakt wordt moeten de variabel naamArtikel en prijsArtikel
     * worden meegegeven
     */
    public Artikel(String naam, double prijs) 
    {
        // initialisatie van naam en prijs
        setNaam(naam);
        setPrijs(prijs);
    }
    
    /**
     * Constructor voor de class Artikel
     */
    public Artikel() 
    {
        // initialisatie van naam en prijs
        setNaam("onbekend");
        setPrijs(0);
    }

    /**
     * de setter voor naam, heeft een String nodig
     */
    public void setNaam(String naam)
    {
        // initialisatie van naam
        this.naam = naam;
    }
    
    /**
     * de setter voor prijs, heeft een double nodig
     */
    public void setPrijs(double prijs)
    {
        // initialisatie van prijs
        this.prijs = prijs;
    }
    
    /**
     * de getter voor naam, geeft een String terug
     */
    public String getNaam()
    {
        // teruggave van naam
        return naam;
    }
    
    /**
     * de getter voor prijs, geeft een double terug
     */
    public double getPrijs()
    {
        // teruggave van prijs
        return prijs;
    }
    
    /**
     * laat alle gegevens zien van het artikel zien
     */
    public void drukAf(){
        System.out.println("Artikel: " + getNaam());
        System.out.println("Prijs: " + getPrijs());
    }
}