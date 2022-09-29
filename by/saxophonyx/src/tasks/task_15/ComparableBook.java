package tasks.task_15;

import java.util.Objects;

public class ComparableBook implements Comparable<ComparableBook> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition = 1;

    public ComparableBook(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        ComparableBook book = (ComparableBook) obj;
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

    @Override
    public int compareTo(ComparableBook o) {
        return (isbn < o.isbn) ? -1 : ((isbn == o.isbn) ? 0 : 1);
    }
}
