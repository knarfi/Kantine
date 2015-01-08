
/**
 * Informatie over de exceptions die moeten worden opgegooid als de klant niet genoeg geld heeft. 
 * 
 * @author Rick van der Poel 
 * @version 08-01-2015
 */
public class TeWeinigGeldException extends Exception
{
    
    String foutmelding;
    
    public TeWeinigGeldException() 
    {
           
    }
    
    public TeWeinigGeldException(Exception e)
    {
        
    }
    
    public TeWeinigGeldException(String foutmelding)
    {
        this.foutmelding = foutmelding;
    }
    
    public String getFoutmelding()
    {
        return foutmelding;
    }
}
