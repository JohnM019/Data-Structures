import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayLists {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};//initializing an array
        int[] nums2 = new int[5]; //Declaring an array using the new keyword

        //iterating the array
        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("The sum of the elements in the array is " + sumArray(nums));
        System.out.println("The largest number in the array is " + max(nums));
        System.out.println("The smallest number in the array is " + min(nums));
        System.out.println("The number " + 5 + " is in index " + search(nums, 5));
        System.out.println("The array " + Arrays.toString(nums) + " reversed is " + Arrays.toString(reverse(nums)));


        //ARRAYLISTS
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Cole");
        names.add("Cosmas");
        names.add("Aleko");

        //Iterating through an arraylist using a for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Iterating through an arraylist using a for-each loop
        for (String name : names) {
            System.out.println(name);
        }

        //Check if an arrayList contains an element
        String name = "John";
        if (names.contains(name)) System.out.println(name + " is in the list");
        else System.out.println(name + " is not in the list");


    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int max(int[] arr){
        if (arr.length == 0) return 0;
        int maxInt = arr[0];

        for (int i : arr) {
            if (i > maxInt) maxInt = i;
        }
        return maxInt;
    }

    public static int min(int[] arr){
        if (arr.length == 0) return 0;
        int minInt = arr[0];

        for (int i : arr) {
            if (i < minInt) minInt = i;
        }
        return minInt;
    }

    public static int search(int[] arr, int item) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == item) return i;
        }
        return -1;
    }

    public static int[] reverse(int[] arr) {
        int temp;
        int i = 0;
        while (i < arr.length / 2) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            i++;
        }
        return arr;
    }
}
