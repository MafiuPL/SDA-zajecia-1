package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Book {

    private String title;
    private Author author;
    private int numberOfPages;
    private int releaseDate;
    private String description;
    private String[] content;
    private String category;

    public Book() {

    }


    public Book(String title, Author author, int releaseDate, String[] contents) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.content = contents;
        this.numberOfPages = content.length;
    }

    public Book(String title, Author author, int releaseDate, String description, String[] content, String category) {
        this(title, author, releaseDate, content);
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContents() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        if (actualIndex >= 0 && actualIndex < this.numberOfPages) {
            return content[actualIndex];
        } else {
            return "Brak strony";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", releaseDate='" + releaseDate + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}








