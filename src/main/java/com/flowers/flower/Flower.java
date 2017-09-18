package com.flowers.flower;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FLOWER")
public class Flower {
	@Id
	@Column(name = "FID", nullable=false)
	private String flowerId;
	
	@Column(name = "FLOWERTYPE", nullable=false)
	private String flowerType;
	
	@Column(name = "WEEKLYSALES", nullable=false)
	private String weeklySales;
	
	//@ManyToOne
	//FlowerShop flowerShopF;
//	@ManyToOne(fetch=FetchType.LAZY)
////	@JoinColumn(name=" FLOWERSHOP_NAME")
//	public FlowerShop getname(){
//		return this.name;
//	}
//	
//	public void setname(FlowerShop name){
//		this.name=name;
//	}
	
	public String getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(String flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public String getWeeklySales() {
		return weeklySales;
	}
	public void setWeeklySales(String weeklySales) {
		this.weeklySales = weeklySales;
	}
	
	
}
