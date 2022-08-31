package com.ClassofPets;

public class Halloween {
	
	private String coustume;
	private Integer piecesOFCandy;
	private Integer age;
	

	
	public String getCoustume() {
		return coustume;
	}
	public void setCoustume(String coustume) {
		this.coustume = coustume;
	}
	public Integer getPiecesOFCandy() {
		return piecesOFCandy;
	}
	public void setPiecesOFCandy(Integer piecesOFCandy) {
		this.piecesOFCandy = piecesOFCandy;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Halloween() {
	
}

	public Halloween(Integer piecesOfCandy, String coustume) {
	this.piecesOFCandy = 50;
	this.coustume = "Warewolf";
}

	public Halloween(Integer piecesOfCandy, String coustume, Integer age) {
	this.piecesOFCandy = 50;
	this.coustume = "Warewolf";
	this.age = 5;
	}
	
	public boolean areYouTrickorTreating() {
		return true;
}
	public String giveme () {
		return "Trick or Treat give me someting good to eat!";
	}
}
