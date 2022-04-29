package com.person.service;

import com.person.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
// fake user list

    Person[] persons = {new Person(1234L, "Sandeep Yadav", "4321"),
            new Person(1235L, "Suraj Mane", "5321"), new Person(1236L, "Ankit Yadav", "8654")};
    List personList = Arrays.asList(persons);

    public Person getPerson(Long id) {
        Iterator<Person> itr = personList.iterator();
        while (itr.hasNext()) {
            Person p = (Person) itr.next();
            if (p.getPersonId() == id) {
                return p;
            }
        }
        return null;
    }
}