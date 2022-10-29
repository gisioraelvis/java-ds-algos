public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        System.out.println("Items length: " + items.length);
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    private void expandArrayCapacity() {
        int[] newItems = new int[count * 2];
        for (int i = 0; i < count; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    public void insert(int item) {
        if (items.length == count) {
            expandArrayCapacity();
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }

        //To prevent "Index n out of bounds for length n" exception
        if (items.length == count) {
            expandArrayCapacity();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {

        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    //reverse the array
    public int[] reverse() {
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = items[count - i - 1];
        }
        return reversed;
    }

    public int max(){
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }
        return max;
    }
    public int[] intersect(int[] array) {
        int[] common = new int[count];
        int k = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < array.length; j++) {
                if (items[i] == array[j]) {
                    common[k++] = items[i];
                }
            }
        }
        return common;
    }

    public void insertAt(int item, int index){
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }

        //To prevent "Index n out of bounds for length n" exception
        if (items.length == count) {
            expandArrayCapacity();
        }

        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
        count++;
    }

}
