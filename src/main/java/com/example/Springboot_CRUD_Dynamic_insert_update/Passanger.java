package com.example.Springboot_CRUD_Dynamic_insert_update;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="passanger")
public class Passanger 
{
@Id 
@GeneratedValue(strategy=GenerationType.AUTO)
int id ;
String name;
int age;
String city;
String sno;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}

}
