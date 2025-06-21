import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> scores = Arrays.asList(7.5f, 8.0f, 9.0f, 6.5f);

        ScoreContext context = new ScoreContext();

        // Sử dụng chiến lược trung bình cộng
        context.setStrategy(new AverageScoreStrategy());
        System.out.println("Trung bình cộng: " + context.calculate(scores));

        // Sử dụng chiến lược trung bình trọng số
        context.setStrategy(new WeightedScoreStrategy());
        System.out.println("Trung bình trọng số: " + context.calculate(scores));
    }
}
