package tasks.task_16;

import tasks.task_12.Book;

import java.util.Comparator;

public class TitleAuthorBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int titleRes = o1.getTitle().compareTo(o2.getTitle());
        return  (titleRes != 0) ? titleRes : (o1.getAuthor().compareTo(o2.getAuthor()));
    }
}
