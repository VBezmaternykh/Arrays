import java.util.Scanner;

/**
 * Сложение дробных чисел
 * @author Vladislav Bezmaternykh
 */

public class Calculator {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double x, y, z;

    System.out.println("Please, enter first fractional number:");
    x = input(scanner);

    System.out.println("Please, enter second fractional number:");
    y = input(scanner);

    z = Math.round((x + y) * 10000d)/10000d;

    System.out.println("z = " + z);

    scanner.close();
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
        System.out.println("Please, enter fractional number:");
        scan.next();

    }
    return scan.nextDouble();
}
}