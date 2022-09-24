package com.genspark.RESTfulAPITest2.Entity;

import javax.persistence.*;


@Entity
@Table(name = "Clubs")
public class Clubs {

    @Id
    @Column(name = "Club_Name")
    private String name; //name of football club

    private String manager; // club manager

    private String[] roster; // club player roster

    public Clubs() {

    }

    public Clubs(String manager, String[] roster) {
        this.manager = manager;
        this.roster = roster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String[] getRoster() {
        return roster;
    }

    public void setRoster(String[] roster) {
        this.roster = roster;
    }
}
