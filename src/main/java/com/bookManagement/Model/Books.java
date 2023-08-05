package com.bookManagement.Model;


public class Books {

	private String bookName;
	private String authorName;
	private String genre;
	private int rating;
	private String readStatus;
	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", authorName=" + authorName + ", genre=" + genre + ", rating=" + rating
				+ ", readStatus=" + readStatus + "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}
}
