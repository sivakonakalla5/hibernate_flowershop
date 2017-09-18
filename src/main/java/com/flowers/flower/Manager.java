package com.flowers.flower;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MANAGER")
@Embeddable
public class Manager {
	
	@Id
	@Column(name = "MID", nullable=false)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String managerId;
	
	@Column(name = "MANAGERNAME", nullable=false)
	private String managerName;
	
	//@ManyToOne
	//FlowerShop flowerShopM;
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	

}
