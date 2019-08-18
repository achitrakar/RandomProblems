package com.sample.groupby;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getDepartment().compareTo(s2.getDepartment());
	}
}
