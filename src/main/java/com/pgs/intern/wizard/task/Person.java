package com.pgs.intern.wizard.task;

/**
 * Created by KonSalam on 11.04.2016.
 */
public class Person {

    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, String surname, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return (name == null || name.length() == 0) ? "BRAK" : name; /*jeżeli nie wpisano imienia to BRAK*/
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return (surname == null || surname.length() == 0) ? "BRAK" : surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return (address == null || address.length() == 0) ? "BRAK" : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return (phoneNumber == null || phoneNumber.length() == 0) ? "BRAK" : phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        return phoneNumber != null ? phoneNumber.equals(person.phoneNumber) : person.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
