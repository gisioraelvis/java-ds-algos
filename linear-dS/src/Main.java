import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array items = new Array(4);
        items.insert(60);
        items.insert(10);
        items.insert(20);
        items.insert(50);
        items.insert(30);
        items.insert(40);

        int[] array = {20, 30, 25, 60};

        //items.removeAt(1);
        //System.out.println(items.indexOf(80));
        //items.print();
        //System.out.println(Arrays.toString(items.reverse()));
        //System.out.println( items.max());
        //System.out.println(Arrays.toString(items.intersect(array)));
        items.insertAt(100, 1);
        items.print();
    }
}