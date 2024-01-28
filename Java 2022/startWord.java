public class startWord {
    public String startWord(String str, String word) {
        if (word.equals("") || str.equals("")) {
          return "";
        }
        if (word.length() <= 1) {
          return str.substring(0, 1);
        }
        if (str.length() <= 1) {
          return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
          return str.substring (0, word.length());
        }
        return "";
    }
}
