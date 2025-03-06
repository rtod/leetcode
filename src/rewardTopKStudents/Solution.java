package rewardTopKStudents;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] positive_feedback = {"smart", "brilliant", "studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is not studious", "the student is smart"};
        int[] student_id = {1, 2};
        int k = 2;


        System.out.println(solution.topStudents(positive_feedback, negative_feedback, report, student_id, k));
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Set<String> positive = Arrays.stream(positive_feedback).collect(Collectors.toSet());
        Set<String> negative = Arrays.stream(negative_feedback).collect(Collectors.toSet());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < report.length; i++) {
            int points = toPoints(report[i], positive, negative);
            students.add(new Student(student_id[i], points));
        }

        return students.stream().sorted(Comparator.comparing(Student::points).reversed().thenComparing(Student::id))
                .map(Student::id).limit(k).toList();
    }

    private int toPoints(String report, Set<String> positive, Set<String> negative) {
        int points = 0;
        for (String word : report.split(" ")) {
            if (positive.contains(word))
                points += 3;
            else if (negative.contains(word))
                points -= 1;
        }
        return points;
    }

    public record Student(int id, int points) {
    }
}
