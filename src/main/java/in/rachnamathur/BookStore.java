package in.rachnamathur;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

@Getter
public class BookStore {
    private ArrayList<Book> bookArrayList;
    private LinkedList<Book> purchaseList;
    private HashSet<String> authorsNameSet;
    private TreeSet<String> bookNameSet;

    public BookStore() {
        bookArrayList = new ArrayList<>();
        purchaseList = new LinkedList<>();
        authorsNameSet = new HashSet<>();
        bookNameSet = new TreeSet<>();
    }


}
