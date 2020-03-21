package model;

class team{
	String name;
	String coach;
	String captain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public team(String name, String coach, String captain) {
		super();
		this.name = name;
		this.coach = coach;
		this.captain = captain;
	}
	
	
}
