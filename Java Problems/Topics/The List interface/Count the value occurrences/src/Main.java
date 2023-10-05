import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int count1 = 0;
        int count2 = 0;

        for (Integer x : list1) {
            if (x == elem) count1++;
        }

        for (Integer y : list1) {
            if (y == elem) count2++;
        }

        return count1 == count2;
    }

}