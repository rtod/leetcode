package validParentheses;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string1 = "()[]{}";
        String string2 = "()}";
        System.out.println(solution.isValid(string1));
        System.out.println(solution.isValid(string2));
    }
}
