package tasks.task_16;

import tasks.task_12.Book;

import java.util.Comparator;

public class AuthorTitlePriceBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorRes = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorRes != 0)
            return authorRes;
        else {
            int titleRes = o1.getTitle().compareTo(o2.getTitle());
            if (titleRes != 0)
                return titleRes;
            else {
                return (o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1);
            }
        }
    }
}
