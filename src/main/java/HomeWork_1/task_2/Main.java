package HomeWork_1.task_2;

import java.util.Arrays;

public class Main {
    public static void qSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low; int j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            qSort(array, low, j);
        }
        if (high > low) {
            qSort(array, i, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 2, 1, 4, 9};
        int[] array1 = {5, 6, 3, 2, 2, 1, 4, 9};
        boolean count = true;
        int low = 0;
        int high = array.length - 1;
        assert low == 0;
        assert high == array.length - 1;

        qSort(array, low, high);

        if (Arrays.equals(array, array1)) {
            count = false;
        }
        assert count;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
