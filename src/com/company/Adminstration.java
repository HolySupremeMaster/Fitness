package com.company;

public class Adminstration extends Employee {

    int vacation = 5;

    public Adminstration() {
    }
    public Adminstration(String name, String cpr) {

        this.name = name;
        this.cpr = cpr;
        this.hours = 37;
        this.salary = 33000;
    }

    public int getVacation() {
        return vacation;
    }

    public String toString(int rowpadding) {
        return  String.format("%0$-"+rowpadding+"s", name)+
                String.format("%0$-"+rowpadding+"s", cpr)+
                String.format("%0$-"+rowpadding+"s", this.getHours())+
                String.format("%0$-"+rowpadding+"s", this.getSalary())+
                String.format("%0$-"+rowpadding+"s", this.getVacation())
                ;
    }
    }

