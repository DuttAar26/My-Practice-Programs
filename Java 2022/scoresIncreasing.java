public class scoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        for (int x = 0; x < scores.length - 1; x++) {
          if (scores[x] > scores[x + 1]) {
            return false;
          }
        }
        return true;
    }
}
