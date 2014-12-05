import java.util.Stack;
import java.util.Iterator;

/**
 * Deze klasse bevat informatie over een eventueel dienblad, een dienblad bevat artikelen
 * 
 * @autheur Frank Noorlander
 * @versie 29-11-2014
 */

public class Dienblad {
    private Stack<Artikel> artikelen;
    
    /**
     * Maakt een Dienblad instantie aan met een artikelen collectie. 
     */
    public Dienblad() 
    {
        artikelen = new Stack<Artikel>();
    }
    
    /**
     * Methode om artikel aan dienblad toe te voegen
     * 
     * @param artikel
     */
    public void voegToe(Artikel artikel) 
    {
        artikelen.add(artikel);
    }
    
    /**
     * geeft een lijst met alle artikelen in de vorm van een interator
     * 
     * @return  lijst van artikelen
     */
    public Iterator<Artikel> getArtikelen(){
        return artikelen.iterator();
    }
}