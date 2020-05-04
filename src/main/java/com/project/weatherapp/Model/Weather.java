package com.project.weatherapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int id2;
    private String description;
    private String main;
    private String icon;

    public int getId() {
        return id2;
    }

    public void setId(int id) {
        this.id2 = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
