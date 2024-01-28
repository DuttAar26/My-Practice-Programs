public class wordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int x = 0; x < words.length; x++) {
          if (words[x] != target) {
            count++;
          }
        }
        String[] i = new String[count];  
        int count2 = 0;
        for (int x = 0; x < words.length; x++) {
          if (words[x] != target) {
            i[count2] = words[x];
            count2++;
          }
        }
        return i;
    }
}
