public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
          if (cigars >= 40) {
            return true;
          }
        }
        if (cigars >= 40 && cigars <= 60) {
          return true;
        }
        return false;
    }
}
