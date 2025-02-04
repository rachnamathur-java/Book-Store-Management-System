package in.rachnamathur;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String bookId;
    private String title;
    private String author;
    private Double price;
    private int availableQuantity;
    private int purchaseQuantity;

    public Book(String bookId, String title, String author, Double price, int availableQuantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availableQuantity = availableQuantity;

    }

    public Book() {
    }

    public void allBookDisplay() {
        System.out.println();
        System.out.println("Book Id : " + bookId);
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Price : " + price);
        System.out.println("Book Quantity : " + availableQuantity);
        System.out.println("Book Purchase Quantity : " + purchaseQuantity);
    }

    public void availableBookDisplay() {
        System.out.println();
        System.out.println("Book Id : " + bookId);
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Price : " + price);
        System.out.println("Book Quantity : " + availableQuantity);
    }

    public void purchageBookDisplay() {

        System.out.println();
        System.out.println("Book Id : " + bookId);
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Price : " + price);
        System.out.println("Book Purchase Quantity : " + purchaseQuantity);

    }


}
