import java.util.*;
import java.util.stream.Collectors;

public class FilterList {

    public static List removeIfOrder(List<Integer> list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); ) {
            int count = countRepl(list, i);
            if (count < 3) {
                for (int j = 0; j < count; j++) {
                    result.add(list.get(i + count - 1));
                }
            }
            i = i + count;
        }
        return result;
    }

    private static int countRepl(List list, int from) {
        int count = 0;
        Object value = list.get(from);
        while ((list.size() > from + count) && (list.get(from + count).equals(value))) {
            count++;
        }
        return count;
    }

    public static List removeIfNotOrder(List<Integer> list) {
        return list.stream()
                .filter(x -> Collections.frequency(list, x) < 3)
                .collect(Collectors.toList());
    }
}
