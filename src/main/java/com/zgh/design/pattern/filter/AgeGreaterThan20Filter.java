package com.zgh.design.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;
/**
 * age´óÓÚ20µÄ
 * @author zgh
 *
 */
public class AgeGreaterThan20Filter implements FilterCriteria {

	@Override
	public List<Person> filterCriteria(List<Person> persons) {
		
		return persons.stream().filter(person->person.getAge()>20).collect(Collectors.toList());
	}

}
