package soegningelevopgaver;

import java.util.ArrayList;

public class Spillermetoder {
    // Opgave 4
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < spillere.size() - 1){
            int k = spillere.get(i).getMaal();
            if(k == score){
                return spillere.get(i);
            }else{
                i++;
            }
        }

        return null;
    }

    // Opgave 4.2
    public Spiller findScoreBinær(ArrayList<Spiller> spillere, int score) {
        Spiller spiller = null;
        int left = 0;
        int right = spillere.size() - 1;
        while (spiller == null && left <= right){
            int middle = (left + right) / 2;
            Spiller s = spillere.get(middle);

            if(s.getMaal() == score){
                spiller = s;
            }else if(s.getMaal() < score){
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return spiller;
    }

    // Opgave 4.3
    public String godSpiller(ArrayList<Spiller> spillere){
        Spiller spiller = null;
        int i = 0;
        while (spiller == null && i < spillere.size()){
            spiller = spillere.get(i);
            if(spiller.getMaal() >= 50 && spiller.getHoejde() <= 170){
                return spiller.getNavn();
            }
        }
        return " ";
    }

    // Her tilføjes metoder der løser opgve 4.2 og 4.3

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Bo", 169, 89, 60));
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));


        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinear(spillerListe, 30));

        // Tilføj kode der afprøver opgaver 4.2 og 4.3

        System.out.println("Spiller der har scoret 37 mål: " + metoder.findScoreBinær(spillerListe,37));
        System.out.println("Spiller der har scoret 32 mål: " + metoder.findScoreBinær(spillerListe,32));

        // Opgave 4.3
        System.out.println("Spilleren her er under 170 cm, og har scoret mere end 50 mål: " + metoder.godSpiller(spillerListe));
    }

}
