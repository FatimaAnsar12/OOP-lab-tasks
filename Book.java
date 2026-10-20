public class Book{
	private String title;
	private String author;
	private int copies;

public Book(String title,String author,int copies){
	this.title  = title;
        this.author = author;
	this.copies=(copies>=0)?copies:0;
	System.out.println(author +""+ title +""+ copies);
	}
public Book(String title,String author){
	this("maryam","maths",1);
	this.author=author;
	this.title=title;
	System.out.println(title +""+ author);
	}
public Book(String title){
	this("unknown","author");
	this.title=title;
	System.out.println(title);
	}
}