package model;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private Integer studynumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getStudynumber() {
		return studynumber;
	}

	public void setStudynumber(Integer studynumber) {
		this.studynumber = studynumber;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student(String name, Integer age, Integer studynumber) {
		super();
		this.name = name;
		this.age = age;
		this.studynumber = studynumber;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studynumber=" + studynumber + "]";
	}

}
