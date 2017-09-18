package com.flowers.flower;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FLOWERSHOP")
public class Flowershop {
	
	@Id
	@Column(name = "FSID", nullable=false)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String flowerShopId;
	
	@Column(name = "SHOPNAME", nullable=false)
	private String flowerShopName;
//	private String typesOfFlowers;
	
	
//	@JoinTable
//	  (
//	      name="FLOWER_TYPE",
//	      joinColumns={ @JoinColumn(name="EMP_ID", referencedColumnName="FSID") },
//	      inverseJoinColumns={ @JoinColumn(name="PHONE_ID", referencedColumnName="FID", unique=true) }
//	  )
	@OneToMany
	@CollectionTable(name="FLOWERSHOP_FLOWER")
	private List<Flower> flowers = new ArrayList<Flower>();
	
	@OneToMany
	@CollectionTable(name="FLOWERSHOP_SHOPMANAGERS")
	private List<Manager> managers = new ArrayList<Manager>();
	
	public String getFlowerShopId() {
		return flowerShopId;
	}
	public void setFlowerShopId(String flowerShopId) {
		this.flowerShopId = flowerShopId;
	}
	public String getFlowerShopName() {
		return flowerShopName;
	}
	public void setFlowerShopName(String flowerShopName) {
		this.flowerShopName = flowerShopName;
	}
	
//	public String getTypesOfFlowers() {
//		return typesOfFlowers;
//	}
//	public void setTypesOfFlowers(String typesOfFlowers) {
//		this.typesOfFlowers = typesOfFlowers;
//	}
	

	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public List<Flower> getFlowers() {
		return flowers;
	}
	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}
}
