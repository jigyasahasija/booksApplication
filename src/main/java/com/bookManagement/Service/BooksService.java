package com.bookManagement.Service;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookManagement.Model.BaseResp;
import com.bookManagement.Model.Books;
import com.bookManagement.Model.SuccessResp;
import com.bookManagement.Mapper.BooksMapper;

@Service
public class BooksService {
	
	@Autowired
	BooksMapper booksMapper;

	public List<Books> getBooks() {
		return booksMapper.getAllBooks();
	}
	
	public void insertBook(Books book) {
		booksMapper.insertBook(book);
	}
	
//	public void updateBook(Books book) {
//		
//	}
	
	public void deleteBook(Integer id) {
		booksMapper.deleteBook(id);
	}
	
	public Books getBookByName(String bookName) {
		return booksMapper.getBookByName(bookName);
	}
	
	public List<Books> getBookByAuthor(String authorName){
		return booksMapper.getBookByAuthor(authorName);
	}
	
	public List<Books> getBookByGenre(String genre){
		return booksMapper.getBookByGenre(genre);
	}
	
	public List<Books> getBookByReadStatus(String readStatus){
		return booksMapper.getBookByReadStatus(readStatus);
	}
	
	public List<Books> getBookByRating(Integer rating){
		return booksMapper.getBookByRating(rating);
	}
}
