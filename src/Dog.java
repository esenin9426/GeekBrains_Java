public class Dog  extends Animals{

    private static int countDog;

    public Dog(String name) {
        super(name);
        super.setMaxRun(500);
        super.setMaxSwi(10);
        countDog++;
    }

    public void getCountDogs(){
        System.out.println(countDog);
    }
}
