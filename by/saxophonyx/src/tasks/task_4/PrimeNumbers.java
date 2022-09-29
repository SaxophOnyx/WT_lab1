package tasks.task_4;

import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbers {
    private final int ARRAY_LENGTH = 100;
    private final int RAND_BOUND = 100;
    private int[] numbers;

    public PrimeNumbers() {
        Random rand = new Random();
        numbers = new int[ARRAY_LENGTH];

        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = rand.nextInt(0, RAND_BOUND);
        }
    }

    public void printPrimes() {
        for (int i = 0; i < numbers.length; ++i) {
            if (isPrime(numbers[i]))
                System.out.printf("Value %2d under the index %2d is prime\n", numbers[i], i);
        }
    }

    private boolean isPrime(int value) {
        if (value == 2)
            return true;

        if (value <= 0 || value == 1 || value % 2 == 0)
            return false;

        for (int i = 3; i < Math.sqrt(value) + 1; i += 2)
        {
            if (value % i == 0)
                return false;
        }

        return true;
    }
}
