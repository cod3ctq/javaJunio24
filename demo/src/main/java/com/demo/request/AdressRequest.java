package com.demo.request;

public class AdressRequest {
	
	private int id;
	private String title;
	private String descriptio;
	private String sCountryISOCode;
	private String countryName;
	
	
	public AdressRequest() {
	}
	public AdressRequest(int id, String title, String descriptio, String sCountryISOCode, String countryName) {
		super();
		this.id = id;
		this.title = title;
		this.descriptio = descriptio;
		this.sCountryISOCode = sCountryISOCode;
		this.countryName = countryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescriptio() {
		return descriptio;
	}
	public void setDescriptio(String descriptio) {
		this.descriptio = descriptio;
	}
	public String getsCountryISOCode() {
		return sCountryISOCode;
	}
	public void setsCountryISOCode(String sCountryISOCode) {
		this.sCountryISOCode = sCountryISOCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "AdressRequest [id=" + id + ", title=" + title + ", descriptio=" + descriptio + ", sCountryISOCode="
				+ sCountryISOCode + ", countryName=" + countryName + "]";
	}

	
	
}
