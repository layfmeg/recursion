package org.example;

public class NegativeNumbers {
    public static void main(String[] args) {
        int[][] array = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        };

        System.out.println("Координаты отрицательных чисел:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("Строка: " + i + ", Колонка: " + j);
                }
            }
        }
    }
}