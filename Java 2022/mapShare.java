public class mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.get("a") != null) {
          map.put("b", map.get("a"));
        }
        return map;
    } 
}
