package org.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_ID")
public class Item {
	@Id
	@GeneratedValue
	@Column(name = "Item_id")
	private int id;
	@Column(name = "Item_name")
	private String name;
	@Column(name = "Item_quantity")
	private int quantity;
	@Column(name = "Item_price")
	private float price;
	static int totalNumberOfProducts;
	static{
		totalNumberOfProducts=0;
	}

	public Item() {
		super();
	}
	public int getTotalNumberOfProducts(){
		return totalNumberOfProducts;

	}

	public Item(int id, String name, int quantity, float price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		totalNumberOfProducts++;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}