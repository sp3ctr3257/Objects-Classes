package com.ClassofPets;

public class Pet {
	private String name;
	private Integer age;
	private String location;
	private String type;

//	Code to be able to access the following (Get Methods): 

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

//	Code to be able to change (Set Methods):

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	//	two constructors(empty, all attributes)
	
	public Pet() {
	
			this.name = "Mr. Whiskers";
			this.age = 5;
			this.location = "Feline Towers";
			this.type = "Mainecoon";
	}

	public Pet(String name, Integer age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
}


