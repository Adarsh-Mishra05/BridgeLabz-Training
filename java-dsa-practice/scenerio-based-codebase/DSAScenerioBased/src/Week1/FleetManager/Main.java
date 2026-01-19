package Week1.FleetManager;

class Main {

    static void mergeSort(int[] mileage, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(mileage, left, mid);
            mergeSort(mileage, mid + 1, right);

            merge(mileage, left, mid, right);
        }
    }

    static void merge(int[] mileage, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = mileage[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = mileage[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                mileage[k++] = L[i++];
            } else {
                mileage[k++] = R[j++];
            }
        }

        while (i < n1) mileage[k++] = L[i++];
        while (j < n2) mileage[k++] = R[j++];
    }

    static void display(int[] mileage) {
        for (int m : mileage) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vehicleMileage = {30000, 10000, 60000, 20000, 50000, 40000};

        System.out.println("Before Sorting:");
        display(vehicleMileage);

        mergeSort(vehicleMileage, 0, vehicleMileage.length - 1);

        System.out.println("After Sorting (Master Schedule):");
        display(vehicleMileage);
    }
}
