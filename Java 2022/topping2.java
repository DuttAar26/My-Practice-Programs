public class topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.get("ice cream") != null) {
          String temp = map.get("ice cream");
          map.put("yogurt", temp);
        }
        if (map.get("spinach") != null) {
          map.put("spinach", "nuts");
        }
        return map;
    } 
}
