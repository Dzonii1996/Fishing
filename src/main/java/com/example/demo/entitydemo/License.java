package com.example.demo.entitydemo;

import javafx.scene.chart.XYChart;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class License {

    @Id
    @GeneratedValue

    private String type;
    private String ExpirionData;




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpirionData() {
        return ExpirionData;
    }

    public void setExpirionData(String expirionData) {
        ExpirionData = expirionData;
    }
}
