package com.rock.algorithm.sort;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{9, 4, 5, 2, 8, 6, 3, 1};
        new SelectionSort().sort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
    }

}