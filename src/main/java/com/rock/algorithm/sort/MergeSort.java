package com.rock.algorithm.sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yanshi
 * Date: 2019-05-13
 * Time: 18:33
 */
public class MergeSort {

    public void sort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, 0, array.length - 1, temp);
    }

    public void sort(int[] array, int lo, int hi, int[] temp) {
        if (lo < hi) {
            int min = (lo + hi) / 2;
            sort(array, lo, min, temp);
            sort(array, min+1, hi, temp);
            merge(array, lo, min, hi, temp);
        }

    }

    public void merge(int[] array, int lo, int min, int hi, int[] temp) {
        int i = lo;
        int j = min + 1;
        int t = 0;
        while (i <= min && j <= hi) {
            if (array[i] < array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }

        while (i <= min) {
            temp[t++] = array[i++];
        }

        while (j <= hi) {
            temp[t++] = array[j++];
        }

        t = 0;
        while (lo <= hi) {
            array[lo++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{9, 4, 5, 2, 8, 6, 3, 1};
        new MergeSort().sort(test);
        for (int i : test) {
            System.out.print(i);
        }
    }
}



