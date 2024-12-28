public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) { //Check the index is valid.
arr[4] = 10; //Assign a value to a valid index.
        System.out.println(arr[4]);
}
        else
        {
            System.out.println("Index out of bound");
        }
    }
}