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