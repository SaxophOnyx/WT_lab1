package tasks.task_5;

import java.util.Random;

public class Sequence {
    private int[] sequence;

    public Sequence(int[] sequence) {
        this.sequence = sequence;
    }

    public Sequence(int sequenceLength, int generatorCap) {
        if (sequenceLength <= 0 || generatorCap < 0)
            throw new IllegalArgumentException();

        sequence = new int[sequenceLength];
        Random rand = new Random();

        for (int i = 0; i < sequence.length; ++i) {
            sequence[i] = rand.nextInt(0, generatorCap);
        }
    }

    public int getItemsToRemoveCount() {
        int res = 0;
        int currMax = sequence[0];

        for(int i = 0; i < sequence.length - 1; i++){
            if (sequence[i + 1] <= currMax) {
                res++;
            }
            else {
                currMax = sequence[i + 1];
            }
        }

        return res;
    }

    public void print() {
        for (int value : sequence) {
            System.out.printf("%d  ", value);
        }

        System.out.println();
    }
}
