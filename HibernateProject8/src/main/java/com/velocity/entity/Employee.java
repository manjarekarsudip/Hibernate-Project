package com.velocity.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {      //ManyToMany Example

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name")
	private String name;
	@ManyToMany
	private List<Project> projects;
	
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
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", projects=" + projects + "]";
	}
	
	
}
