import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    static Filter filter;
    static List<Integer> list1 = Arrays.asList(2, 3, 6, 7);
    static List<Integer> list2 = Arrays.asList(6,7);

    @BeforeEach
    void init() {
        filter = new Filter(5);
    }

    @Test
    void filterOut() {
        list1 = filter.filterOut(list1);
        assertArrayEquals(list2.toArray(), list1.toArray());
    }
}