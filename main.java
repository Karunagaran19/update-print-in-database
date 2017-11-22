package org.grocery.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		//session.beginTransaction();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// Item item = new Item();
		int id = 0, quantity = 0;
		String name = null;
		double price = 0;
		//Item item = new Item(id, quantity, name, price);
		while (true) {
			int ch =0;
			System.out.println("1.add item deatils 2.print total number in databse");
			ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1: {

				System.out.println("Enter id:");
				id = Integer.valueOf(bf.readLine());
				System.out.println("Enter name:");
				name = bf.readLine();
				System.out.println("Enter quantity:");
				quantity = Integer.valueOf(bf.readLine());
				System.out.println("Enter price:");
				price = Double.valueOf(bf.readLine());
				Item item = new Item(id,quantity,name,price);
				//Item item=session.get(Item.class, 1);
				System.out.println(item.getId());
				System.out.println(item.getName());
				System.out.println(item.getQuantity());
				System.out.println(item.getPrice());
				session.save(item);
				session.getTransaction().commit();
				
				break;
			}
			case 2: {
				System.out.println("Total number of products"+Item.totalNumberOfProducts);
				break;
			}
			default:
				break;
			}
		}
	}

}
