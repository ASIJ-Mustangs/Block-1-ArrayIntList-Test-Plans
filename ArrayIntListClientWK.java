import java.util.Arrays;

public class ArrayIntListClient {
    public static void main(String[] args) {
        /*ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();

        // we write an add method to make things easier
        list1.add(11);
        list1.add(-2);
        list1.add(1000);
        System.out.println(list1);*/

        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = {1, 2, 6, 3, 0, 6, 5};

        int[] list3 = {3, 13, 5, 7, 4, 7, 3, 7, 10, 11};
        int[] list4 = {3, 13, 6, 5, 0, 7, 3, 7, 10, 11, 5};

        helper(list1, list2);
        helper(list3, list4);
    }

    public static void helper(int[] elements, int[] expected)
    {
        ArrayIntList list = new ArrayIntList(elements.length);
        for(int i = 0; i < elements.length; i++)
        {
            list.add(elements[i]);
        }

        System.out.println(list.size());
        System.out.println(list.get(4));
        list.set(4, 0);
        System.out.println(list.contains(2));
        System.out.println(list.contains(4));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(4));
        System.out.println(list.indexOf(5));
        //System.out.println("walrus1");
        list.add(5);
        //System.out.println("walrus2");
        list.add(2,6);
        list.remove(4);
        System.out.println(list.size());
        System.out.println(list.toString());


        for(int i = 0; i < expected.length; i++)
        {
            if(list.get(i) != expected[i])
            {
                System.out.println("fail; expect " + Arrays.toString(expected) + ", actual" + list);
            }
        }

    }
}
