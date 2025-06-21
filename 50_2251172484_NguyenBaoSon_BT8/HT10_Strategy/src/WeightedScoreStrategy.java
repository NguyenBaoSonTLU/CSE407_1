import java.util.List;

public class WeightedScoreStrategy implements ScoreStrategy {
    @Override
    public float calculate(List<Float> scores) {
        if (scores == null || scores.isEmpty()) return 0;
        float weightedSum = 0;
        float totalWeight = 0;
        for (int i = 0; i < scores.size(); i++) {
            float weight = i + 1; // ví dụ: trọng số tăng dần
            weightedSum += scores.get(i) * weight;
            totalWeight += weight;
        }
        return weightedSum / totalWeight;
    }
}
