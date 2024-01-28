public class repeatSeperator {
    public String repeatSeparator(String word, String sep, int count) {
        String result = word;
        if(count == 0) return "";
        for(int i = 1; i < count; i++) {
          result = result+ sep + word ; 
        }
        return result;
    }
}
