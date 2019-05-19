package com.example.andrei.bitmasters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MusicGenres {
    private String personality;
    private HashMap<String, Double> genres;

    MusicGenres() {
        genres = new HashMap<>();
    }

    public String getPersonality(){
        return this.personality;
    }
    public Set<String> getGenresName(){
        return this.genres.keySet();
    }
    public Double getValueOfGenre(String genre){
        return this.genres.get(genre);
    }
    public void setPersonality(String personality){
        this.personality=personality;
    }
    public void addGenre(String genre, Double value){
        this.genres.put(genre, value);
    }

    static protected ArrayList<MusicGenres> getAllPersonalities() {
        ArrayList<MusicGenres> musicGenress = new ArrayList<>();
        MusicGenres genre = new MusicGenres();
        genre.setPersonality("Analyst");
        genre.addGenre("rock/ metal/ indie", 0.41);
        genre.addGenre("blues/ soul", 0.0);
        genre.addGenre("world/ ambient", 0.0);
        genre.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre.addGenre("raggae", 0.0);
        genre.addGenre("classical", 0.76);
        genre.addGenre("jazz", 0.54);
        genre.addGenre("punk", 0.46);
        genre.addGenre("country", 0.0);
        genre.addGenre("religion music", 0.0);
        musicGenress.add(genre);

        MusicGenres genre1 = new MusicGenres();
        genre1.setPersonality("Diplomat");
        genre1.addGenre("rock/ metal/ indie", 0.28);
        genre1.addGenre("blues/ soul", 0.48);
        genre1.addGenre("world/ ambient", 0.54);
        genre1.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre1.addGenre("raggae", 0.0);
        genre1.addGenre("classical", 0.0);
        genre1.addGenre("jazz", 0.54);
        genre1.addGenre("punk", 0.0);
        genre1.addGenre("country", 0.0);
        genre1.addGenre("religion music", 0.0);
        musicGenress.add(genre1);

        MusicGenres genre2 = new MusicGenres();
        genre2.setPersonality("Sentinel");
        genre2.addGenre("rock/ metal/ indie", 0.0);
        genre2.addGenre("blues/ soul", 0.0);
        genre2.addGenre("world/ ambient", 0.0);
        genre2.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre2.addGenre("raggae", 0.0);
        genre2.addGenre("classical", 0.0);
        genre2.addGenre("jazz", 0.0);
        genre2.addGenre("punk", 0.0);
        genre2.addGenre("country", 0.43);
        genre2.addGenre("religion music", 0.4);
        musicGenress.add(genre2);

        MusicGenres genre3 = new MusicGenres();
        genre3.setPersonality("Explorer");
        genre3.addGenre("rock/ metal/ indie", 0.0);
        genre3.addGenre("blues/ soul", 0.0);
        genre3.addGenre("world/ ambient", 0.0);
        genre3.addGenre("electronic/ hip-hop/ pop", 0.64);
        genre3.addGenre("raggae", 0.35);
        genre3.addGenre("classical", 0.0);
        genre3.addGenre("jazz", 0.0);
        genre3.addGenre("punk", 0.0);
        genre3.addGenre("country", 0.0);
        genre3.addGenre("religion music", 0.0);
        musicGenress.add(genre3);

        MusicGenres genre4 = new MusicGenres();
        genre4.setPersonality("People Mastery");
        genre4.addGenre("rock/ metal/ indie", 0.0);
        genre4.addGenre("blues/ soul", 0.53);
        genre4.addGenre("world/ ambient", 0.0);
        genre4.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre4.addGenre("raggae", 0.38);
        genre4.addGenre("classical", 0.76);
        genre4.addGenre("jazz", 0.6);
        genre4.addGenre("punk", 0.0);
        genre4.addGenre("country", 0.4);
        genre4.addGenre("religion music", 0.0);
        musicGenress.add(genre4);

        MusicGenres genre5 = new MusicGenres();
        genre5.setPersonality("Constant Improver");
        genre5.addGenre("rock/ metal/ indie", 0.54);
        genre5.addGenre("blues/ soul", 0.0);
        genre5.addGenre("world/ ambient", 0.0);
        genre5.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre5.addGenre("raggae", 0.0);
        genre5.addGenre("classical", 0.0);
        genre5.addGenre("jazz", 0.0);
        genre5.addGenre("punk", 0.46);
        genre5.addGenre("country", 0.0);
        genre5.addGenre("religion music", 0.0);
        musicGenress.add(genre5);

        MusicGenres genre6 = new MusicGenres();
        genre6.setPersonality("Social Engagement");
        genre6.addGenre("rock/ metal/ indie", 0.0);
        genre6.addGenre("blues/ soul", 0.0);
        genre6.addGenre("world/ ambient", 0.53);
        genre6.addGenre("electronic/ hip-hop/ pop", 0.69);
        genre6.addGenre("raggae", 0.0);
        genre6.addGenre("classical", 0.0);
        genre6.addGenre("jazz", 0.0);
        genre6.addGenre("punk", 0.0);
        genre6.addGenre("country", 0.0);
        genre6.addGenre("religion music", 0.35);
        musicGenress.add(genre6);

        MusicGenres genre7 = new MusicGenres();
        genre7.setPersonality("Logician");
        genre7.addGenre("rock/ metal/ indie", 0.43);
        genre7.addGenre("blues/ soul", 0.0);
        genre7.addGenre("world/ ambient", 0.0);
        genre7.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre7.addGenre("raggae", 0.0);
        genre7.addGenre("classical", 0.0);
        genre7.addGenre("jazz", 0.0);
        genre7.addGenre("punk", 0.51);
        genre7.addGenre("country", 0.0);
        genre7.addGenre("religion music", 0.0);
        musicGenress.add(genre7);

        MusicGenres genre8 = new MusicGenres();
        genre8.setPersonality("Mediator");
        genre8.addGenre("rock/ metal/ indie", 0.56);
        genre8.addGenre("blues/ soul", 0.0);
        genre8.addGenre("world/ ambient", 0.0);
        genre8.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre8.addGenre("raggae", 0.0);
        genre8.addGenre("classical", 0.0);
        genre8.addGenre("jazz", 0.0);
        genre8.addGenre("punk", 0.49);
        genre8.addGenre("country", 0.0);
        genre8.addGenre("religion music", 0.0);
        musicGenress.add(genre8);

        MusicGenres genre9 = new MusicGenres();
        genre9.setPersonality("Virtuos");
        genre9.addGenre("rock/ metal/ indie", 0.0);
        genre9.addGenre("blues/ soul", 0.0);
        genre9.addGenre("world/ ambient", 0.0);
        genre9.addGenre("electronic/ hip-hop/ pop", 0.0);
        genre9.addGenre("raggae", 0.0);
        genre9.addGenre("classical", 0.0);
        genre9.addGenre("jazz", 0.0);
        genre9.addGenre("punk", 0.48);
        genre9.addGenre("country", 0.0);
        genre9.addGenre("religion music", 0.0);
        musicGenress.add(genre9);

        MusicGenres genreA = new MusicGenres();
        genreA.setPersonality("Commander");
        genreA.addGenre("rock/ metal/ indie", 0.0);
        genreA.addGenre("blues/ soul", 0.0);
        genreA.addGenre("world/ ambient", 0.0);
        genreA.addGenre("electronic/ hip-hop/ pop", 0.23);
        genreA.addGenre("raggae", 0.0);
        genreA.addGenre("classical", 0.79);
        genreA.addGenre("jazz", 0.64);
        genreA.addGenre("punk", 0.0);
        genreA.addGenre("country", 0.0);
        genreA.addGenre("religion music", 0.0);
        musicGenress.add(genreA);

        MusicGenres genreB = new MusicGenres();
        genreB.setPersonality("Protagonist");
        genreB.addGenre("rock/ metal/ indie", 0.0);
        genreB.addGenre("blues/ soul", 0.26);
        genreB.addGenre("world/ ambient", 0.26);
        genreB.addGenre("electronic/ hip-hop/ pop", 0.0);
        genreB.addGenre("raggae", 0.0);
        genreB.addGenre("classical", 0.0);
        genreB.addGenre("jazz", 0.64);
        genreB.addGenre("punk", 0.0);
        genreB.addGenre("country", 0.0);
        genreB.addGenre("religion music", 0.0);
        musicGenress.add(genreB);

        MusicGenres genreC = new MusicGenres();
        genreC.setPersonality("Compaigner");
        genreC.addGenre("rock/ metal/ indie", 0.0);
        genreC.addGenre("blues/ soul", 0.55);
        genreC.addGenre("world/ ambient", 0.59);
        genreC.addGenre("electronic/ hip-hop/ pop", 0.25);
        genreC.addGenre("raggae", 0.42);
        genreC.addGenre("classical", 0.0);
        genreC.addGenre("jazz", 0.62);
        genreC.addGenre("punk", 0.0);
        genreC.addGenre("country", 0.0);
        genreC.addGenre("religion music", 0.0);
        musicGenress.add(genreC);

        MusicGenres genreD = new MusicGenres();
        genreD.setPersonality("Architect");
        genreD.addGenre("rock/ metal/ indie", 0.14);
        genreD.addGenre("blues/ soul", 0.0);
        genreD.addGenre("world/ ambient", 0.0);
        genreD.addGenre("electronic/ hip-hop/ pop", 0.0);
        genreD.addGenre("raggae", 0.0);
        genreD.addGenre("classical", 0.78);
        genreD.addGenre("jazz", 0.0);
        genreD.addGenre("punk", 0.0);
        genreD.addGenre("country", 0.0);
        genreD.addGenre("religion music", 0.0);
        musicGenress.add(genreD);

        MusicGenres genreE = new MusicGenres();
        genreE.setPersonality("Debater");
        genreE.addGenre("rock/ metal/ indie", 0.57);
        genreE.addGenre("blues/ soul", 0.0);
        genreE.addGenre("world/ ambient", 0.0);
        genreE.addGenre("electronic/ hip-hop/ pop", 0.0);
        genreE.addGenre("raggae", 0.0);
        genreE.addGenre("classical", 0.76);
        genreE.addGenre("jazz", 0.0);
        genreE.addGenre("punk", 0.0);
        genreE.addGenre("country", 0.0);
        genreE.addGenre("religion music", 0.0);
        musicGenress.add(genreE);

        MusicGenres genreF = new MusicGenres();
        genreF.setPersonality("Advocate");
        genreF.addGenre("rock/ metal/ indie", 0.28);
        genreF.addGenre("blues/ soul", 0.0);
        genreF.addGenre("world/ ambient", 0.23);
        genreF.addGenre("electronic/ hip-hop/ pop", 0.0);
        genreF.addGenre("raggae", 0.0);
        genreF.addGenre("classical", 0.0);
        genreF.addGenre("jazz", 0.0);
        genreF.addGenre("punk", 0.0);
        genreF.addGenre("country", 0.0);
        genreF.addGenre("religion music", 0.0);
        musicGenress.add(genreF);

        MusicGenres genreG = new MusicGenres();
        genreG.setPersonality("Adventurer");
        genreG.addGenre("rock/ metal/ indie", 0.0);
        genreG.addGenre("blues/ soul", 0.0);
        genreG.addGenre("world/ ambient", 0.32);
        genreG.addGenre("electronic/ hip-hop/ pop", 0.26);
        genreG.addGenre("raggae", 0.46);
        genreG.addGenre("classical", 0.0);
        genreG.addGenre("jazz", 0.0);
        genreG.addGenre("punk", 0.0);
        genreG.addGenre("country", 0.0);
        genreG.addGenre("religion music", 0.0);
        musicGenress.add(genreG);

        MusicGenres genreH = new MusicGenres();
        genreH.setPersonality("Entrepreneur");
        genreH.addGenre("rock/ metal/ indie", 0.17);
        genreH.addGenre("blues/ soul", 0.0);
        genreH.addGenre("world/ ambient", 0.0);
        genreH.addGenre("electronic/ hip-hop/ pop", 0.46);
        genreH.addGenre("raggae", 0.42);
        genreH.addGenre("classical", 0.0);
        genreH.addGenre("jazz", 0.0);
        genreH.addGenre("punk", 0.0);
        genreH.addGenre("country", 0.0);
        genreH.addGenre("religion music", 0.0);
        musicGenress.add(genreH);

        MusicGenres genreI = new MusicGenres();
        genreI.setPersonality("Entertainer");
        genreI.addGenre("rock/ metal/ indie", 0.0);
        genreI.addGenre("blues/ soul", 0.28);
        genreI.addGenre("world/ ambient", 0.31);
        genreI.addGenre("electronic/ hip-hop/ pop", 0.48);
        genreI.addGenre("raggae", 0.0);
        genreI.addGenre("classical", 0.0);
        genreI.addGenre("jazz", 0.0);
        genreI.addGenre("punk", 0.0);
        genreI.addGenre("country", 0.52);
        genreI.addGenre("religion music", 0.0);
        musicGenress.add(genreI);

        MusicGenres genreJ = new MusicGenres();
        genreJ.setPersonality("Consul");
        genreJ.addGenre("rock/ metal/ indie", 0.0);
        genreJ.addGenre("blues/ soul", 0.52);
        genreJ.addGenre("world/ ambient", 0.0);
        genreJ.addGenre("electronic/ hip-hop/ pop", 0.27);
        genreJ.addGenre("raggae", 0.0);
        genreJ.addGenre("classical", 0.0);
        genreJ.addGenre("jazz", 0.0);
        genreJ.addGenre("punk", 0.0);
        genreJ.addGenre("country", 0.53);
        genreJ.addGenre("religion music", 0.39);
        musicGenress.add(genreJ);

        MusicGenres genreK = new MusicGenres();
        genreK.setPersonality("Executive");
        genreK.addGenre("rock/ metal/ indie", 0.0);
        genreK.addGenre("blues/ soul", 0.0);
        genreK.addGenre("world/ ambient", 0.0);
        genreK.addGenre("electronic/ hip-hop/ pop", 0.19);
        genreK.addGenre("raggae", 0.0);
        genreK.addGenre("classical", 0.0);
        genreK.addGenre("jazz", 0.0);
        genreK.addGenre("punk", 0.0);
        genreK.addGenre("country", 0.0);
        genreK.addGenre("religion music", 0.48);
        musicGenress.add(genreK);

        MusicGenres genreL = new MusicGenres();
        genreL.setPersonality("Defender");
        genreL.addGenre("rock/ metal/ indie", 0.0);
        genreL.addGenre("blues/ soul", 0.0);
        genreL.addGenre("world/ ambient", 0.0);
        genreL.addGenre("electronic/ hip-hop/ pop", 0.0);
        genreL.addGenre("raggae", 0.0);
        genreL.addGenre("classical", 0.0);
        genreL.addGenre("jazz", 0.0);
        genreL.addGenre("punk", 0.0);
        genreL.addGenre("country", 0.0);
        genreL.addGenre("religion music", 0.42);
        musicGenress.add(genreL);

        return musicGenress;

    }

    public String getPersonality(ArrayList<Integer> target) {


        ArrayList<Double> source = new ArrayList<>();

        for (int i = 0; i < target.size(); i++) {
            source.add(target.get(i) / 10d);
        }

        ArrayList<Double> differences = new ArrayList<>();


        ArrayList<MusicGenres> personalities = getAllPersonalities();


        for (int p = 0; p < personalities.size(); p++) {

            ///
            Double diff = 0d;
            Integer k = 0;
            for (String s : personalities.get(p).getGenresName()) {
                if (source.get(k) > .1d)// && personalities.get(p).getValueOfGenre(s)!=0)
                    diff += Math.abs(source.get(k++) - personalities.get(p).getValueOfGenre(s));
            }

            differences.add(diff);

        }


        String result;

        Double min = Collections.min(differences);

        int index = differences.indexOf(min);


        return personalities.get(index).getPersonality();

    }

}
