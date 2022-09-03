public class Generics_new {
    public static <E> void printArray(E[] elements) {
        // Display array elements
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String arg[]){
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("Array integerArray contains:");
        printArray(intArray); // pass an Integer array
        System.out.println("Array characterArray contains:");
        printArray(charArray); // pass a Character array
    }
}
