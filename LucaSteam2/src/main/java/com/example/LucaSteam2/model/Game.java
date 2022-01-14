package com.example.LucaSteam2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games_project")
public class Game {
	private int id;
	private String name;
	private String year;
	private String publisher;
	private String genre;
	private String platform;
	private double na_sales;
	private double eu_sales;
	private double jp_sales;
	private double other_sales;
	private double global_sales;

	public Game() {
	}

	public Game(int id, String name, String year, String publisher, String genre, String platform, double na_sales,
			double eu_sales, double jp_sales, double other_sales, double global_sales) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.publisher = publisher;
		this.genre = genre;
		this.platform = platform;
		this.na_sales = na_sales;
		this.eu_sales = eu_sales;
		this.jp_sales = jp_sales;
		this.other_sales = other_sales;
		this.global_sales = global_sales;
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
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNa_sales() {
		return na_sales;
	}

	public void setNa_sales(double na_sales) {
		this.na_sales = na_sales;
	}

	public double getEu_sales() {
		return eu_sales;
	}

	public void setEu_sales(double eu_sales) {
		this.eu_sales = eu_sales;
	}

	public double getJp_sales() {
		return jp_sales;
	}

	public void setJp_sales(double jp_sales) {
		this.jp_sales = jp_sales;
	}

	public double getOther_sales() {
		return other_sales;
	}

	public void setOther_sales(double other_sales) {
		this.other_sales = other_sales;
	}

	public double getGlobal_sales() {
		return global_sales;
	}

	public void setGlobal_sales(double global_sales) {
		this.global_sales = global_sales;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", year=" + year + ", publisher=" + publisher + ", genre=" + genre
				+ ", platform=" + platform + ", na_sales=" + na_sales + ", eu_sales=" + eu_sales + ", jp_sales="
				+ jp_sales + ", other_sales=" + other_sales + ", global_sales=" + global_sales + "]";
	}

	
}
