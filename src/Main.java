import javax.sound.midi.Soundbank;
import java.lang.NullPointerException;
public class Main {

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
    и вывести результат расчета.
*/

    public static int CountArrayMethod(String[][] m) throws MyArrayDataException, MyArraySizeException{
        if(m.length != 4 & m[3].length != 4){
            throw new MyArraySizeException();}
        Integer[][] i = new Integer[4][4];
        int cou = 0;
        for (int j = 0; j < m.length; j++) {
            for (int k = 0; k < m[0].length; k++) {
                try{
                    cou+= Integer.parseInt(m[j][k]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException();}
                        System.out.println("MyArrayDataException");
                    }
                }
            return cou;}
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"A", "1", "1", "1"},
                                        {"2", "2", "2", "2"},
                                        {"3", "3", "3", "3"},
                                        {"4", "4", "4", "4"}};
        try {
            try {
                int cou = CountArrayMethod(arr);
                System.out.println(cou);
            } catch (MyArraySizeException e) {
                System.out.println("Array size is not as expected");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("The value is not as expected");
            System.out.println("Exception " + e.i + "x" + e.j);
        }
    }
}
