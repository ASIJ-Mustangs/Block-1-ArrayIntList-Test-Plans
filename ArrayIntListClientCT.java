import java.util.Arrays;
public class ArrayIntListClient {
    public static void main(String[] args) {
        int[] a1 = {15,1,7,25};
        int[] a2 = {1,7,3,65};

    }
    public static void helper(int[] elements, int[] expected){
        ArrayIntList a1 = new ArrayIntList();
        ArrayIntList a2 = new ArrayIntList();
        for(int i = 0; i < elements.length; i++){
            a1.add(elements[i]);
        }
        for(int i = 0; i < expected.length; i++){
            a2.add(elements[i]);
        }

        a1.remove(0);
        a1.set(2,3);
        a1.add(65);
        for(int i = 0; i < a2.size(); i++){
            if(a1.get(i) != a2.get(i)){
                System.out.println("fail; expect " + a2.toString() + ", actual " + a1.toString());
            }
            else{
                System.out.println("nice");
            }

        }



    }
}
