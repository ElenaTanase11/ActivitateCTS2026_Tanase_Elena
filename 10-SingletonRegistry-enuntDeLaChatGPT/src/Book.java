public class Book implements IBook{
    private String title;
    private String autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return autor;
    }
}
