public class noX2 {
    public List<String> noX2(List<String> strings) {
        return strings.stream().map(x -> x.replaceAll("x", "")).collect(Collectors.toList());
      }
}
