package tasks.task_14;

import java.util.Objects;

public class ClonableBook implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition = 1;

    public ClonableBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        ClonableBook book = (ClonableBook)obj;
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
    public Object clone() {
        String titleCopy = new String(this.title);
        String authorCopy = new String(this.author);
        return new ClonableBook(titleCopy, authorCopy, price);
    }
}
