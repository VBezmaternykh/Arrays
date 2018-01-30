import java.util.Scanner;

/**
 * Калькулятор + массив данных
 * @author Vladislav Bezmaternykh
 */

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double choose = -1;

        System.out.print("Выберите приложение: 1 - Калькулятор; 2 - Массивы: ");
        choose = input(scanner);

        switch ((int)choose) {
            case 1:
                Calc(scanner);
                break;
            case 2:
                Arrays(scanner);
                break;
        }
        scanner.close();
    }

    private static void Calc(Scanner cactus){
        double x, y;

        System.out.println("Введите первое дробное число:");
        x = input(cactus);

        System.out.println("Введите второе дробное число:");
        y = input(cactus);

        System.out.println("Выберите операцию, указав цифру: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int result = cactus.nextInt();

        switch (result) {
            case 1: System.out.println ("Ответ: " + Math.round((x + y) * 10000d)/10000d); break;
            case 2: System.out.println ("Ответ: " + Math.round((x - y) * 10000d)/10000d); break;
            case 3: System.out.println ("Ответ: " + Math.round((x * y) * 10000d)/10000d); break;
            case 4: System.out.println ("Ответ: " + Math.round((x / y) * 10000d)/10000d); break;
        }
    }

    /*
     Коллега познакомил с оператором цикла while.
    И помог с написанием метода ниже, для возможности проверки введеных значений.
    */

    private static double input (Scanner scan){
        while(!scan.hasNextDouble()){
            if(scan.hasNextDouble()){
                break;
            }
//        else if (scan.hasNext("quit")){
//            scan.next();
//            return 0;
//        }
            System.out.println("Некорректное значение. Пожалуйста, введите дробное число:");
            scan.next();

        }
        return scan.nextDouble();
    }

    private static void Arrays (Scanner mookhomor) {
        int a = 0;
        int b = -1;

        System.out.print("Введите число для объявления размерности массива: ");
        int size = mookhomor.nextInt();

        String[] array = new String[size]; // Создаем массив размером в переменную size

        for(int i = 0; i < size; i++) {
            System.out.print("Введите слово [" + i + "]: ");
            array[i] = mookhomor.next();
        }

        for(int i = 0; i < size; i++) {
            System.out.println("Значение [" + i + "]: " + array[i]);
        }


        for(int i = 0; i < size; i++) {
            if (array[i].length() > a) {
                a = array[i].length();
                b = i;
            }
        }
        System.out.print("Самое длинное слово: " + array[b]);
    }
}