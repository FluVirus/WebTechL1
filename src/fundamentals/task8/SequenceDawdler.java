package fundamentals.task8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class SequenceDawdler {

    public static List<Integer> getPositions(double[] a, double[] b) {
        var positions = new LinkedList<Integer>();
        for (int i = 0; i < b.length; i++) {
            int j;
            for (j = 0; j < a.length; j++) {
                if (b[i] < a[j]) {
                    positions.add(j+i+1); //1-based numbers
                    break;
                }
            }
            if (j == a.length) {
                positions.add(j+i+1);
            }
        }
        return Collections.unmodifiableList(positions);
    }

}

