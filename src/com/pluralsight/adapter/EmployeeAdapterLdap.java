package com.pluralsight.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }
    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    //add toString is controversial - some it makes it a decorator
    // BUT makes it behave consistently with EmploeeBB
    @Override
    public String toString() {
        return  "id='" + instance.getCn() + '\'' +
                ", firstName='" + instance.getGivenName() + '\'' +
                ", lastName='" + instance.getSurname() + '\'' +
                ", email='" + instance.getMail() + '\'' ;
    }
}
