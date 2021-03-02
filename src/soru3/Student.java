package soru3;

public class Student {
	
	String studentNo;
	String name;
	String surName;
	String age;
	String department;
	
	public Student(String studentNo,String name,String surName,String age,String department) {
		this.studentNo = studentNo;
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.department = department;
	}

	
	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", Name=" + name + ", SurName=" + surName + ", Age=" + age + ", Department=" + department + "]";
	}
	
	
	//*** Setters and Getters ***
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	//***************************
	
}