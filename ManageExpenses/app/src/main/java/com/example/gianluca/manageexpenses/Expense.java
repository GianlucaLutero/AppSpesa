package com.example.gianluca.manageexpenses;

/**
 * Created by gianluca on 05/12/16.
 */



public class Expense {

    private double sum;
    private int number_of_participants;
    private Participant[] participant_list;

    public Expense(double new_sum,int new_number_of_participants){

        sum = new_sum;
        number_of_participants=new_number_of_participants;
        participant_list= new Participant[new_number_of_participants];

    }


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getNumber_of_participants() {
        return number_of_participants;
    }

    public void setNumber_of_participants(int number_of_participants) {
        this.number_of_participants = number_of_participants;
    }

}
