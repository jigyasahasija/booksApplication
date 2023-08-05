package com.bookManagement.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bookManagement.Model.Books;

@Mapper
public interface BooksMapper {
	
	List<Books> getAllBooks();
	
	void insertBook(Books book);
	
	void deleteBook(@Param(value = "bookId") Integer bookId);
	
	Books getBookByName(@Param(value = "bookName") String bookName);
	
	List<Books> getBookByAuthor(@Param(value = "authorName") String authorName);
	
	List<Books> getBookByGenre(@Param(value = "genre") String readStatus);
	
	List<Books> getBookByReadStatus(@Param(value = "readStatus") String readStatus);
	
	List<Books> getBookByRating(@Param(value = "rating") Integer rating);
}
