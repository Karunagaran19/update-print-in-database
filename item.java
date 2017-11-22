package org.grocery.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_TBL")
public class Item {

	public static int totalNumberOfProducts;
	static{
		totalNumberOfProducts=0;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
		
	}
  public int getTotalNumberOfProducts(){
    	return totalNumberOfProducts;
    }
	public Item(int id, int quantity, String name, double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		totalNumberOfProducts++;
	}

	public int getId() {
		return id;
	}
    
	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private int id;
	@Column(name = "ITEM_QUANTITY")
	private int quantity;
	@Column(name = "ITEM_NAME")
	private String name;
	@Column(name = "ITEM_PRICE")
	double price;
}
