package org.dz9;

public class Man extends Person{


    public Man(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired()  {
        if (getAge() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String registerPartnership() {
        return null;
    }

    @Override
    public boolean deregisterPartnership() {
        if (getPartner() != null) {
            setPartner(null);
            return true;
        } else {
            return false;
        }
    }

}
