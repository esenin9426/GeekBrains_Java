import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneDirectory {
    private HashMap<String, ArrayList<String>> telefone_name = new HashMap<>();


    public void add(String name, ArrayList<String> number){
        this.telefone_name.put(name, number);
    }

    public void print(){
        System.out.println(this.telefone_name);
    }

    public void get(String name){
        System.out.println(telefone_name.get(name));
    }
}
