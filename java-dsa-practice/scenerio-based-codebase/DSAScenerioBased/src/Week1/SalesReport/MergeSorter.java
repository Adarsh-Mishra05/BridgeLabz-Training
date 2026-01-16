package Week1.SalesReport;

public class MergeSorter {
	public static void mergeSort(Sale[] sales, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(sales, left, mid);
            mergeSort(sales, mid + 1, right);

            merge(sales, left, mid, right);
        }
    }

    private static void merge(Sale[] sales, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Sale[] L = new Sale[n1];
        Sale[] R = new Sale[n2];

        for (int i = 0; i < n1; i++)
            L[i] = sales[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = sales[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i].getDate().compareTo(R[j].getDate()) < 0 ||
               (L[i].getDate().equals(R[j].getDate()) &&
                L[i].getAmount() <= R[j].getAmount())) {

                sales[k++] = L[i++];
            } else {
                sales[k++] = R[j++];
            }
        }

        while (i < n1)
            sales[k++] = L[i++];

        while (j < n2)
            sales[k++] = R[j++];
    }
}
