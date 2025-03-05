package findCenterOfStarGraph;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] edges = {{1,2}, {2,3}, {4,2}};
        System.out.println(solution.findCenter(edges));
    }
}
