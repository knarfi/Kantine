/**
 * Deze klasse bevat informatie over de personen die werken in de kantine. 
 * 
 * @autheur Rick van der Poel en Frank Noorlander
 * @versie 29-11-2014
 */

public class Persoon {
    // FIELDS
    // Hieronder staan de velden beschreven waarin informatie wordt opgeslagen.
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int geboorteDag ,geboorteMaand, geboorteJaar;
    private char geslacht;
    private Dienblad dienblad;
    
    /**
    * CONSTRUCTOR
    * Voer BSN, voornaam, achternaam, geboortedatum en geslacht van de persoon in. 
    */
    public Persoon(int bsn, String voornaam, String achternaam, int geboorteDag, int geboorteMaand, int geboorteJaar, char geslacht)
    {
        //de methodes om de velden bsn, voornaam, achternaam, geboorte -dag -maand -jaar en geslacht te vullen worden aangeroepen
        setBsn(bsn);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeslacht(geslacht);
        setGeboorteDatum(geboorteDag, geboorteMaand, geboorteJaar);
        dienblad = null;
    }

    /**
    * CONSTRUCTOR 2
    * Parameterloze constructor met standaard waarden.  
    */
    public Persoon()
    {
        setBsn(0);
        setVoornaam("onbekend");
        setAchternaam("onbekend");
        setGeslacht('x');
        setGeboorteDatumToNull();
        dienblad = null;
    }
      
    /**
    * SETTER
    * Methode om een BSN nummer van een persoon te veranderen.  
    */
    public void setBsn(int bsn)
    {
        this.bsn = bsn;
    }
    
    /**
    * SETTER
    * Methode om een voornaam van een persoon te veranderen. 
    */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }
    
    /**
    * SETTER
    * Methode om een achternaam van een persoon te veranderen. 
    */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }
    
    /**
    * Methode om een geboortedatum van een persoon te checken.  
    */
    private boolean checkDatum(int dag, int maand, int jaar)
    {
        //als het een bestaande dag is
        if( dag >= 1 && dag <= 31){
            
            //als het een bestaande maand is
            if(maand >= 1 && maand <= 12){
                
                //als het een jaar is dat wij accepteren
                if(jaar >= 1900 && jaar <= 2100) {
                    
                    //als het een maand is met 30 dagen en dit klopt
                    if(dag <= 30 && (maand == 4 || maand == 6 || maand == 9 || maand == 11)) {
                        return true;
                        
                        //als de geboortemaand februarie is
                    } else if(maand == 2){
                        
                        //als het een schrikkeljaar is en de dag is groter dan 28
                        if(jaar % 4==0 && dag == 29) {
                            
                            //als het jaar niet gedeeld kan worden door 100 is het geen schikeljaar
                            //of als het jaar wel dooor 400 gedeeld kan worden dan is het wel een schikeljaar
                            if(jaar % 100 != 0 || jaar % 400 == 0){
                                return true;
                            } else {
                                return false;
                            }
                        }else if(dag <= 28){
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
    * SETTER
    * zet de waarden van de geboortedatum naar de ingevoerde waarden
    */
    public void setGeboorteDatum(int geboorteDag, int geboorteMaand, int geboorteJaar)
    {
        if(checkDatum(geboorteDag, geboorteMaand, geboorteJaar)){
            this.geboorteDag = geboorteDag;
            this.geboorteMaand = geboorteMaand;
            this.geboorteJaar = geboorteJaar;
        }else{
            setGeboorteDatumToNull();
        }
    }
    
    /**
    * SETTER
    * Methode om geboortedatum in 0 te veranderen. 
    */
    
    public void setGeboorteDatumToNull()
    {
        geboorteDag = 0;
        geboorteMaand = 0;
        geboorteJaar = 0;
    }
    
    /**
    * SETTER
    * Methode om een geslacht van een persoon te veranderen.  
    */
    public void setGeslacht(char geslacht)
    {
        if(geslacht == 'm' || geslacht == 'v') {
            this.geslacht = geslacht; 
        }
        else {
            // Wanneer geen geldig geslacht is opgegeven. 
            this.geslacht = 'x';
        }
    }
    
    /**
    * Getter voor BSN nummer
    * @return voornaam
    */
    public int getBSN()
    {
        return bsn;
    }
    
    /**
    * Getter voor voornaam
    * @return voornaam
    */
    public String getVoornaam()
    {
        return voornaam;
    }
    
    /**
    * Getter voor achternaam
    * @return achternaam
    */
    public String getAchternaam()
    {
        return achternaam;
    }
    
    /**
    * Getter voor geboortedatum
    * @return Geboortedatum
    */
    public String getGeboorteDatum()
    {
        String temp;
        
        //als de geboortedatum niet goed is
        if (geboorteDag==0 && geboorteMaand==0 && geboorteJaar==0) {
            temp = "Onbekend";
            
            //als de geboortedatum wel goed is
        } else {
            temp = geboorteDag + "/" + geboorteMaand + "/" + geboorteJaar;
        }
        return temp;
    }
    
    /**
    * Getter voor geslacht
    * @return geslacht
    */
    public String getGeslacht() 
    {
        String geslacht;
        
        if(this.geslacht == 'm'){
            geslacht = "Man";
        }
        else if(this.geslacht == 'v'){
            geslacht = "Vrouw";
        } 
        else {
            geslacht = "Onbekend";
        }
        
        return geslacht;
    }
    
    /**
    * laat alle gegevens zien van de persoon in een leuk en gezellig verhaaltje
    */
    public void drukAf()
    {
        System.out.println(getVoornaam() + " " + getAchternaam() + " liep in het donkere bos.");
        System.out.println("Plots bedacht hij zich zijn BSN nummer: " + getBSN() + " zo'n mooi nummer had hij nog nooit gezien.");
        System.out.println("Waarschijnlijk kwam dat omdat zijn geboortedatum ook zo prachtig was, wat is nou beter dan " + getGeboorteDatum() + "!");
        System.out.println("En omdat zijn geslacht " + getGeslacht() + " was kon er niks meer stuk gaan die dag");
    }
    
    /**
     * Methode om dienblad te koppelen aan een persoon
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad) 
    {
        this.dienblad = dienblad;
    }
    
    /**
     * Methode om artikel te pakken en te plaatsen op het dienblad
     * @param artikel
     */
    public void pakArtikel(Artikel artikel) 
    {
        if(dienblad != null){
            dienblad.voegToe(artikel);
        }
    }
    
    /**
     * geeft het dienblad van de persoon, als er geen dienblad is komt er een null terug
     * 
     * @return  dienblad van de persoon
     */
    public Dienblad getDienblad(){
        return dienblad;
    }
}