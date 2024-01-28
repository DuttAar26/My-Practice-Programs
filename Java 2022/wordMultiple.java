public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map=new HashMap<String,Boolean>();
        for (String currentString:strings) {
          if (map.containsKey(currentString)) {
            map.put(currentString, true);
          } else {
            map.put(currentString,false);
          }
        }
        return map;
    }      
}
