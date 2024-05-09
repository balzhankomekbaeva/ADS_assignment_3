import java.util.Scanner;

public class SortingAlgorithm {

    private int[] array;
    private Scanner scanner;

    public SortingAlgorithm() {
        scanner = new Scanner(System.in);
        createArray();
    }

    private void createArray() {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void sort() {
        System.out.println("Select the Sorting Algorithm:");
        System.out.println("1. Quick Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Heap Sort");
        System.out.println("4. Insertion Sort");
        System.out.println("5. Selection Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                QuickSort quickSort = new QuickSort();
                quickSort.sort(array);
                break;
            case 2:
                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(array);
                break;
            case 3:
                HeapSort heapSort = new HeapSort();
                heapSort.sort(array);
                break;
            case 4:
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(array);
                break;
            case 5:
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.sort(array);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        sortingAlgorithm.sort();
    }
}