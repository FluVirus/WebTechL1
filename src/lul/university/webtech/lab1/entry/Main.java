package lul.university.webtech.lab1.entry;

import lul.university.webtech.lab1.fundamentals.task1.Expression;
import lul.university.webtech.lab1.fundamentals.task2.Area;
import lul.university.webtech.lab1.fundamentals.task3.ArgResPair;
import lul.university.webtech.lab1.fundamentals.task3.IntervalCalculator;
import lul.university.webtech.lab1.fundamentals.task4.PrimeFinder;
import lul.university.webtech.lab1.fundamentals.task5.SequenceAnalyzer;
import lul.university.webtech.lab1.fundamentals.task6.MatrixComposer;
import lul.university.webtech.lab1.fundamentals.task7.Sortings;
import lul.university.webtech.lab1.fundamentals.task8.SequenceDawdler;
import lul.university.webtech.lab1.oop.task9.Ball;
import lul.university.webtech.lab1.oop.task9.BallBasket;
import lul.university.webtech.lab1.oop.task9.task12.Book;
import lul.university.webtech.lab1.oop.task9.task13.ProgrammerBook;
import lul.university.webtech.lab1.oop.task9.task15.BookAuthorTitleComparator;
import lul.university.webtech.lab1.oop.task9.task15.BookAuthorTitlePriceComparator;
import lul.university.webtech.lab1.oop.task9.task15.BookTitleAuthorComparator;
import lul.university.webtech.lab1.oop.task9.task15.BookTitleComparator;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;
import static java.lang.System.lineSeparator;

public class Main {

    private static final int[] TASK_4_ARRAY = new int[]{1, 3, 24, 24, 844, 244, 195, 458, 523, 5612, 11};
    private static final int[] TASK_5_ARRAY = new int[]{1, 2, 3, 4, 8, 5, 6, 17, 11, 13, 28, 190};
    private static final double[] TASK_6_ARRAY = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
    private static final double[] TASK_7_ARRAY = new double[]{14, 1, 13, 10, -3, 18, 0, 19};
    private static final double[] TASK_8_SEQUENCE_A = new double[]{1, 10, 20, 30, 40, 45, 50, 55, 60};
    private static final double[] TASK_8_SEQUENCE_B = new double[]{5.1, 6.1, 7.1, 11.1, 12.1, 13.1, 42.1, 46.1};
    private static final Book[] TASK_14_BOOK_SEQUENCE = new Book[] {
            new Book("Людзі на балоце", "Іван Мележ", 225),
            new Book("Хрыстос прызямліўуся ў Гародне", "Уладзімір Караткевіч", 190),
            new ProgrammerBook("HTML 5 для профессионалов", "Брюс Лоусон", 300, "HTML", 80),
            new ProgrammerBook("Mastering Delphi 7","Marco Cantu",275,"Delphi", 80),
            new Book("Леаніды не вернуцца да Зямлі","Уладзімір Караткевіч", 230),
            new ProgrammerBook("Effective Modern C++","Scott Meyers", 330, "C++", 45)
    };

