package Day62;
import java.util.Arrays;
// https://www.youtube.com/watch?v=PgBzjlCcFvc

public class QuickSort {
    public static void main(String[] args) {
        int n = 5;
        int[] array1 = {4,1,3,9,7}; // output should be 1,3,4,7,9

        int n2 = 9;
        int[] array2 = {2,1,6,10,4,1,3,9,7}; // output should be 1,1,2,3,4,6,7,9,10

        quickSort(array1, 0, n - 1);
        System.out.println("First array: " + Arrays.toString(array1));

        quickSort(array2, 0, n2 - 1);
        System.out.println("Second array: " +Arrays.toString(array2));
    }


    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the pivot
        int i = (low - 1); // the right position of pivot found so far

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {  // If current element is smaller than the pivot
                i++; // Increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) { // swap does not work without method, video doesn't provide
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) { // arr[] --> Array to be sorted, low --> Starting index, high --> Ending index
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1); // sorting elements seperately before partition and partition
            quickSort(arr, pi + 1, high);
        }
    }
}


// Sorting algorithm uses the idea of divide and conquer.
// Finds element called pivot which divides the array into 2 halves
//- elements in left half are smaller than pivot
//- elements in the right are greater than pivot
//
// We recursively perform 3 steps
// 1. bring the pivot to its appropriate position that
// - left of pivot is smaller
// - right of pivot is greater
// 2. Quick sort of the left part
// 3. Quick sort of the right part
//
//note: in this video, Pivot is selected as the last element
//
//
//Counter Variables:
//i: index of smaller element
//j: loop variable

// First Loop   10 | 80 | 30 | 90 | 40 | 50 | 70
// Test Condition: arr[J] < = pivot | 10 < 70 TRUE
// Action1: i++
// Action2: Swap(arr[I], arr[J])
// Value of variables: I = -1, J = 0 (BEFORE)
// Value of variables: I = 0, J = 0 (AFTER)

// Second Loop  10 | 80 | 30 | 90 | 40 | 50 | 70
// Value of variables: I = -1, J = 1 (BEFORE)
// Test Condition: arr[J] < = pivot | 80 < 70 False
// Action1: NONE

// Third Loop   10 | 80 | 30 | 90 | 40 | 50 | 70
// Value of variables: I = 0, J = 2
// Test Condition: arr[J] < = pivot | 30 < 70 TRUE
// Action1: i++
// Action2: Swap(arr[I], arr[J])
// 10 | *30* | *80* | 90 | 40 | 50 | 70  // star is the swap
// Value of variables: I = 1, J = 2


// Fourth Loop   10 | 30 | 80 | 90 | 40 | 50 | 70
// Value of variables: I = 1, J = 3
// Test Condition: arr[J] < = pivot | 90 < 70 FALSE
// Action: NONE

// Fifth Loop   10 | 30 | 80 | 90 | 40 | 50 | 70
// Value of variables: I = 1, J = 4
// Test Condition: arr[J] < = pivot | 40 < 70 TRUE
// Action1: i++
// Action2: Swap(arr[I], arr[J])
// 10 | 30 | *40* | 90 | *80* | 50 | 70 // star is the swap
// Value of variables: I = 2, J = 4

// Sixth Loop   10 | 30 | 40 | 90 | 80 | 50 | 70
// Value of variables: I = 2, J = 5
// Test Condition: arr[J] < = pivot | 50 < 70 TRUE
// Action1: i++
// Action2: Swap(arr[I], arr[J])
// 10 | 30 | 40 | *50 | 80 | *90* | 70 // star is the swap
// Value of variables: I = 3, J = 5
// Value of variables: I = 3, J = 6 (Since j is now 6, get out of loop)

// We know swap arr[i+1] and pivot (i = 3 at the moment)
// 10 | 30 | 40 | 50 | 70 | 90 | 80
// Sorting left part, since its a recursion function, we call it again. 50 is the pivot. Then 40, Then 30. Then 10.
// Right of 70 is now 90, and 80. 80 is pivot. Both 80 and 90 are swapped.

// Array now sorted.





