package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.time.chrono.MinguoEra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        ArrayList<Person> searchResults = new ArrayList<>();

        for (Person person: people){
            if (person.getFirstName().equalsIgnoreCase(name)){
                searchResults.add(person);
            }
        }
        // search for people by first name
        // return a new List<Person> with the search results
        return searchResults;
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        ArrayList<Person> searchResults = new ArrayList<>();

        for (Person person: people){
            if (person.getAge() == age){
                searchResults.add(person);
            }
        }

        return searchResults;
    }

    public int calculateAverageAge(List<Person> people)
    {
        int totalAge = 0;
        for (Person person: people){
            totalAge += person.getAge();
        }


        return totalAge / people.size();
    }

    public int findOldestAge(List<Person> people)
    {
        int oldest = 0;
        for(Person person: people){
            if (person.getAge() > oldest){


            oldest = person.getAge();
            }
        }

        return oldest;
    }

    public int findYoungestAge(List<Person> people)
    {
        int youngest = Integer.MAX_VALUE;
        for(Person person: people){
            if (person.getAge() < youngest){
            youngest = person.getAge();
            }
        }

        return youngest;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {

        ArrayList<Person> searchResults = new ArrayList<>();

        for (Person person: people){
            searchResults.add(person);
        }
        Collections.sort(searchResults);

        return searchResults;
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {

        ArrayList<Person> searchResults = new ArrayList<>();

        for (Person person: people){
            searchResults.add(person);
        }
        Collections.sort(searchResults);
        Collections.reverse(searchResults);

        return searchResults;
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        return new ArrayList<>();
    }
}
