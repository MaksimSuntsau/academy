package by.academy.classwork.lesson17;

import jdk.jfr.Description;

public class Cat {
	
	@Description("возраст кота")
	private int age;
	public final String name;

	public Cat() {
		name = "";
	}

	public Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Description("возраст кота")
	public final int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	protected void printName() {
		System.out.println(name);
	}

	

}
