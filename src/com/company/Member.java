package com.company;

public class Member extends Person {
    boolean isBasic;

    public Member() {

    }

    public Member(String name, String cpr, boolean basic) {
        isBasic = basic;
        this.name = name;
        this.cpr = cpr;
    }

    public String getMemberType() {
        if (isBasic) {
            return "basic";
        } else return "Full";
    }

    public int monthlyFree() {
        if (isBasic) {
            return 199;
        } else return 299;
    }

    public String toString(int rowpad) {
        if (cpr == null) {
            return String.format("%0$-" + rowpad + "s", "Name") +
                    String.format("%0$-" + rowpad + "s", "Cpr") +
                    String.format("%0$-" + rowpad + "s", "Member type") +
                    String.format("%0$-" + rowpad + "s", "Fee")
                    ;
        }
        return String.format("%0$-" + rowpad + "s", this.name) +
                String.format("%0$-" + rowpad + "s", this.cpr) +
                String.format("%0$-" + rowpad + "s", getMemberType()) +
                String.format("%0$-" + rowpad + "s", monthlyFree());
    }
}

