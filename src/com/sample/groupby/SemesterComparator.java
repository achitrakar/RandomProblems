package com.sample.groupby;

import java.util.Comparator;

public class SemesterComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getSemester() == s2.getSemester()) {
			return 0;
		} else if (s1.getSemester() > s2.getSemester()) {
			return 1;
		} else {
			return -1;
		}

	}
}
