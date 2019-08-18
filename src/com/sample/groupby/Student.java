package com.sample.groupby;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private int age;
	private String department;
	private int semester;

	public Student(int studentId, String name, int age, String department, int semester) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.department = department;
		this.semester = semester;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	private static void printStudentInfo(List<Student> students) {

		System.out.println(" ID\tName\tAge\tDepartment\t\tSemester  \n");
		System.out.println("----------------------------------------------------------");

		for (Student student : students) {
			System.out.format(" %-2d\t%-7s\t%d\t%-20s\t  %d\n", student.studentId, student.name, student.age,
					student.department, student.semester);
		}
	}

	public static void main(String[] args) {
		List<Student> studentDto = new ArrayList<>();
		//
		studentDto.add(new Student(1, "John", 28, "Computer Science", 3));
		studentDto.add(new Student(10, "Arya", 18, "Mechanical Engineering", 2));
		studentDto.add(new Student(2, "Dany", 27, "Computer Science", 2));
		studentDto.add(new Student(8, "Brandon", 19, "Computer Science", 1));
		studentDto.add(new Student(5, "Cersie", 35, "Mechanical Engineering", 4));
		studentDto.add(new Student(9, "Tyrion", 30, "Computer Science", 3));
		studentDto.add(new Student(6, "Sansa", 20, "Computer Science", 2));
		studentDto.add(new Student(4, "Hound", 45, "Electrical Engineering", 4));
		studentDto.add(new Student(7, "Jorah", 44, "Computer Science", 1));
		studentDto.add(new Student(3, "Gendry", 22, "Civil Engineering", 2));

		//
		System.out.println("Students listing before sorting...\n");
		printStudentInfo(studentDto);

		//

		Collections.sort(studentDto,
				new DepartmentComparator().thenComparing(new SemesterComparator()).thenComparing(new AgeComparator()));

		//

		System.out.println("\n\nStudents listing after sorting...\n");
		printStudentInfo(studentDto);

	}
}
