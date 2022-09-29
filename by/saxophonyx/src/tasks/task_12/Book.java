package tasks.task_12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition = 1;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Book book = (Book)obj;
        return title.equals(book.title) &&
               author.equals(book.author) &&
               price == book.price;
    }

    @Override
    public int hashCode() {
         return Objects.hash(title, author, price, edition);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Title: ").append(title).append(" ")
               .append("Author: ").append(author).append(" ")
               .append("Price: ").append(price).append(" ")
               .append("Edition: ").append(edition).append(" ");

        return builder.toString();
    }
}
