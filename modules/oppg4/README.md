Dette er et eksempel på bruk av Java's ServiceLoader.
1. Løs kompileringsfeilen som klager på visibilitet slik at eksempelet kan kjøre.
2. Vi har to Service implementasjoner, men kun den ene blir funnet. Hvorfor? Se om du ikke kan også få den andre til å synes.

Ekstra:
Prøv deg på Jlink for å lage et minimalistisk runtime environment med de 3 modulene fra denne oppgaven. Under er noen kommandoer for å generere en minimal JRE med modulene dine. Les gjerne mer om Jlink for å se hva mulighetene her er.

I oppg4 directory (husk at JDK pathen kan være forskjellig fra denne):

1. link moduler og JRE.
 - jlink --module-path "build;C:\Program Files\Java\jdk-12.0.1\jmods" --add-modules   module.client,service.api,service.provider.two,service.provider.one --output out-standalone

2. Kjør eksempelet
 - out-standalone/bin/java --module module.client/client.Client

3. Hvor stor er out-standalone folderen som nå inneholder et fullverdig runtime environment for applikasjonen din?
