import tasks.components.Color;
import tasks.task_1.FormulaCalculator;
import tasks.task_2.PointPositionChecker;
import tasks.task_3.FunctionCalculator;
import tasks.task_4.PrimeNumbers;
import tasks.task_5.Sequence;
import tasks.task_6.Matrix;
import tasks.task_7.ShellSort;
import tasks.task_8.SequenceMerge;
import tasks.task_9.Ball;
import tasks.task_9.Busket;
import tasks.task_12.Book;
import tasks.task_13.ProgrammerBook;
import tasks.task_14.ClonableBook;
import tasks.task_15.ComparableBook;
import tasks.task_16.AuthorTitleBookComparator;
import tasks.task_16.AuthorTitlePriceBookComparator;
import tasks.task_16.TitleAuthorBookComparator;
import tasks.task_16.TitleBookComparator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TestTask_1();
        TestTask_2();
        TestTask_3();
        TestTask_4();
        TestTask_5();
        TestTask_6();
        TestTask_7();
        TestTask_8();
        TestTask_9();
        TestTask_12();
        TestTask_13();
        TestTask_14();
        TestTask_15();
        TestTask_16();
    }

    private static void TestTask_1() {
        double xValue = 5;
        double yValue = 6;
        FormulaCalculator formulaCalculator = new FormulaCalculator(xValue, yValue);

        System.out.println("Task 1:");
        System.out.printf("X = %.3f, Y = %.3f, Result = %.3f\n", xValue, yValue, formulaCalculator.calculate());
        System.out.println();
    }

    private static void TestTask_2() {
        int xPoint = 2;
        int yPoint = 3;
        PointPositionChecker checker = new PointPositionChecker();

        System.out.println("Task 2:");
        System.out.printf("Does area contain point: %b\n", checker.contains(xPoint, yPoint));
        System.out.println();
    }

    private static  void TestTask_3() {
        double mixX = 0;
        double maxX = 10;
        double step = 2;
        FunctionCalculator functionCalculator = new FunctionCalculator(mixX, maxX, step);
        double[][] matrix = functionCalculator.calculate();

        System.out.println("Task 3:");
        for (int i = 0; i < matrix.length; ++i) {
            System.out.printf("%.3f - %.3f\n", matrix[i][0], matrix[i][1]);
        }
        System.out.println();
    }

    private static void TestTask_4() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println("Task 4:\n Primes:");
        primeNumbers.printPrimes();
        System.out.println();
    }

    private static void TestTask_5() {
        Sequence sequence = new Sequence(16, 1000);
        int count = sequence.getItemsToRemoveCount();

        System.out.println("Task 5:");
        System.out.println("Sequence:");
        sequence.print();
        System.out.printf("Count K = %d\n", count);
        System.out.println();
    }

    private static void TestTask_6() {
        int[] vector = new int[] { 1, 2, 3, 4, 5};
        Matrix matrix = new Matrix(vector);

        System.out.println("Task 6:");
        matrix.print();
    }

    private static void TestTask_7() {
        ShellSort shell = new ShellSort();
        System.out.println("Task 7:");
        System.out.println("Before:");
        shell.print();
        System.out.println("After:");
        shell.sort();
        shell.print();
        System.out.println();
    }

    private static void TestTask_8() {
        double[] a = new double[] {1, 4, 6, 7, 8};
        double[] b = new double[] {2, 5, 7, 9, 10};
        SequenceMerge merge = new SequenceMerge(a, b);
        var indexes = merge.getIndexes();

        System.out.println("Task 8:");
        for (int i : indexes) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        System.out.println();
    }

    private static void TestTask_9() {
        Busket busket = new Busket();
        busket.addBall(new Ball(10, Color.BLUE));
        busket.addBall(new Ball(20, Color.BLUE));
        busket.addBall(new Ball(35, Color.RED));

        System.out.println("Task 9:");
        System.out.printf("Total weight = %d\n", busket.getTotalWeight());
        System.out.printf("Number of blue balls = %d\n", busket.getBallsAmount(Color.BLUE));
        System.out.println();
    }

    private static void TestTask_12() {
        Book b1 = new Book("Title", "Author", 10);
        Book b2 = new Book("Title", "Author", 10);
        Book b3 = new Book("AnotherTitle", "AnotherAuthor", 20);

        System.out.println("Task 12:");
        System.out.printf("Is book_1 equal book_2: %b\n", b1.equals(b2));
        System.out.printf("Is book_1 equal book_3: %b\n", b1.equals(b3));
        System.out.printf("Hashcodes: %d, %d, %d\n", b1.hashCode(), b2.hashCode(), b3.hashCode());
        System.out.printf("Book_3 as string: %s\n", b3);
        System.out.println();
    }

    private static void TestTask_13() {
        ProgrammerBook pBook1 = new ProgrammerBook("Title", "Author", 10, "C++", 1);
        ProgrammerBook pBook2 = new ProgrammerBook("Title", "Author", 10, "C++", 1);
        ProgrammerBook pBook3 = new ProgrammerBook("AnotherTitle", "AnotherAuthor", 90, "Java", 2);

        System.out.println("Task 13:");
        System.out.printf("Is pBook_1 equal pBook_2: %b\n", pBook1.equals(pBook2));
        System.out.printf("Is pBook_1 equal pBook_3: %b\n", pBook1.equals(pBook3));
        System.out.printf("Hashcodes: %d, %d, %d\n", pBook1.hashCode(), pBook2.hashCode(), pBook3.hashCode());
        System.out.printf("Book_3 as string: %s\n", pBook3);
        System.out.println();
    }

    private static void TestTask_14() {
        ClonableBook cBook = new ClonableBook("Title", "Author", 15);
        ClonableBook cBookClone = (ClonableBook)cBook.clone();

        System.out.println("Task 14:");
        System.out.printf("Is cBook equal cBookClone: %b\n", cBook.equals(cBookClone));
        System.out.printf("Is cBook ref equal cBookClone: %b\n", cBook == cBookClone);
        System.out.println();
    }

    private static void TestTask_15() {
        ComparableBook book = new ComparableBook("Title", "Author", 15, 1);
        ComparableBook equalBook = new ComparableBook("Title", "Author", 15, 1);
        ComparableBook greaterBook = new ComparableBook("Title", "Author", 15, 2);
        ComparableBook lesserBook = new ComparableBook("Title", "Author", 15, 0);

        System.out.println("Task 15:");
        System.out.printf("Book & EqualBook: %d\n", book.compareTo(equalBook));
        System.out.printf("Book & LesserBook: %d\n", book.compareTo(lesserBook));
        System.out.printf("Book & GreaterBook: %d\n", book.compareTo(greaterBook));
        System.out.println();
    }

    private static void TestTask_16() {
        var books = new ArrayList<Book>();
        books.add(new Book("AAA", "BBB", 1));
        books.add(new Book("AAA", "AAA", 1));
        books.add(new Book("AAA", "AAA", 4));
        books.add(new Book("CCC", "ABC", 2));
        books.add(new Book("ABC", "CCC", 2));
        books.add(new Book("BBB", "AAA", 3));

        System.out.println("Task 16:");

        System.out.println("Origin:");
        printArrayOfBooks(books);

        System.out.println("By title:");
        books.sort(new TitleBookComparator());
        printArrayOfBooks(books);

        System.out.println("By title and author:");
        books.sort(new TitleAuthorBookComparator());
        printArrayOfBooks(books);

        System.out.println("By author and title:");
        books.sort(new AuthorTitleBookComparator());
        printArrayOfBooks(books);

        System.out.println("By author, title and price:");
        books.sort(new AuthorTitlePriceBookComparator());
        printArrayOfBooks(books);

        System.out.println();
    }

    private static void printArrayOfBooks(ArrayList<Book> books) {
        for (Book b : books) {
            System.out.printf("%s\n", b.toString());
        }
        System.out.println();
    }
}