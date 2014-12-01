import java.util.Stack;

/**
 * Deze klasse bevat informatie over een eventueel dienblad, een dienblad bevat artikelen
 * 
 * @autheur Frank Noorlander
 * @versie 29-11-2014
 */

public class Dienblad {
    private Stack<Artikel> artikelen;
    
    /**
     * Constructor
     */
    public Dienblad() 
    {
        artikelen = new Stack<Artikel>();
    }
    
    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel) 
    {
        artikelen.add(artikel);
    }
    
    /**
     * Methode om aantal artikelen op dienblad te tellen
     * @return Het aantal artikelen 
     */
    public int getAantalArtikelen() 
    {
        return artikelen.size();
    }
    
    /**
     * Methode om de totaalprijs van de artikelen 
     * op dienblad uit te rekenen
     * @return De totaalprijs
     */
    public double getTotaalPrijs() 
    {
        double totaal = 0;
        for(Artikel artikel : artikelen){
            totaal += artikel.getPrijs();
        }
        
        return totaal;
    }
}