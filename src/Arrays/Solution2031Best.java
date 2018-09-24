package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Решения задачи 2031 с помощью коллекций,
 * думаю тебе будет интересно
 * Created by sbt-moiseenko-nv on 05.12.2017.
 */
public class Solution2031Best {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /*
         * Создадим объект класса TreeSet - коллекция, множество уникальных элементов.
         * Какие примущества?
         * - не надо париться на счёт размера, коллекции бесконечно большие
         * - работать с методами легче, чем с неотесанным массивом
         *
         *
         * Создание объекта TreeSet
         *
         * 1.Пишем имя класса TreeSet
         *
         * 2.Даллее в скобках <> указываем с каким типом она будет работать.
         * Эти скобки принимают на вход только ссылочный тип объект, поэтому мы не можем написать <int>,
         * А пишем <Integer>. Integer - класс, обёртка для примитивного типа int, созданная разработчиками java.
         * (Также для других примитивных есть обёртки)
         *
         * 3. Имя переменной - uniqueElements
         *
         * 4. = new TreeSet<Integer>() - создаём объект класса в памяти
         * и ложим ссылку на него в переменную uniqueElements
         *
         *------------------------------------------------------------------------------------
         *
         * Также создадим ArrayList - объект для хранения не уникальных элементов на основе оьычного массива.
         * Это тоже коллекция.
         *
         * За нас всё уже написали, так почему бы не воспольховаться этим
         * И совершенно не нужно итерироваться по массиву 3 раза)
         */

        TreeSet<Integer> uniqueElements = new TreeSet<Integer>();
        ArrayList<Integer> elements = new ArrayList<Integer>();

        /*
         * Метод contains коллекций Set и List принимает в качестве аргумента объект, в данном случае Integer,
         * возвращает значение boolean true ли false, взависимости от того, есть поданный аргумент в коллекции или нет.
         *
         * Метод add добвавляет значение в коллекцию.
         */
        for (int i = 0; i < n; i++) {
            int currentElement = scanner.nextInt();
            if (elements.contains(currentElement))
                uniqueElements.add(currentElement);
            else
                elements.add(currentElement);
        }

        /*
         * Метод size возращает длину коллекции
         *
         * TreeSet - это коллекция, которая всегда отсортирована, поэтому не нужно её сортировать.
         */
        System.out.println(uniqueElements.size());
        for (Integer uniqueElement : uniqueElements)
            System.out.print(uniqueElement + " ");

        /*
         * Классы Collections и классы Arrays - классы которые содержат в себе статистические методы(маленькие утилиты),
         * которы очень полезны при работе с коллекциями и массивами соответсвенно.
         */
    }
}
