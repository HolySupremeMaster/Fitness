package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int rowpad = 18;
    static String HeaderSpacer = String.join("", Collections.nCopies(rowpad * 5, "*"));
    static String SectionSpacer = "\n";

    public static void main(String[] args) {
        //personlist
        List<Person> personlist = new ArrayList<Person>();
        personlist.add(new Adminstration("Nico", "222200-2232"));
        personlist.add(new Instructor("Julia", "101094-1202", 25));
        personlist.add(new Adminstration("Audrey", "003080-10140"));
        personlist.add(new Instructor("Johny", "994303-1213", 22));
        personlist.add(new Member("Lana", "1013322-2011", false));
        personlist.add(new Member("Karim", "011080-1014", true));
        personlist.add(new Member("Ingzahi", "013080-1014", false));
        personlist.add(new Member("Pirlo", "011033-3313", true));

        //employeee list
        System.out.println("FITNESS EMPLOYEES");
        Employee eheader = new Employee();
        System.out.println(eheader.toString(rowpad));
        System.out.println(HeaderSpacer);
        for (Person per : personlist) {
            if (per instanceof Adminstration || per instanceof Instructor) {
                System.out.println(per.toString(rowpad));
            }
            System.out.println(HeaderSpacer);
            System.out.println(SectionSpacer);
            //member list
            System.out.println("FITNESS MEMBERS");
            Member mem = new Member();
            System.out.println(mem.toString(rowpad));
            System.out.println(HeaderSpacer);
            for (Person p : personlist){
                if (p instanceof Member){
                    System.out.println(p.toString(rowpad));
                }
            }
            System.out.println(HeaderSpacer);
            System.out.println(SectionSpacer);

            //employee and member list
            System.out.println("Employees & members Name and cpr");
            Person pheader = new Person();
            System.out.println(pheader.toString(rowpad, true));
            System.out.println(HeaderSpacer);
            for (Person p : personlist){
                System.out.println(p.toString(rowpad, true));
            }
            System.out.println(HeaderSpacer);
            System.out.println(SectionSpacer);
        }
    }
}
