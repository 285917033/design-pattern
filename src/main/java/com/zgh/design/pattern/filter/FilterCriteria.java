package com.zgh.design.pattern.filter;

import java.util.List;

/**
 * �^�V�l���ӿ�
 * @author zgh
 *
 */
public interface FilterCriteria {

	
	List<Person> filterCriteria(List<Person> persons);
}
