import java.util.LinkedList;
import java.util.Collections;

public class Pokusy {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        for (Object o : animals) {
            System.out.println(o);
        }
    }
}