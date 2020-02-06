package com.zgh.design.pattern.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * ���w�^�V�l���� ���F�^�V�l���ӿ�  �����Ա�Ϊ�е� 
 * @author zgh
 *
 */
public class ManFilter implements FilterCriteria {

	public List<Person> filterCriteria(List<Person> persons) {
		
		return persons.stream().filter(person->Objects.equals(person.getSex(), "boy")).collect(Collectors.toList());
	}

}
