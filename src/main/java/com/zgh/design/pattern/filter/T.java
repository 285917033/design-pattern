package com.zgh.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class T {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

        persons.add(new Person("Peter", "boy", 24));
        persons.add(new Person("Mary", "girl", 22));
        persons.add(new Person("Bob", "boy", 18));
        persons.add(new Person("Lina", "boy", 20));
        persons.add(new Person("Luna", "boy", 21));
        persons.add(new Person("a", "girl", 22));
        persons.add(new Person("b", "girl", 23));
        
//        FilterCriteria boyFilter  = new ManFilter();
//        
//        List<Person> boy=  boyFilter.filterCriteria(persons);
//        
//        System.out.println(boy);
//        
        
//   FilterCriteria boyFilter  = new AgeGreaterThan20Filter();
//        
//        List<Person> boy=  boyFilter.filterCriteria(persons);
//        
//        System.out.println(boy);
        
   FilterCriteria boyFilter  = new ManAndAgeGreaterThan20Filter();
        
        List<Person> boy=  boyFilter.filterCriteria(persons);
        
        System.out.println(boy);
	}

}
