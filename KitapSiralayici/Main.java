import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Dune ",712,"Frank Herbert ",1965));
        books.add(new Book("Red Rising ",448,"Pierce Brown ",2014));
        books.add(new Book("Animal Farm ",152,"George Orwell ",1945));
        books.add(new Book("Morning Star ",518,"Pierce Brown ",2016));
        books.add(new Book("Golden Son ",464,"Pierce Brown ",2015));

        System.out.println("A'dan Z'ye Siralama");
        System.out.println("-------------------");

        for(Book book: books) {
            System.out.println(book.getKitapIsmi() + book.getYazar() + book.getSayfaSayisi() + book.getYayinTarihi());
        }

        TreeSet<Book> bookPage = new TreeSet<>(Comparator.comparingInt(book1 -> book1.getSayfaSayisi()));
        System.out.println();

        bookPage.add(new Book("Dune ",712,"Frank Herbert ",1965));
        bookPage.add(new Book("Red Rising ",448,"Pierce Brown ",2014));
        bookPage.add(new Book("Animal Farm ",152,"George Orwell ",1945));
        bookPage.add(new Book("Morning Star ",518,"Pierce Brown ",2016));
        bookPage.add(new Book("Golden Son ",464,"Pierce Brown ",2015));


        System.out.println("Sayfa Sayisina Gore Siralama");
        System.out.println("------------------");

        for(Book book: bookPage){
            System.out.println(book.getKitapIsmi() + book.getYazar() + book.getSayfaSayisi() + " " +  book.getYayinTarihi());
        }
    }
}
