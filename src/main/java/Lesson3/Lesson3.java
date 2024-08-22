package Lesson3;

public class Lesson3 {
    // Метод для подсчета суммы положительных элементов двумерного массива
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    // Метод для печати квадрата из звездочек
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Метод для обнуления диагональных элементов двумерного массива
    public static void zeroDiagonalElements(int[][] array) {
        // Обнуление главной диагонали
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }

        // Обнуление побочной диагонали
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - 1 - i] = 0;
        }
    }

    // Метод для поиска максимального элемента массива
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    // Метод для подсчета суммы элементов второй строки двумерного массива
    public static int sumSecondRow(int[][] array) {
        if (array.length == 0 || array[1] == null) {
            return -1;
        }

        int sum = 0;
        for (int element : array[1]) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Пример использования методов
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int sumPositive = sumOfPositiveElements(array);
        System.out.println("Сумма положительных элементов: " + sumPositive);

        printSquare(5);

        zeroDiagonalElements(array);
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int maxElement = findMax(array);
        System.out.println("Максимальный элемент: " + maxElement);

        int secondRowSum = sumSecondRow(array);
        System.out.println("Сумма элементов второй строки: " + secondRowSum);
    }
}