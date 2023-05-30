package org.dz9;

public class Woman extends Person {

    public Woman(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired()  {
        if (getAge() >= 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String registerPartnership() {
        if (getPartner() != null) {
            String changedLastName = getPartner().getLastName();
            setLastName(changedLastName);
            return changedLastName;
        } else return null;
    }

    @Override
    public boolean deregisterPartnership() {
        if (getPartner() != null) {
            setLastName(getOldLastName());
            setPartner(null);
            return true;
        } else {
            return false;
        }
    }

}
