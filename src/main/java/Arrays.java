public class Arrays {
    public static void main(String[] args){

        int massif[]; // объявление массива
        massif = new int[20]; // определение массива

        /* Переменные */
        int maxNeg = -100;
        int minPos = 100;
        int indexNeg = maxNeg;
        int indexPos = minPos;

        /* Заполняем массив значениями */
        System.out.println("Массив состоит из следующих случайных чисел:");
        for (int i = 0; i < massif.length; i++) {
            massif[i] = (int) (Math.random() * 21 - 10); // генерация случайных чисел
            System.out.print(massif[i] + ";" + " ");
        }

        //Поиск элементов массива
        System.out.println();
        System.out.println("Находим максимальный отрицательный и минимальный положительный элементы массива:");

        for (int i = 0; i < massif.length; i++) {
            if (massif[i] < 0 && maxNeg < massif[i]) {
                maxNeg = massif[i];
                indexNeg = i;
            }
            if (minPos > massif[i] && massif[i] > 0) {
                minPos = massif[i];
                indexPos = i;
            }
        }

        System.out.println("maxNeg = " + maxNeg);
        System.out.println("minPos = " + minPos);
        System.out.println("Индексы найденных элементов массива:");
        System.out.println("indexNeg = " + indexNeg);
        System.out.println("indexPos = " + indexPos);

        //Смена мест найденных элементов в массиве
        System.out.println("Меняем местами найденные элементы в массиве");
        if (minPos != 100 && maxNeg != -100) {
            int tmp = massif[indexNeg];
            massif[indexNeg] = massif[indexPos];
            massif[indexPos] = tmp;
            System.out.println("massif[indexNeg]=  " + massif[indexNeg]);
            System.out.println("massif[indexPos]=  " + massif[indexPos]);
        } else
            System.out.println("Среди введенных чисел нет либо положительных либо отрицательных");

        //выводим полученный массив в консоль
        System.out.println("Полученный массив:");
        for (int aMassif : massif) {
            System.out.print(aMassif + ";" + " ");
        }
    }
}
