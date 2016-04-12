package com.pgs.intern.wizard.task;

/**
 * Created by KonSalam on 11.04.2016.
 */
public class Person {

    private String name;
    private String surname;
    private String address;
    private String phone_number;

    public Person() {
        this.name = "";
        this.surname = "";
        this.address = "";
        this.phone_number = "";
    }

    public Person(String name, String surname, String address, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        if (!surname.equals(person.surname)) return false;
        if (!address.equals(person.address)) return false;
        return phone_number.equals(person.phone_number);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phone_number.hashCode();
        return result;
    }
}
