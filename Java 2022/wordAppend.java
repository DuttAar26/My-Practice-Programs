public class wordAppend {
    public String wordAppend(String[] strings) {
        String result="";
        Map<String, Integer> map=new HashMap<String, Integer>();
        for (String currentString:strings) {
          int i=0;
          if (map.containsKey(currentString)) {
            i=map.get(currentString)+1;
            map.put(currentString, i);
            if (i%2==0) {
              result=result+currentString;
            }
          } else {
            map.put(currentString, i+1);
          }
        }
        return result;
    } 
}
