package com.project.weatherapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="wind")
public class Wind {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private float speed;
    private int deg;

    public String getDegree(int deg) {
        if (deg == 270) {
            return "West";
        } else if (deg == 0) {
            return "North";
        } else if (deg == 90) {
            return "East";
        } else if (deg == 180) {
            return "South";
        } else if (deg > 0 && deg < 90) {
            return "Northeast";
        } else if (deg > 180 && deg < 270) {
            return "Southwest";
        } else if (deg > 90 && deg < 180) {
            return "Southeast";
        }
        return "Northwest";
    }

    public String getDescription(float speed) {
        if (speed > 0.5 && speed < 1.5) {
            return "Light air";
        } else if (speed > 2 && speed < 3) {
            return "Light breeze";
        } else if (speed > 3.5 && speed < 5) {
            return "Gentle breeze";
        } else if (speed > 5.5 && speed < 8) {
            return "Moderate breeze";
        } else if (speed > 8.5 && speed < 10.5) {
            return "Fresh breeze";
        } else if (speed > 11 && speed < 13.5) {
            return "Strong breeze";
        } else if (speed > 14 && speed < 16.5) {
            return "Moderate gale";
        } else if (speed > 17 && speed < 20) {
            return "Fresh gale";
        } else if (speed > 20.5 && speed < 23.5) {
            return "Strong gale";
        } else if (speed > 24 && speed < 27.5) {
            return "Whole gale";
        } else if (speed > 28 && speed < 31.5) {
            return "Storm";
        } else if (speed > 32) {
            return "Hurricane";
        }
        return "Calm";
    }


    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

}
