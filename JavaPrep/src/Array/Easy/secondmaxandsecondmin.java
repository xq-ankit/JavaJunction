 public static int[] getSecondOrderElements(int n, int[] a) {
        int max = a[0];
        int min = a[0];
        int Smax = Integer.MIN_VALUE;
        int Smin = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                Smax = max;
                max = a[i];
            } else if (a[i] > Smax && a[i] != max) {
                Smax = a[i];
            }

            if (a[i] < min) {
                Smin = min;
                min = a[i];
            } else if (a[i] < Smin && a[i] != min) {
                Smin = a[i];
            }
        }

        int[] sol = {Smax, Smin};
        return sol;
    }
}