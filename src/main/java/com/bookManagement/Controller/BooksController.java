package com.bookManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookManagement.Model.BaseResp;
import com.bookManagement.Model.Books;
import com.bookManagement.Service.BooksService;

@RestController
@RequestMapping(path = "books")
public class BooksController {

	@Autowired
	private BooksService booksService;
	

	@GetMapping("/all/get")
	public List<Books> getBooks() {
		return booksService.getBooks();
	}
	
	@PostMapping("insert")
	public void insertBook(@RequestBody Books book) {
		booksService.insertBook(book);
	}
	
	@PostMapping("/delete/{bookId}")
	public void deleteBook(@PathVariable Integer bookId) {
		booksService.deleteBook(bookId);
	}
	
	@GetMapping("/get/bookname")
	public Books getBookByName(@RequestParam(value = "bookName") String bookName) {
		return booksService.getBookByName(bookName);
	}
	
	@GetMapping("/get/authorname")
	public List<Books> getBookByAuthor(@RequestParam(value = "authorName") String authorName) {
		return booksService.getBookByAuthor(authorName);
	}
	
	@GetMapping("/get/genre")
	public List<Books> getBookByGenre(@RequestParam(value = "genre") String genre) {
		return booksService.getBookByGenre(genre);
	}
	
	@GetMapping("/get/readstatus")
	public List<Books> getBookByReadStatus(@RequestParam(value = "readStatus") String readStatus) {
		return booksService.getBookByReadStatus(readStatus);
	}
	
	@GetMapping("/get/rating")
	public List<Books> getBookByRating(@RequestParam(value = "rating") Integer rating) {
		return booksService.getBookByRating(rating);
	}
	
	
	

}
