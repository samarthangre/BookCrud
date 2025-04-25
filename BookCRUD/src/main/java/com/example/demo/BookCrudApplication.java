package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.BookServiceImpl;

@SpringBootApplication
public class BookCrudApplication {



	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookCrudApplication.class, args);
		
		BookService bs=context.getBean(BookServiceImpl.class);
		
		String name,aname;
		float price;
		int id;
		
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				System.out.println("""
						1.insert
						2.display
						3.update
						4.delete
						5.serachByAuthorName
						6.Exit
						Enter the choice
						""");
				int ch=sc.nextInt();
				
				switch (ch) {
				case 1 ->{
					System.out.println("Enter Book Details : ");
					System.out.println("Name : ");
					name=sc.next();
					System.out.println("Author Name : ");
					aname=sc.next();
					System.out.println("Price : ");
					price=sc.nextFloat();
					
					bs.add(new Book(name, aname, price));
				}
				case 2 ->{
					for (Book x : bs.display()) {
						System.out.println(x);
					}
				}
				case 3 ->{
					
				}
				case 4 ->{
					System.out.println("Enter the Id : ");
					id=sc.nextInt();
					bs.delete(id);
				}
				case 5 ->{
					System.out.println("enter a Author");
					aname=sc.next();
					
					bs.search(aname).forEach(System.out::println);
				}
				
				default ->
					System.out.println("invalid choice");
				}
			}
	}

}
