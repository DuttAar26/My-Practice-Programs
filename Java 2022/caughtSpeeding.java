public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
          if (speed <= 65) {
            return 0;
          }
          if (speed >= 66 && speed <= 85) {
            return 1;
          }
          if (speed >= 86) {
            return 2;
          }
        }
        if (speed <= 60) {
          return 0;
        }
        if (speed >= 61 && speed <= 80) {
          return 1;
        }
        if (speed >= 81) {
          return 2;
        }
        return 0;
    }
}
