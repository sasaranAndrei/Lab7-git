package ex3_4;

import java.util.Arrays;

public class MainClass {
    public static void main (String[] args){
        Person[] people = new Person[5];
        Person p1 = new Person("Sasa",20);
        Person p2 = new Person("Gherghel",19);
        Person p3 = new Person("Merce",21);
        Person p4 = new Person("Durus",21);
        Person p5 = new Person("Tegla",20);

        p1.addPerson(people);
        p2.addPerson(people);
        p3.addPerson(people);
        p4.addPerson(people);
        p5.addPerson(people);

        for (int i = 0 ; i < people.length; i++){
            System.out.println(people[i]);
        }
        System.out.println();
        Arrays.sort(people);

        for (int i = 0 ; i < people.length; i++){
            System.out.println(people[i]);
        }



    }
}
