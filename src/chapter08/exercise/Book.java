package chapter08.exercise;

import java.util.Objects;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = ++countOfBooks;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public abstract int getLateFee(int lateDays);
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(author, title);
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	//	public boolean equals(Object o) {
//		// 주소가 같은지 판단
//		if (this == o) {
//			return true;
//		}
//		// instanceof를 이용해서 변환 가능한지 판단
//		if (!(o instanceof Book)) {
//			return false;
//		}
//		Book book = (Book) o;
//		return title.equals(book.title) && Objects.equals(author, book.author);
//	}
	@Override
	public String toString() {
		return String.format("관리번호: %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)", number, title, author, getLateFee(7));
	}
	
}
