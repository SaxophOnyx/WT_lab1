package tasks.task_13;

import tasks.task_12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        ProgrammerBook book = (ProgrammerBook)obj;
        return language.equals(book.language) &&
               level == book.level &&
               super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, level, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
               .append("Language: ").append(language).append(" ")
               .append("Level: ").append(level);

        return builder.toString();
    }
}
