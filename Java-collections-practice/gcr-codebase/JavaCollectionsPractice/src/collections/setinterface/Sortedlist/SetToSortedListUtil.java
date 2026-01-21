package collections.setinterface.Sortedlist;

import java.util.*;

public class SetToSortedListUtil {

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);   
        return list;
    }
}
