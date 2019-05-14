package com.rock.algorithm.sort;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 3, 9, 4, 8, 1, 6, 7, 0};
        new InsertionSort().sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}