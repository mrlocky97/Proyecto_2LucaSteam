package com.example.LucaSteam2.model;

public class Game {
	private String name;
	private String year;
	private String publisher;
	private String genre;
	private String platform;
	
	
	
	public Game() {
	}

	public Game(String name, String year, String publisher, String genre, String platform) {
		this.name = name;
		this.year = year;
		this.publisher = publisher;
		this.genre = genre;
		this.platform = platform;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
