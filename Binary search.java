public class BinarySearch {
    static int search(int[] a, int t) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) return m;
            if (a[m] < t) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23};
        int res = search(a, 16);
        System.out.println(res);
    }
}
