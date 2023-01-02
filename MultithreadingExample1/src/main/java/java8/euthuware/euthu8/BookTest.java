package java8.euthuware.euthu8;

public class BookTest {
    private String isbn;

    public BookTest(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BookTest && ((BookTest) o).isbn.equals(this.isbn);
    }

    @Override
    public int hashCode() {
        return 100;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
