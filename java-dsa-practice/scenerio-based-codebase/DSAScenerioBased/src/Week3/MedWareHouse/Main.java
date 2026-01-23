package Week3.MedWareHouse;


class Medicine {
    String name;
    int expiryDate; // days left or YYYYMMDD format

    Medicine(String name, int expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class Main{

    // Merge Sort
    public static void mergeSort(Medicine[] meds, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(meds, left, mid);
            mergeSort(meds, mid + 1, right);

            merge(meds, left, mid, right);
        }
    }

    // Merge two sorted halves
    public static void merge(Medicine[] meds, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = meds[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = meds[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge based on expiry date
        while (i < n1 && j < n2) {
            if (L[i].expiryDate <= R[j].expiryDate) {
                meds[k++] = L[i++];
            } else {
                meds[k++] = R[j++];
            }
        }

        while (i < n1)
            meds[k++] = L[i++];

        while (j < n2)
            meds[k++] = R[j++];
    }

    // Print medicine list
    public static void printMedicines(Medicine[] meds) {
        for (Medicine m : meds) {
            System.out.println(m.name + " → Expiry: " + m.expiryDate);
        }
    }

    public static void main(String[] args) {

        Medicine[] medicines = {
            new Medicine("Paracetamol", 20250210),
            new Medicine("Cough Syrup", 20250105),
            new Medicine("Insulin", 20241220),
            new Medicine("Vitamin D", 20250315),
            new Medicine("Antibiotic", 20250101)
        };

        System.out.println("Before Sorting:");
        printMedicines(medicines);

        mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nAfter Sorting by Expiry Date:");
        printMedicines(medicines);
    }
}

