package org.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int id = 0, quantity = 0;
		String name = null;
		Float price = 0.0f;
		
		while (true) {
			System.out.println("enter ch");
			System.out.println("1.insert 2.update 3.delete 4.select 5.search 6.number.of.items 7.exit");
			int ch= Integer.valueOf(bf.readLine());
			session.beginTransaction();
			switch (ch) {
			case 1: {
				System.out.println("enter id:");
				id = Integer.valueOf(bf.readLine());
				System.out.println("Enter Name");
				name = bf.readLine();
				System.out.println("Enter quantity");
				quantity = Integer.valueOf(bf.readLine());
				System.out.println("Enter price");
				price = Float.valueOf(bf.readLine());
				Item item = new Item(id, name, quantity, price);
				System.out.println(item.getId());
				System.out.println(item.getName());
				System.out.println(item.getQuantity());
				System.out.println(item.getPrice());
				System.out.println("inserted");
				break;

			}
			case 2:{
				item.setId(1);
				item.setName("2222");
				item.setQty(324);
				session.update(item);
				System.out.println("updated");
				break;
				}
			case 3:{
				item.setId(1);
				session.delete(item);
				System.out.println("deleted");
				break;
				}
			case 4:{
				System.out.println("id value"+id);
				System.out.println("name "+name);
				System.out.println("quantity"+quantity);
				System.out.println("price" +price);
				System.out.println("data selected");
				break;
				}
			case 5:{
				if(item.setId==1 || item.setId==2){
					System.out.println("data exists");
				}
				else{
					System.out.println("data does not exists");
				}
				System.out.println("data searched");
				break;
				}
			case 6: {
				System.out.println("total number of products inserted :"+Item.totalNumberOfProducts);
				System.out.println("number of items printed");
				break;
			}
			case 7:{
				System.out.println("exit operation done");
				exit(0);
				break;
				}
	
			default:{
				break;
			}
			}
				session.save(item);
				session.getTransaction().commit();
				session.close();
		}

	}

}
