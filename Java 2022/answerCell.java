public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
          return false;
        }
        if (isMorning) {
          if (isMom) {
            return true;
          }
          return false;
        }
        return true;
    }
}
