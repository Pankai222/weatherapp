package com.project.weatherapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Coord {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private float lon;
    private float lat;

    public String toString() {
        return "[" + lon + ", " + lat + "]";
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}
