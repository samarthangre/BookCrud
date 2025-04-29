package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bs;
	
	@PostMapping("/add")
	public void add(@RequestBody Book book) {
		bs.add(book);
	}
	
	
	@GetMapping("/display")
	public List<Book>display(){
		return bs.display();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		bs.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody Book b, @PathVariable Integer id) {
		b.setId(id);
		bs.add(b);
	}
	
//	@PostMapping("/search/{authorName}")
//	public void search(@PathVariable String authorName) {
//		
//	}
	
}
