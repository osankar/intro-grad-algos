package san.ojili.dp;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(recursive(5));
        System.out.println(dpTable(5));
    }

    static int recursive(int n) {
        if(n <=1) {
            return n;
        }
        return recursive(n-1) + recursive(n-2);
    }

    static int dpTable(int n) {
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;
        int i = 2;
        while(i <= n) {
            table[i] = table[i-1]+table[i-2];
            i++;
        }

        return table[n];
    }
}
