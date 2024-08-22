package lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {

        greetings();
        checkSign(4,5,6);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint( int 4,boolean 5,boolean true);
    }
}

    public static void greetings() { // при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
        System.out.print(" Hello \n" + " world \n" + " From \n" + " Java \n");

    }

    public static void checkSign(int a, int b, int c) { // должен посчитать их сумму, и если она больше или равна 0
        int sum = a + b + c; // то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
        if (sum >= 0) {
            System.out.println(sum + " - Сумма положительная ");
        } else {
            System.out.println(sum +" - Сумма отрицательная ");
        }

    }

    public static void selectColor() {
        int data = 15;
        if (data <= 10) { // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”
            System.out.println(" Красный ");
        } else if (data >= 11 && data <= 20) { // если от 10 до 20 включительно, то “Желтый”
            System.out.println(" Желтый ");
        } else { // если больше 20 - “Зеленый”
            System.out.println(" Зеленый ");

        }

    }

    public static void compareNumbers() {
        int a = 12;
        int b = 15;
        if (a >= b) {
            System.out.println(a + " >= " + b + " | a >= b ");
        } else {
            System.out.println(a + " < " + b + " | a < b ");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

                if (increment) {
        }
            System.out.println(initValue + delta + " - результат сложения ");
        } else {
            System.out.println(initValue - delta + " - результат вычитания ");
        }



    }
}

