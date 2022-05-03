package com.example.adminser.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	int movie_id;
	String movie_name;
	String release_year;
	String language;
	int rating;
	String duration_in_minutes;
	String movie_type;
	String movie_category;
	String director_name;
	String lead_actor_name1;
	String lead_actor_name2;
	int rental_cost;
	
	Admin(){
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getRelease_year() {
		return release_year;
	}

	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDuration_in_minutes() {
		return duration_in_minutes;
	}

	public void setDuration_in_minutes(String duration_in_minutes) {
		this.duration_in_minutes = duration_in_minutes;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getLead_actor_name1() {
		return lead_actor_name1;
	}

	public void setLead_actor_name1(String lead_actor_name1) {
		this.lead_actor_name1 = lead_actor_name1;
	}

	public String getLead_actor_name2() {
		return lead_actor_name2;
	}

	public void setLead_actor_name2(String lead_actor_name2) {
		this.lead_actor_name2 = lead_actor_name2;
	}

	public int getRental_cost() {
		return rental_cost;
	}

	public void setRental_cost(int rental_cost) {
		this.rental_cost = rental_cost;
	}

	public Admin(int movie_id, String movie_name, String release_year, String language, int rating,
			String duration_in_minutes, String movie_type, String movie_category, String director_name,
			String lead_actor_name1, String lead_actor_name2, int rental_cost) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration_in_minutes = duration_in_minutes;
		this.movie_type = movie_type;
		this.movie_category = movie_category;
		this.director_name = director_name;
		this.lead_actor_name1 = lead_actor_name1;
		this.lead_actor_name2 = lead_actor_name2;
		this.rental_cost = rental_cost;
	}

	@Override
	public String toString() {
		return "Admin [movie_id=" + movie_id + ", movie_name=" + movie_name + ", release_year=" + release_year
				+ ", language=" + language + ", rating=" + rating + ", duration_in_minutes=" + duration_in_minutes
				+ ", movie_type=" + movie_type + ", movie_category=" + movie_category + ", director_name="
				+ director_name + ", lead_actor_name1=" + lead_actor_name1 + ", lead_actor_name2=" + lead_actor_name2
				+ ", rental_cost=" + rental_cost + "]";
	}
	
}
