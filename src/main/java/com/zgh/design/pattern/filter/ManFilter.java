package com.zgh.design.pattern.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * 具體過濾條件， 實現過濾條件接口  过滤性别为男的 
 * @author zgh
 *
 */
public class ManFilter implements FilterCriteria {

	public List<Person> filterCriteria(List<Person> persons) {
		
		return persons.stream().filter(person->Objects.equals(person.getSex(), "boy")).collect(Collectors.toList());
	}

}
