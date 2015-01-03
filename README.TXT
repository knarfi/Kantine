Deze README bevat de opgaven en notities van het project Kantine van thema 1.2

Week 1 - Opgave 1 b:
    declaratie = de Java Virtual Machine maakt ruimte vrij voor de variable en wijst er een naam aan toe
    initialisatie = de waarde wordt toegewezen aan de variable die eerder gedeclareerd is.

Week 1 - Opgave 4 – Belangrijk verschil tussen primitieve typen en objecten.
    // Primitieve typen
    In in een primitieve type wordt de data direct opgeslagen.
    
    Voorbeeld:
    Bij de primitieve type wordt de waarde van i gelijk veranderd zodra j aan i wordt toegekend. 
    Deze waarde wordt direct opgeslagen in i en staat nu vast. 
    Omdat j pas hierna veranderd wordt, krijgt i geen nieuwe waarde meer, i is immers al bepaald. 
    
    // Objecten
    Omdat het bij een object type gaat om een verwijzing(referentie) naar een object worden de waarden niet direct 
    opgeslagen maar wordt er een allias van het object gemaakt wanneer het wordt aangeroepen. 
    Er kunnen op deze manier meerde waardes aan een object worden toegekend en de oorspronkelijke waarde van het object blijft in tact. 
    Omdat de verwijzing pas op het moment van uitvoer de waarde bepaald worden ook latere veranderingen meegenomen. 


Week 2 - Opgave 5a
    Je weet niet hoe lang de rij is en wanneer je moet stoppen. 
    Het einde kan bepaald worden door een voorwaarde. 
    Daarom gebruik je de while lus. 
    

Week 3 - opgave 1a
    hoeveelheidGeldInKassa()
    aantalArtikelen()
    resetKassa()

Week 3 - Opgave 2a
    Deze worden alleen gebruikt door de klasse KantineAanbod en niet door andere klassen.
    De gebruiker heeft verder niks nodig met de implementatie van de klasse en hoeft alleen
    de interface te zien. Daarom maken we het veld privaat omdat er geen andere klasse zijn die 
    er gebruik van maken. 
    
Week 3 - Opgave 2b
    Een Set is een ongeorderde collectie en een map is een collectie met sleutelwaarden die 
    gelinked zijn aan de items. 

    Voorbeelden:
    HashSet is bijv. {1,2,3,4,5}
    HashMap gebruikt sleutelwaarde bij elk item: {a->1,b->2,c->3,d->4,e->5}
    
    Een HashMap gebruik je wanneer je een waarde aan een unieke naam wilt koppelen. 
    Bijv een telefoon boek heeft nummers gekoppeld aan een naam. 
    De naam weet je vaak wel dus kun je die gebruiken om het bijbehorende nummer te zoeken.
    
    Een HashSet gebruik je wanneer je een ballenbak wil maken, je kan kijken hoeveel
    ballen er in de ballenbak zitten maar de volgorde waarin ze zitten maakt niet uit
    
Week 3 - Opgave 3a
    een constructor wordt aageroepen wanneer een object gemaakt wordt en
    geeft de instantie variablen een waarde
    
Week 3 - Opgave 3b
    Leg de implementatie van int getRandomValue(int min, int max) 
    uit en met name waarom er +1 in voorkomt. 
    Gebruik de Java API. Hint: denk aan de bete- kenis van inclusief en exclusief. 
    
    De methode roept de methode van een instantie vn de klas Random aan die een willekeurige
    waarde teruggeeft tussen 0 en het meegegeven argument.
    Het argument is de het maximale nummer - het minimale nummer, stel je wil een nummer
    tussen de 5 en 10 dan krijg je 5, dit betekent dat je nummers krijgt tussen 0(incl) 
    en 5(excl). Wanneer je +1 doet krijg je nummers tussen 1(incl) en 5 (incl). Als je
    hier nog het minimale getal bij doet (in dit geval 5) krijg je getallen tussen 5 en 10.
    
Week 4 - Opgave 1c
    Als je zelf geen constructor maakt wordt dit voor jou gedaan.
    
Week 4 - Opgave 1d
    Deze methodes hebben geen invloed op de instance variables van Administratie (de staat van het object).
    dus deze methodes kunnen static zijn.
    
Week 4 - Opgave 1e
    Als iets private is kan het alleen aangeroepen worden binnen de klas, als je dus een nieuw
    object aanmaakt en daarmee de private constructor aanroept zal deze een melding geven dat je
    die constructor niet aan kan roepen en daarmee dus niet het object aan kan maken.
    
week 4 - Opgave 1g
    zie project folder
    
week 4 - Opgave 1h
    Het keyword final zorgt ervoor dat de waarde achteraf niet meer veranderd kan worden.
    
week 4 - Opgave 1i
    de compiler klaagt hierover omdat statische methodes niet bij een specefieke instantie horen van
    de classe. Wanneer je dan een variable aanroept weet java niet uit welke instance die gehaald moet
    worden. Wanneer een variable static is hoort deze ook bij de clas en niet bij een instantie en 
    is er dus maar 1 van.

week 4 - Opgave 1j
    Dat DAYS_IN_WEEK nu niet meer een constante variable is. Het doel van deze variable was een vaste
    waarde te introduceren zodat deze in de classe gebruikt kon worden, de waarde is nu niet meer vast.

Week 4 - opgave 2b
    Vraag: Waarom moet een super aanroep in de constructor altijd bovenaan staan?
    Als de super aanroep niet boven aan staat zal Java zelf proberen om de aanroep automatisch in te voegen.
    Super komt dus altijd voor in de constructor en dit moet anders zal de superclass nooit gemaakt worden. De super
    moet daarom bovenaan omdat je eerst een superclass nodig hebt om de de class aan te maken van de constroctur
    en die is weer nodig voordat je variablen kan gaan wijzigen of methodes aanroepen.
    Sowieso is het een regel in blueJ en kan je niet compilen als de super aanroep niet boven aan staat.
    
week 5 - Opgave 1c
    == Test of de variablen naar hetzelfde object verwijzen en equals(Object object) kijkt of de 2 objecten gelijk zijn(of de velden
    hetzelfde zijn)
    
week 5 - Opgave 1d
    Als je 2 strings inhoudelijk wil vergelijken moet je equals(Object object) gebruiken. Deze controleert namelijk inhoudelijk
    of de 2 strings gelijk zijn. == Kijkt of 2 variablen naar hetzelfde object verwijzen en dat is niet het geval omdat
    er 2 verschillende variablen (=objecten) aangemaakt zijn.
    Wanneer je toch == gebruikt kan het wel werken, dit heeft met de werking van String te maken.


Tests voor geboortedatum:
Tests       verwachting resultaat   resultaat2
19/5/2014   wel         wel         wel

1/1/1990    wel         wel         wel

-1/10/2000  niet        niet        wel

10/13/2001  niet        niet        wel

29/2/2008   wel         wel         wel

29/2/2009   niet        niet        niet

10/2/2000   wel         wel         wel

29/2/2000   wel         wel         wel

30/2/2000   niet        wel         niet

30/2/1990   niet        niet        niet

29/2/1900   niet        niet        niet

29/2/2016   wel         wel         wel

29/2/2020   wel         wel         wel         

29/2/2021   niet        niet        niet      

28/2/1900   wel         wel         wel