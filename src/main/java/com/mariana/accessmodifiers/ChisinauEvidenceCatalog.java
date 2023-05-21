package com.mariana.accessmodifiers;

import com.mariana.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person andreiBuzu = new Person(56778904322L);
        andreiBuzu.address = "Mihai Eminescu 2";
        andreiBuzu.gender = "Masculin";
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(23456778990L, "Mihai Eminescu", false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person vasileBujor = new Person(6586980987654313L, "Vasile Bujor", true, 25);
        vasileBujor.gender = "Masculin";
        vasileBujor.address = "Stefan cel Mare 75";
        System.out.println(vasileBujor.toString());
        Person.printNumberOfPeople();

        Person anaBors = new Person(658698987654317L, "Ana Bors", false, 30);
        anaBors.gender = "Feminin";
        anaBors.address = "Gradina Botanica 103";
        System.out.println(anaBors.toString());
        Person.printNumberOfPeople();
    }
}
