package com.book.store.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="store")
public class Entitiystore {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String author;
	private String language;
	private int pages;
	private int price;
	public Entitiystore(int id, String name, String author, String language, int pages, int price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.language = language;
		this.pages = pages;
		this.price = price;
	}
	public Entitiystore() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	}
