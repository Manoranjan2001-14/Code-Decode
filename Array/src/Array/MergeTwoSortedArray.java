package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 9, 20};
        int[] arr2 = {1, 3, 4, 5, 7, 8};

        int[] c = new int[arr1.length + arr2.length];
        merge(c, arr1, arr2);

        for (int ele : c) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
