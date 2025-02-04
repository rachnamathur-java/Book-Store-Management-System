package in.rachnamathur;

public class Main {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        //Adding book
        bookService.addLineSplitter("Test 'Add Books' Functionality");
        bookService.addBook();


        //Removing book
        bookService.addLineSplitter("Test 'Remove Books' Functionality");
        bookService.removeBook("B101");

        //Purchasing Books
        bookService.addLineSplitter("Test 'Purchase Books' Functionality");
        bookService.testPurchaseBook(bookService,"B105",5);//Success Case
        bookService.testPurchaseBook(bookService,"B107",5);//Book not Found
        bookService.testPurchaseBook(bookService,"B106",80);//Insufficient Quantity

        //After Purchasing Available books
        bookService.addLineSplitter("Test 'Available Books' Functionality");
        bookService.availableBooks();

        // Search Book by Title
        bookService.addLineSplitter("Test 'Search Book by Title' Functionality");
        bookService.testSearchBook(bookService,"Clean Code");//Success Case
        bookService.testSearchBook(bookService,"AI");// Title Not Found Exception

        //Get total inventory
        bookService.addLineSplitter("Test 'Get Inventory' Functionality");
        bookService.getInventory();

        //Printing Unique Authors name
        bookService.addLineSplitter("Test 'Unique Authors Name' Functionality");
        bookService.uniqueAuthorsName();

        //Books Titles in Order
        bookService.addLineSplitter("Test 'Titles in Order' Functionality");
        bookService.bookTitlesInOrder();
    }
}
