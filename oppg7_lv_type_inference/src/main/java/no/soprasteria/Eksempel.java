package no.soprasteria;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Eksempel {
    private String forsoekOgEndreMeg = "Kan jeg endres til var?";


    public Map<String, List<Integer>> hentMapMedListe() {
        return Map.of("Hei", List.of(1,2,3));
    }

    public void nullEksempel() {
        String s;
    }

    public void enStreng() {
        String velkommen = "Velkommen";
    }

    public void loopEksempel() {
        for(int i = 0; i< 10; i++) {
            System.out.println(i);
        }
    }

    public void slitsomDeklarasjon() {
        Map<String, String> map = new HashMap<>();
    }

    public void tarImotArg(String kanDeklEndresTilVar) {

    }

    public String viktigTekst() {
        return "Kan returtypen endres til var?";
    }
}
