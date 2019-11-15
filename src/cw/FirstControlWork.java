package cw;

/**
 * Студент %surname% %initials%
 * Группа %group%
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №1.
 *
 * Всего 10 заданий, каждое задание реализуется в виде отдельного метода.
 * Задачи могут использовать результаты предыдущей задачи.
 * Если решить задачу не удалось, но она используется в следующей, вводите данные вручную.
 * Контрольная на 10 баллов.
 */
public class FirstControlWork {
    /**
     * Метод выводит содержимое массива в строку.
     */
    public static String arrayToString(int [] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += (i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? ", " : "]");
        }
        return result;
    }

    /**
     * 1.
     * Создать массив до заданного числа такой, что каждый элемент больше предыдущего на 7.
     * Первое значение случайное от 0 до 100.
     */
    public static int [] getSevensArray(int limit) {
        
        return new int [0];
    }

    /**
     * 2.
     * Дан массив. Найти второй самый большой элемент.
     */
    public static int getSecondLargest(int [] array) {
        return 0;
    }

    /**
     * 3.
     * Написать метод сравнивающий два числа с плавающей точкой с точностью до двух разрадов.
     * @return boolean
     */
    public static boolean isDoubleEquals(double a, double b) {
        return false;
    }

    /**
     * 4.
     * Проверить является ли число простым.
     * Число является простым является простым,
     * если оно больше 1 и при этом делится без остатка только на 1 и на себя.
     * Единица не простое число.
     */
    public static boolean isPrime(int x) {
        return false;
    }

    /**
     * 5.
     * Даны две строки: слово и разделитель, вывести строку содержащую количество вхождений слова, разделенноый разделителем.
     * Например, ("Word", "X", 3) => WordXWordXWord.
     */
    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }

    /**
     * 6.
     * Сгенерировать текст классической английской песни "99 Bottles of Beer on the Wall":
     * "99 bottles of beer on the wall, 99 bottles of beer.
     * Take one down and pass it around, 98 bottles of beer on the wall.
     *
     * 98 bottles of beer on the wall, 98 bottles of beer.
     * Take one down and pass it around, 97 bottles of beer on the wall.
     *
     * ...
     *
     * 1 bottle of beer on the wall, 1 bottle of beer.
     * Take one down and pass it around, no more bottles of beer on the wall.
     *
     * No more bottles of beer on the wall, no more bottles of beer.
     * Go to the store and buy some more, 99 bottles of beer on the wall."
     *
     * Результат записать в файл.
     */
    public static void singSong() {

    }

    /**
     * 7.
     * Дана строка содержащая выходные данные книги и его ISBN.
     * Например, Блинов, И.Н., Романчик, В.С. Java. Методы программирования: уч.-мет. пособие / И.Н. Блинов, В.С. Романчик. — Минск: издательство «Четыре четверти», 2013. — 896 с. ISBN 978-985-7058-30-3.
     * Проверить ISBN на валидность и
     * получить строку вида "И.О. Фамилия: Название книги (ISBN валидный)".
     */
    public static String getBookName(String entry){
        return "";
    }

    /**
     * 8.
     * ISBN состоит из 13 цифр. Последняя цифра контрольная. Вычисляется по алгоритму EAN-13 следующим образом:
     * 1. вычисляется сумма цифр на четных позициях;
     * 2. полученная сумма умножается на три;
     * 3. вычисляется сумма цифр на нечетных местах;
     * 4. полученные числа в п.2 и п.3 складываем;
     * 5. отбрасываем десятки и отнимаем из 10, и получаем контрольную цифру.
     * Если последняя цифра числа из п.4 = 0, то контрольная цифра равна нулю.
     * @return boolean
     */
    public static boolean isISBNValid(String str){
        return false;
    }

    /**
     * 9.
     * Сделать частотный словарь букв заданной строки.
     * Например, "Abba" => "a: 2
     *                      b: 2",
     *           "java is awesome" => "a: 3
     *                                 e: 1
     *                                 i: 1
     *                                 j: 1
     *                                 m: 1
     *                                 o: 1
     *                                 s: 1
     *                                 v: 1
     *                                 w: 1".
     */
    public static String lettersFrequency(String str) {
        return "";
    }

    /**
     * Метод main() почти готов, нужно немного подредактировать.
     */
    public static void main(String[] args) {
        int [] sevens;
        System.out.println("Массив \"семёрок\": " + (sevens = getSevensArray(200)));
        System.out.printf("Вторым самым большим элементом является %d.%n", getSecondLargest(sevens));

        /* TODO:
            Проверить является ли каждый элемент массива sevens простым.
            Если является, записать в массив, затем вывести эти числа и их количество.
            Для вывода используйте готовый метод arrayToString.
         */
        int [] primes = new int[0];
        for (int value : sevens) {

        }
        if (primes.length > 0) System.out.printf("Простые числа: %s : %d.%n", arrayToString(primes), primes.length);
        else System.out.println("В массиве нет простых чисел.");

        double a = Math.random() * 100;
        double b = Math.random() * 100;
        System.out.printf(isDoubleEquals(a, b) ? "Числа %f и %f равны, с точностью до эпсилон = 0,01.%n" : "Числа %f и %f не равны.%n", a, b);

        System.out.println("('Word', 'X', 3) => " + repeatSeparator("Word", "X", 3));

        singSong();
        /* TODO:
            Прочитайте из файла, полученного в предыдущем задании, текст и вычислите для него частотный словарь букв.
         */
        String song = "";
        System.out.printf("Частотный словарь букв: %n%s", lettersFrequency(song));

        /* TODO:
            Прочитайте файл 'references.txt', в нем содержится список литературы, на каждоый строке новая запись.
            В третьей строке ISBN с ошибкой.
         */
        String filename = "references.txt";
        String entry = "";
        System.out.printf("Список литературы:%n%s%n", getBookName(entry));
    }
}
