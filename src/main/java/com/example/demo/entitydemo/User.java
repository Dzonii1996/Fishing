package com.example.demo.entitydemo;

import com.sun.javafx.beans.IDProperty;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity

public class User {

    @Id
    @GeneratedValue

    private String firstName;
    private long id;
    private String lastName;
    private String email;
    private String password;


    @OneToOne(targetEntity = License.class,mappedBy = "User",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private License license;

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @OneToOne(targetEntity = Places.class,mappedBy = "User",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private  Places places;

    public Places getPlaces() {
        return places;
    }

    public void setPlaces(Places places) {
        this.places = places;





   }





        public long getId () {
            return id;
        }

        public void setId ( long id){
            this.id = id;
        }


        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getPassword () {
            return password;
        }

        public void setPassword (String password) {
            this.password = password;
        }}
//    @Override
//    public boolean equals(Object o) {
////
//        if (this == o)
//            return true;
//        if (!(o instanceof User))
//            return false;
//        User user = (User) o;
//        return Objects.equals(this.id, user.id) && Objects.equals(this.firstName, user.firstName)
//                && Objects.equals(this.lastName, user.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.id, this.firstName, this.lastName);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + this.id + ", name='" + this.firstName + '\'' + ", role='" + this.lastName + '\'' + '}';
//    }
//}
//
//