package com.example.gianluca.manageexpenses;

import java.util.ArrayList;

/**
 * Created by gianluca on 05/12/16.
 */



public class Expense {
    
    private String expenseName;
    private String expenseType;
    private double sum;
    private int numberParticipants;
    private ArrayList<Participant> participantList;

    public Expense(double new_sum,int new_number_of_participants){

        sum = new_sum;
        numberParticipants=new_number_of_participants;
        participantList= new ArrayList<Participant>(new_number_of_participants);

        for(int i=0;i<new_number_of_participants-1;i++){
            participantList.add(i, new Participant(1, "Name", "Surname", new_sum / new_number_of_participants));
        }
    }


    public double getSum() {
        return sum;
    }
    
    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getNumber_of_participants() {
        return numberParticipants;
    }

    public void setNumber_of_participants(int number_of_participants) {
        this.numberParticipants = number_of_participants;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }
}
