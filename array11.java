public class array11 {
    public static void main(String[] args) {

        int a[] = {1, 3, 6};
        int b[] = {2, 4, 8};

        int c[] = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // merge sorted arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        // median logic
        int d = c.length;

        if (d % 2 != 0) {   // ODD length
            System.out.println("Median = " + c[d / 2]);
        } else {            // EVEN length
            double median = (c[d / 2 - 1] + c[d / 2]) / 2.0;
            System.out.println("Median = " + median);
        }
    }
}

