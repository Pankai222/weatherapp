package com.project.weatherapp.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="weather_reports")
public class WeatherReport {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;
    @OneToOne(cascade=CascadeType.ALL)
    private Coord coords;
    @OneToOne(cascade=CascadeType.ALL)
    private Sys sys;
    @OneToOne(cascade=CascadeType.ALL)
    private Wind wind;
    @OneToOne(cascade=CascadeType.ALL)
    private Main main;
    private int visibility;
    private String base;
    private long dt;
    private int timezone;
    private int id2;
    private String name;
    private int cod;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Weather> weather;


    public WeatherReport() {}

    public Coord getCoords() {
        return coords;
    }

    public void setCoords(Coord coords) {
        this.coords = coords;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id2;
    }

    public void setId(int id2) {
        this.id2 = id2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
