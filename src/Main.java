
public class Main {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Dobrinin",
                                    "Maxim",
                                    "Petrovich",
                                    "Big Boss",
                                    "dmp@ya.ru",
                                    "8888888",
                                    22,
                                    38);
        persArray[1] = new Employee("Nabiev",
                "Timyr",
                "Petrovich",
                "Big Boss",
                "ntp@ya.ru",
                "8888889",
                21,
                39);
        persArray[2] = new Employee("Kostin",
                "Sasha",
                "Petrovich",
                "Big Boss",
                "ksp@ya.ru",
                "8888810",
                20,
                40);
        persArray[3] = new Employee("Molinov",
                "Badim",
                "Petrovich",
                "Big Boss",
                "mbp@ya.ru",
                "8888811",
                19,
                41);
        persArray[4] = new Employee("Ivanov",
                "Petr",
                "Petrovich",
                "Little Boss",
                "ipp@ya.ru",
                "8888812",
                18,
                35);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() >= 40)
                System.out.println(persArray[i].toString());
        }
    }
}
