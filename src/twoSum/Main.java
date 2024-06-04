package twoSum;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        print(solution.twoSum(new int[]{2,7,11,15}, 9));
        print(solution.twoSum(new int[]{3,2,4}, 6));
        print(solution.twoSum(new int[]{3,3}, 6));
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
