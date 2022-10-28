import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array items = new Array(4);
        items.insert(10);
        items.insert(20);
        items.insert(30);
        items.insert(40);
        items.insert(50);

        //items.removeAt(1);
        //System.out.println(items.indexOf(80));
        //items.print();

        System.out.println(Arrays.toString(items.reverse()));
    }
}