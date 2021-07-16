public class Main {

    public static void main(String[] args) {
    }


    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * <p>
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     * 5. * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    static boolean do_first(int a, int b) {
        if ((a + b) <= 20 && (a + b) >= 10) return true;
        return false;
    }

    static void do_second(int a){
        if (a>= 0) System.out.println("Negative");
        else System.out.println("Positive");;
    }

    static String do_third(int a){
        if (a == 0) return "Zero((";
        if (a < 0) return "Negative";
        return "Positive";
    }

    static void do_fourth(String s, int a){
        for(int i = 0;i < a; i++) System.out.println(s);
    }

    static boolean do_fifth(int year){
        if ((year%4 == 0 || year%400 ==0) & year%100!= 0 )return true;
        return false;
    }
}