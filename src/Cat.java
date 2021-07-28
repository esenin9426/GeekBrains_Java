public class Cat extends Animals{

    private static int countCat;

    public Cat(String name) {
        super(name);
        super.setMaxRun(200);
        countCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Really?? Cats can't swim");
    }

    public void getCountCats(){
        System.out.println(countCat);
    }
}
