package com.example.andrei.bitmasters;

import org.json.JSONObject;
import org.json.JSONWriter;

import java.util.HashMap;
import java.util.Set;

public class MusicGenres {
    private String personality;
    private HashMap<String, Double> genres;

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
}
