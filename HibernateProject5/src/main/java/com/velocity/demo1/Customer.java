package com.velocity.demo1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "Customer")
public class Customer {        //OneToOne Example
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name ="name")
	private String name;
	@Column (name = "mobNo")
	private long mobNo;
	
	@OneToOne (targetEntity = Shop.class, cascade = CascadeType.ALL )
	private Shop shop;
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
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", shop=" + shop + "]";
	}
	
	
	

}
