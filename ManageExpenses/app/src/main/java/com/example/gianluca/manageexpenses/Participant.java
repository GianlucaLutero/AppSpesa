package com.example.gianluca.manageexpenses;

import static com.example.gianluca.manageexpenses.State.NEUTRAL;

/**
 * Created by gianluca on 05/12/16.
 */

public class Participant {

    private int ID;
    private String name;
    private String surname;
    private double share_each;
    private State state;


    public Participant(int new_ID,String new_name,String new_surname,double new_share_each){

        ID=new_ID;
        name=new_name;
        surname=new_surname;
        share_each=new_share_each;
        state=NEUTRAL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getShare_each() {
        return share_each;
    }

    public void setShare_each(double share_each) {
        this.share_each = share_each;
    }


}
