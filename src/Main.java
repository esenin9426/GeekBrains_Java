/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи.
 С помощью метода get() искать номер телефона по фамилии.
 Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        TelephoneDirectory t = new TelephoneDirectory();
        ArrayList<String> n_1 = new ArrayList<>();
        n_1.add("24523");
        n_1.add("23423");
        t.add("sjfhvi", n_1);
        t.get("sjfhvi");

        String[] massWorlds = {"wiuhvis", "wvjis", "wvhciuf", "kwfvcij", "qwuovh",
                                "wvjis", "viu", "viu", "dvcklsd", "svj", "rieuhb"};

        distinct(massWorlds);
    }

    static void distinct (String[] mass){
        Set<String> d_mass = new HashSet<>();
        for (int i = 0; i <mass.length; i++) {
            d_mass.add(mass[i]);
        }

        for (String i:
             d_mass) {
            System.out.println(i + " " + count(i, mass));
        }
    }

    static int count (String m, String[] arr){
        int ret = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(m)) ret++;
        }
        return ret;
    }
}
