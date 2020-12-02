package com.example.demo.entity;

import javax.persistence.*;

//@Entity
public class Places {

    @Id
    @GeneratedValue

    private Long id;
    private String description;
    private String url;
    private String country;
    private String city;

    private String addres;
//    @OneToOne(targetEntity = User.class, mappedBy = "Places", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

//    @OneToOne(targetEntity = FishType.class, mappedBy = "Places", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private FishType fishType;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FishType getFishType() {
        return fishType;
    }

    public void setFishType(FishType fishType) {
        this.fishType = fishType;
    }

    @Lob
    private Byte[] image;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
