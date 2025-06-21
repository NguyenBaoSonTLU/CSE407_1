import java.util.List;

public class AverageScoreStrategy implements ScoreStrategy {
    @Override
    public float calculate(List<Float> scores) {
        if (scores == null || scores.isEmpty()) return 0;
        float sum = 0;
        for (float s : scores) {
            sum += s;
        }
        return sum / scores.size();
    }
}
