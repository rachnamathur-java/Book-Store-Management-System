package in.rachnamathur;

import java.util.Iterator;

public class BookService {
    Book book = new Book();
    BookStore bookStore = new BookStore();
    //Adding Books


    public void addBook() {
        Book book1 = new Book("B101", "Java", "James Gosling", 50.00, 10);
        Book book2 = new Book("B102", "Clean Code", "Robert C. Martin", 40.00, 15);
        Book book3 = new Book("B103", "Effective Java", "Joshua Bloch", 55.00, 18);
        Book book4 = new Book("B104", "Python", "Paul Barry", 42.00, 12);
        Book book5 = new Book("B105", "Algorithms", "Robert Sedgewick", 80.00, 25);
        Book book6 = new Book("B106", "Advanced Java", "James Gosling", 60.00, 30);

        addBook(book1);
        addBook(book2);
        addBook(book3);
        addBook(book4);
        addBook(book5);
        addBook(book6);
    }

    public void addBook(Book book) {
        bookStore.getBookArrayList().add(book);
        book.availableBookDisplay();
    }

    public void availableBooks() {

        for (Book book : bookStore.getBookArrayList()) {
            //System.out.println(book.getTitle());
            book.availableBookDisplay();
        }
    }

    public void removeBook(String id) {
        Iterator<Book> itr = bookStore.getBookArrayList().iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if (book.getBookId().equals(id)) {
                itr.remove();
            }
        }
        System.out.println("---After Removing book of Id : "+id+" ---");
        availableBooks();
        System.out.println();
    }

    public void purchaseBook(String bookId, int quantity) {
        Iterator<Book> itr = bookStore.getBookArrayList().iterator();
        boolean isBookFound = false;
        while (itr.hasNext()) {
            Book book = itr.next();
            if (book.getBookId().equals(bookId)) {
                if (quantity<=book.getAvailableQuantity()) {
                    book.setAvailableQuantity(book.getAvailableQuantity() - quantity);
                    book.setPurchaseQuantity(quantity);
                }
                System.out.println();
                if (quantity>book.getAvailableQuantity()){
                    throw new InsufficientStockException("Insufficient Quantity of : "+bookId);
                }
                bookStore.getPurchaseList().add(book);
                //System.out.println(purchaseList);
                book.purchageBookDisplay();
                isBookFound = true;
            }
        }
        System.out.println();
        if(!isBookFound){
            throw new BookNotFound("Book Id : "+bookId+" not found!");
        }
    }

    public void searchBook(String title) {
        for (Book b : bookStore.getBookArrayList()) {
            if (b.getTitle().equals(title)) {
                b.availableBookDisplay();
                System.out.println();
                break;
            }
            else{
                throw new BookNotFound("Book : "+title+" not found!");
            }
        }
    }

    public void testPurchaseBook(BookService bookService, String bookId, int quantity){
        try{
            bookService.purchaseBook(bookId, quantity);
        }catch (BookNotFound | InsufficientStockException exception){
            System.out.println(exception.getMessage());
        }
    }

    public void testSearchBook(BookService bookService, String title) {
        try {
            bookService.searchBook(title);
        } catch (BookNotFound bookNotFound) {
            System.out.println(bookNotFound.getMessage());
        }
    }

    public void getInventory() {
        double total = 0.0;
        for (Book b : bookStore.getPurchaseList()) {
            total = b.getPrice() * b.getPurchaseQuantity() + total;
        }
        System.out.println("total price : " + total);
    }

    public void bookTitlesInOrder() {
        for (Book b : bookStore.getBookArrayList()) {
            bookStore.getBookNameSet().add(b.getTitle());
        }
        for (String title : bookStore.getBookNameSet()) {
            System.out.println(title);
        }
    }

    public void uniqueAuthorsName() {
        for (Book b : bookStore.getBookArrayList()) {
            bookStore.getAuthorsNameSet().add(b.getAuthor());
        }
        for (String author : bookStore.getAuthorsNameSet()) {
            System.out.println(author);
        }
    }

    public void addLineSplitter(String message) {
        System.out.println();
        System.out.println("-------- " + message + " ------");
    }
}
