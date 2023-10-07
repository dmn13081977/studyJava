import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int count1 = 0;
        int count2 = 0;

        for (Integer x : list1) {
            if (x == elem) count1++;
        }

        for (Integer y : list2) {
            if (y == elem) count2++;
        }

        return count1 == count2;
    }
}