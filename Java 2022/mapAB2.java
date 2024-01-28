public class mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        String temp1 = map.get("a");
        String temp2 = map.get("b");
        if( temp1!= null && temp2!= null && temp1.equals(temp2) ) {
          map.remove("a");
          map.remove("b");
        }
        return map;
    }
}
