package com.company;

public class Instructor extends Employee {
    public Instructor(String name, String cpr, int hours) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;


    }

    public int getSalary() {
        return this.hours * 199;

    }

    public String toString(int rowpadding) {
        return String.format("%0$-" + rowpadding + "s", name) +
                String.format("%0$-" + rowpadding + "s", cpr) +
                String.format("%0$-" + rowpadding + "s", this.getHours()) +
                String.format("%0$-" + rowpadding + "s", this.getSalary()) +
                String.format("%0$-" + rowpadding + "s", "")
                ;

    }
}
