package com.bookauther.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="author_tbl")
public class Author {
	@Id
private String autherId;
private String firstName;
private String lastName;
private String language;
@OneToOne
private Book book;
public String getAutherId() {
	return autherId;
}
public void setAutherId(String autherId) {
	this.autherId = autherId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
@Override
public String toString() {
	return "Author [autherId=" + autherId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
			+ language + ", book=" + book + "]";
}




}
