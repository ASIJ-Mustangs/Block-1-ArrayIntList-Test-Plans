public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();

        // we write an add method to make things easier
        list1.add(11);
        list1.add(-2);
        list1.add(1000);
        System.out.println(list1);
    }
}
