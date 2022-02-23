package san.ojili.dp;

public class LongestIncreasingSubSequenceLength {

    public static void main(String[] args) {
        int[] sequence = new int[]{1,5,3,4,6};
        int lisLength = table(sequence);
        System.out.println(lisLength);
    }

    static int table(int[] sequence) {
        if(sequence.length < 1) {
            return 0;
        }
        int[] table = new int[sequence.length];
        table[0] = 1;
        int globalMax = 1;
        for(int i=1; i<sequence.length; i++) {
            int max = maxUntil(i, table, sequence);
            table[i] = 1+max;
            globalMax = Math.max(globalMax, table[i]);
        }
        return globalMax;
    }

    static int maxUntil(int indexUpto, int[] table, int[]sequence) {
        int max=0;
        for(int i= 0; i<indexUpto; i++) {
            if(sequence[i]<sequence[indexUpto]) {
                max = Math.max(max, table[i]);
            }
        }
        return max;
    }
}
