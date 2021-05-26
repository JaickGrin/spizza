package com.epam.dto;

import java.util.UUID;

public class OrderDTO {

    private String name;
    private String adressLine;

    public OrderDTO() {
    }

    public OrderDTO(String name, String adressLine) {
        this.name = name;
        this.adressLine = adressLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressLine() {
        return adressLine;
    }

    public void setAdressLine(String adressLine) {
        this.adressLine = adressLine;
    }
}