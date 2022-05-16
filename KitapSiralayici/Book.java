import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String kitapIsmi;
    private int sayfaSayisi;
    private String yazar;
    private int yayinTarihi;

    public Book(String kitap, int sayfa, String yazar, int yayin) {
        this.kitapIsmi = kitap;
        this.sayfaSayisi = sayfa;
        this.yazar = yazar;
        this.yayinTarihi = yayin;
    }


    @Override
    public int compareTo(Book book) {
        return (this.getKitapIsmi().compareTo(book.getKitapIsmi()));
    }

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapIsmi() {
        return kitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi) {
        this.kitapIsmi = kitapIsmi;
    }
}
