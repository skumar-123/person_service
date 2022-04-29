package com.person.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long personId;
    private String name;
    private String phone;
    private List<Contact> contacts;

    public Person(Long personId, String name, String phone, List<Contact> contacts) {
        this.personId = personId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public Person(Long personId, String name, String phone) {
        this.personId = personId;
        this.name = name;
        this.phone = phone;
    }

    public Person() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
