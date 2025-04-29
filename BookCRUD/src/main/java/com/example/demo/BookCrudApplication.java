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
	}

}