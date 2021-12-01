public class MyArrayDataException extends Exception{
    public int i;
    public int j;
    public MyArrayDataException() {
        String message = "Large";
        System.out.println(message);
    }

    MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }
}
