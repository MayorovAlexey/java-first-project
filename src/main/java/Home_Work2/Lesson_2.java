package Home_Work2;

Sunday

11:16 PM







package home_work2;

public class HomeWork2 {

    Show less
    Alexey Mayorov

    public static void main(String[] args) {
        // Задание 1: Печать строки указанное количество раз
        int count = 3;
        String text = "Привет мир!";
        printStringMultipleTimes(count, text);

        // Задание 2: Сумма элементов массива, больших 5
        int[] numbers = {1, 7, 3, 9, 2, 6, 5};
        sumElementsGreaterThanFive(numbers);

        // Задание 3: Заполнение массива одним числом
        int numberToFill = 5;
        int[] arrayToFill = new int[10];
        fillArray(numberToFill, arrayToFill);
        // Выводим заполненный массив
        for (int element : arrayToFill) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Задание 4: Увеличение элементов массива на число
        int[] arrayToIncrease = {1, 3, 5, 7, 9};
        int increaseValue = 2;
        increaseArrayElements(increaseValue, arrayToIncrease);
        // Выводим измененный массив
        for (int element : arrayToIncrease) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Задание 5: Сравнение сумм половин массива
        int[] arrayToCompare = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        compareHalfSums(arrayToCompare);
    }

    // Задание 1: Печать строки указанное количество раз
    public static void printStringMultipleTimes(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // Задание 2: Сумма элементов массива, больших 5
    public static void sumElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number > 5) {
                sum += number;
            }
        }
        System.out.println("Сумма элементов массива, больших 5: " + sum);
    }

    // Задание 3: Заполнение массива одним числом
    public static void fillArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    // Задание 4: Увеличение элементов массива на число
    public static void increaseArrayElements(int increaseValue, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += increaseValue;
        }
    }

    // Задание 5: Сравнение сумм половин массива
    public static void compareHalfSums(int[] array) {
        int middle = array.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < middle; i++) {
            leftSum += array[i];
        }

        for (int i = middle; i < array.length; i++) {
            rightSum += array[i];
        }

        if (leftSum > rightSum) {
            System.out.println("Сумма элементов левой половины больше");
        } else if (rightSum > leftSum) {
            System.out.println("Сумма элементов правой половины больше");
        } else {
            System.out.println("Суммы элементов обеих половин равны");
        }
    }

    public static void main(String[] args) {
        // Задание 1: Печать строки указанное количество раз
        int count = 3;
        String text = "Привет мир!";
        printStringMultipleTimes(count, text);

        // Задание 2: Сумма элементов массива, больших 5
        int[] numbers = {1, 7, 3, 9, 2, 6, 5};
        sumElementsGreaterThanFive(numbers);

        // Задание 3: Заполнение массива одним числом
        int numberToFill = 5;
        int[] arrayToFill = new int[10];
        fillArray(numberToFill, arrayToFill);
        // Выводим заполненный массив
        for (int element : arrayToFill) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Задание 4: Увеличение элементов массива на число
        int[] arrayToIncrease = {1, 3, 5, 7, 9};
        int increaseValue = 2;
        increaseArrayElements(increaseValue, arrayToIncrease);
        // Выводим измененный массив
        for (int element : arrayToIncrease) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Задание 5: Сравнение сумм половин массива
        int[] arrayToCompare = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        compareHalfSums(arrayToCompare);
    }

    // Задание 1: Печать строки указанное количество раз
    public static void printStringMultipleTimes(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // Задание 2: Сумма элементов массива, больших 5
    public static void sumElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number > 5) {
                sum += number;
            }
        }
        System.out.println("Сумма элементов массива, больших 5: " + sum);
    }

    // Задание 3: Заполнение массива одним числом
    public static void fillArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    // Задание 4: Увеличение элементов массива на число
    public static void increaseArrayElements(int increaseValue, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += increaseValue;
        }
    }

    // Задание 5: Сравнение сумм половин массива
    public static void compareHalfSums(int[] array) {
        int middle = array.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < middle; i++) {
            leftSum += array[i];
        }

        for (int i = middle; i < array.length; i++) {
            rightSum += array[i];
        }

        if (leftSum > rightSum) {
            System.out.println("Сумма элементов левой половины больше");
        } else if (rightSum > leftSum) {
            System.out.println("Сумма элементов правой половины больше");
        } else {
            System.out.println("Суммы элементов обеих половин равны");
        }
    }
