package com.zgh.design.pattern.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 *  ¹ýÂËage>0 £¬sex=boy 
 * @author zgh
 *
 */
public class ManAndAgeGreaterThan20Filter implements FilterCriteria {

	@Override
	public List<Person> filterCriteria(List<Person> persons) {
		
		return persons.stream().filter(person->person.getAge()>20).filter(person->Objects.equals(person.getSex(), "boy")).collect(Collectors.toList());
	}

}
