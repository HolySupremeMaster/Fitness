package com.company;

public class Person {
    String name;
    String cpr;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
    public String toString(int rowpad) {
        return "";
    }

    public String toString(int rowpad, boolean Super) {
        if (name == null) {

            return String.format("%0$-" + rowpad + "s", "Name") +
                    String.format("%0$-" + rowpad + "s", "Cpr")
                    ;
        } else {
            return String.format("%0$-" + rowpad + "s", this.name) +
                    String.format("%0$-" + rowpad + "s", this.cpr);
        }
    }
}
