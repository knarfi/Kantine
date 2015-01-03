
/**
 * een test klas om de equals code in de persoons klasse te testen.
 * 
 * @author Frank Noorlander
 * @version 1.0 (29/12/2014)
 */
public class PersoonsVergelijker
{
    /**
     * maakt 2 nieuwe, identieke, personen en vergelijkt deze met elkaar.
     */
    public static void main(String[] args)
    {
        Persoon persoon1 = new Persoon(1234, "henk", "hatseflats", 1, 1, 2000, 'm');
        Persoon persoon2 = new Persoon(1234, "henk", "hatseflats", 1, 1, 2000, 'm');
        if(persoon1 == persoon2){
            System.out.println("Variablen persoon1 en persoon2 verwijzen naar hetzelfde object.");
        }
        
        if(persoon1.equals(persoon2)){
            System.out.println("Variablen persoon1 en persoon2 zijn hetzelfde.");
        }
        
        String string1 = "henk";
        String string2 = "henk";
        if(string1 == string2){
            System.out.println("Variablen string1 en string2 verwijzen naar hetzelfde object.");
        }
        
        if(string1.equals(string2)){
            System.out.println("Variablen string1 en string2 zijn hetzelfde.");
        }
    }
}
