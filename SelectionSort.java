import java.util.Random;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        System.out.print("\nOriginal Array: ");
        for (int j : arr)
            System.out.print(j + " ");

        int min, tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        System.out.print("\nSorted Array: ");
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(50);
        }
        selectionSort(arr1);

        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        selectionSort(arr2);

        int[] arr3 = { 5, 4, 3, 2, 1 };
        selectionSort(arr3);

        int[] arr4 = { 5, 5, 5, 5, 5 };
        selectionSort(arr4);

        int[] arr5 = {5};
        selectionSort(arr5);

        int[] arr6 = {};
        selectionSort(arr6);
    }
}
