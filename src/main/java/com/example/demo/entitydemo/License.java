package com.example.demo.entitydemo;

import javafx.scene.chart.XYChart;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class License  {

    @Id
    @GeneratedValue

    @OneToOne(targetEntity = User.class,mappedBy = "Licens",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;


    private Long id;
    private String type;
    private String ExpirionData;

    public User getUser() {
        return user;
    }




    public String getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
