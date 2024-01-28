public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map= new HashMap<String, String>();
        for (String currentString:strings) {
          String firstLetter = currentString.substring(0, 1);
          if (map.containsKey(firstLetter)) {
            map.put(firstLetter, map.get(firstLetter)+currentString);
          } else {
            map.put(firstLetter, currentString);
          }
        }
        return map;
      }      
}
