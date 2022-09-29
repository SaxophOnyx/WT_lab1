package tasks.task_16;

import tasks.task_12.Book;

import java.util.Comparator;

public class AuthorTitleBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorRes = o1.getAuthor().compareTo(o2.getAuthor());
        return  (authorRes != 0) ? authorRes : (o1.getTitle().compareTo(o2.getTitle()));
    }
}
