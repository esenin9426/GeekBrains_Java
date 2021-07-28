public class Animals {
    private String name;

    private int maxRun = 1;
    private int maxSwi = 1;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public void setMaxSwi(int maxSwi) {
        this.maxSwi = maxSwi;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }

    public void run(int distance){
        if(distance > 0 && distance <= maxRun)
            System.out.println(name + " ran " + distance +'m');
        else if (distance > maxRun) System.out.println("Too much");
        else System.out.println("Really??");
    }

    public void swim(int distance){
        if(distance > 0 && distance <= maxSwi)
            System.out.println(name + " swam " + distance + 'm');
        else if (distance > maxSwi) System.out.println("Too much");
        else System.out.println("Really??");
    }
}
