package org.dz9;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Man("Vasyliy", "Petrov", 55);
        Person person2 = new Woman("Victoria", "Pinkman", 67);
        Person person3 = new Man("Viktor", "Pavlik", 70);
        Person person4 = new Woman("Olga", "Honcharuk", 40);
        Person person5 = new Woman("Tanya", "Koval", 30);

        person1.setPartner(person2);
        person2.setPartner(person1);

        person3.setPartner(person4);
        person4.setPartner(person3);

        person3.deregisterPartnership();
        person4.deregisterPartnership();
    }

}