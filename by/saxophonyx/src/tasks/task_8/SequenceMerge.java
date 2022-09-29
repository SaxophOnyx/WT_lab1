package tasks.task_8;

import java.util.ArrayList;
import java.util.LinkedList;

public class SequenceMerge {
    private double[] sequenceA;
    private double[] sequenceB;

    public SequenceMerge(double[] a, double[] b) {
        sequenceA = a;
        sequenceB = b;
    }

    public ArrayList<Integer> getIndexes() {
        var res = new ArrayList<Integer>();

        int aI = 0;
        int bI = 0;
        int indexOffset = 0;

        while (aI < sequenceA.length && bI < sequenceB.length) {
            if (sequenceB[bI] <= sequenceA[aI]) {
                res.add(aI + indexOffset);
                ++indexOffset;
                ++bI;
            }
            else {
                ++aI;
            }
        }

        return res;
    }
}
