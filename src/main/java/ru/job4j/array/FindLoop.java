package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i : data) {
            if (FindLoop.indexOf(data, start) <= FindLoop.indexOf(data, i) && FindLoop.indexOf(data, i) < FindLoop.indexOf(data, finish)) {
                rst++;
            }
        }
        return rst + 1;
    }
}
