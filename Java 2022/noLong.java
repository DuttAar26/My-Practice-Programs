public class noLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() > 3);
        return strings;
    }
}
