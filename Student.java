/**
 * Deze klasse bevat informatie over de studenten die kantine bezoeken.
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 12-12-2014
 */
public class Student extends Persoon
{
    private int studentnummer;
    private String studierichting;
    
    /**
     * Maak een nieuwe student aan zonder opgegeven waarden. 
     */
    public Student()
    {
        super();
        setStudentnummer(0);
        setStudierichting("Onbekend");
        
    }
    
    /**
     * Maak een nieuwe student aan met de opgegeven parameters.
     */
    public Student(int bsn, String voornaam, String achternaam, int geboorteDag, 
                   int geboorteMaand, int geboorteJaar, char geslacht, int studentnummer, String studierichting)
    {
        super(bsn, voornaam, achternaam, geboorteDag, geboorteMaand, geboorteJaar, geslacht);
        setStudentnummer(studentnummer); 
        setStudierichting(studierichting);
    }
    
    /**
     * Set het studentennummer van een student. 
     * @param studentnummer het studenten nummer van een student
     */
    public void setStudentnummer(int studentnummer)
    {
        this.studentnummer = studentnummer;
    }
    
    /**
     * Set de studierichting van een student. 
     * @param studierichting de studierichting van een student
     */
    public void setStudierichting(String studierichting)
    {
        this.studierichting = studierichting;
    }
    
    /**
     * Laat het studentennummer van een student zien.
     * @return het studentennummer van een student
     */
    public int getStudentnummer()
    {
        return studentnummer;
    }
    
    /**
     * Laat de studierichting van een student zien.
     * @return de studierichting van het student 
     */
    public String getStudierichting()
    {
        return studierichting;
    }
    
    /**
    * Laat alle gegevens zien van de student zien.
    */
    public void drukAf()
    {
        super.drukAf();
        System.out.println("Studentnummer: " + getStudentnummer());
        System.out.println("Studierichting: " + getStudierichting());
    }
}