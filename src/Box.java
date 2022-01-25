import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box;
    private double weight = 0.0;

    public void addFruit(T fruit){
        box.add(fruit);
        weight+= fruit.getWeight();
    }

    public double getWeight(){
        return weight;
    }

    public boolean compare(Box compare){
        return (this.weight == compare.getWeight()) ? false : true;
    }

    public Box empty(Box goal){
        for (T i: box) { goal.addFruit(i);}
        this.box.clear();
        this.weight = 0;
        return goal;
    }

}
