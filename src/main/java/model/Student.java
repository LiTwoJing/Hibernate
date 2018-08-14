package model;

import java.util.Date;

public class Student {
	private Integer id;
	private String name;
	private Teacher teacher;//多对一关系

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}


}