    public static void main(String[] args) {

        Thread.currentThread().setUncaughtExceptionHandler((thread, throwable) -> {
            StringBuilder errorMessageBuilder = new StringBuilder(throwable.getMessage()).append(lineSeparator()).append(lineSeparator());
            for (StackTraceElement element : throwable.getStackTrace()) {
                errorMessageBuilder.append(element).append(lineSeparator());
            }
            JOptionPane.showMessageDialog(null, errorMessageBuilder, throwable.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
            throwable.printStackTrace();
        });

        out.println("------Task 1-----");
        out.println(Expression.compute(10.71, 20.03));

        out.println("------Task 2-----");
        out.println(Area.isPointWithin(-1.4, 6.0));

        out.println("------Task 3-----");
        List<ArgResPair<Double, Double>> results = IntervalCalculator.calculate(Math::tan, 10.2, 100.3, 17.4);
        results.forEach(record -> out.println(record.argument() + "   |   " + record.result()));

        out.println("------Task 4-----");
        List<Integer> primeIndexes = PrimeFinder.getPrimeIndexes(TASK_4_ARRAY);
        if (primeIndexes.isEmpty()) {
            out.println("There are no prime numbers");
        } else {
            out.print("The indexes are: ");
            primeIndexes.forEach(index -> out.print(index + "  "));
            out.println();
        }

        out.println("------Task 5-----");
        int numberToExclude = SequenceAnalyzer.getNumberToExclude(TASK_5_ARRAY);
        out.println("To exclude: " + numberToExclude);

        out.println("------Task 6-----");
        double[][] matrix = MatrixComposer.composeFrom(TASK_6_ARRAY);
        for (double[] row : matrix) {
            for (double cell : row) {
                out.print(cell + " ");
            }
            out.println();
        }

        out.println("------Task 7-----");
        out.print("Initial array: ");
        for (double element : TASK_7_ARRAY) {
            out.print(element + " ");
        }
        out.println();
        out.print("Sorted array: ");
        Sortings.sortThisWay(TASK_7_ARRAY);
        for (double element : TASK_7_ARRAY) {
            out.print(element + " ");
        }
        out.println();

        out.println("------Task 8-----");
        List<Integer> positions = SequenceDawdler.getPositions(TASK_8_SEQUENCE_A, TASK_8_SEQUENCE_B);

        List<Double> sequence = new LinkedList<>();
        Arrays.stream(TASK_8_SEQUENCE_A).forEach(sequence::add);
        Arrays.stream(TASK_8_SEQUENCE_B).forEach(sequence::add);
        sequence.sort(Double::compare);
        sequence.forEach(element -> out.print(element + " "));
        out.println();

        out.print("B-positions in merged sequence (1-based): ");

        positions.forEach(position -> out.print(position + " "));
        out.println();

        out.println("------Task 9-----");
        BallBasket basket = new BallBasket()
                .add(new Ball(2.85, Color.BLUE))
                .add(new Ball(9.14, Color.RED))
                .add(new Ball(3.16, Color.GREEN))
                .add(new Ball(6.16, Color.BLUE))
                .add(new Ball(4.25, Color.GRAY));

        double weight = 0;
        int numberOfBlues = 0;
        for (Ball ball : basket) {
            weight += ball.getWeight();
            if (ball.getColor().equals(Color.BLUE)) {
                numberOfBlues++;
            }
        }
        out.println("Total weight of balls: " + weight);
        out.println("Total numbers of blue balls: " + numberOfBlues);

        out.println("------Task 14-----");
        out.println("Initial sequence:");
        Arrays.stream(TASK_14_BOOK_SEQUENCE).forEach(out::println);
        out.println();
        out.println("Sorted by default(isbn) sequence:");
        Arrays.sort(TASK_14_BOOK_SEQUENCE);
        Arrays.stream(TASK_14_BOOK_SEQUENCE).forEach(out::println);
        out.println();
        out.println("Sorted by title sequence:");
        Arrays.sort(TASK_14_BOOK_SEQUENCE, new BookTitleComparator());
        Arrays.stream(TASK_14_BOOK_SEQUENCE).forEach(out::println);
        out.println();
        out.println("Sorted by title, author sequence:");
        Arrays.sort(TASK_14_BOOK_SEQUENCE, new BookTitleAuthorComparator());
        Arrays.stream(TASK_14_BOOK_SEQUENCE).forEach(out::println);
        out.println();
        out.println("Sorted by author, title sequence:");
        Arrays.sort(TASK_14_BOOK_SEQUENCE, new BookAuthorTitleComparator());
        Arrays.stream(TASK_14_BOOK_SEQUENCE).forEach(out::println);
        out.println();
        out.println("Sorted by author, title, price sequence:");
        Arrays.sort(TASK_14_BOOK_SEQUENCE, new BookAuthorTitlePriceComparator());
        Arrays.stream(TASK_14_BOOK_SEQUENCE).forEach(out::println);
        out.println();

        out.println("------XXXXX------");

    }

}
