package org.dz9;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Person partner;
    private boolean isPersonRetired;
    private String oldLastName;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isPersonRetired = isRetired();
        this.oldLastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOldLastName() {
        return oldLastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
        String newLastName = registerPartnership();
    }


    public abstract boolean isRetired();
    public abstract String registerPartnership();
    public abstract boolean deregisterPartnership();

}
