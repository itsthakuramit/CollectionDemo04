package com.stackroute.recap.list;


public class Technology {

	private int techindex;
	private String tech;
	
	public Technology() {
		
	}
	
	public Technology(int techindex, String tech) {
		this.techindex = techindex;
		this.tech = tech;
	}
	public int getTechindex() {
		return techindex;
	}
	public void setTechindex(int techindex) {
		this.techindex = techindex;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Technology [techindex=" + techindex + ", tech=" + tech + "]";
	}
	
	
	
	
}
