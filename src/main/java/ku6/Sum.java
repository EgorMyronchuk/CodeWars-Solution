package ku6;

public class Sum {
    public static int GetSum(int a, int b) {
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int sum = 0;
        while (min <= max) {
            sum += max;
            max--;
        }
        return sum;
    }
    public static int GetSumBestSolution(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(0, -1));
        System.out.println(GetSum(0, 5));


        System.out.println(GetSumBestSolution(-4 , 6));
    }
}

