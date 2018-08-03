import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task2 {

    ArrayList<Integer> task1DataSet =
            new ArrayList<>(Arrays.asList(1,7,2,2,2,8,13,21,1,2,18,2,8,21,9,8,1,1,1));
    ArrayList<Integer> task2DataSet =
            new ArrayList<>(Arrays.asList(1,7,2,15,2,8,13,21,1,2,18,2,8,21,9,8,1));

    @Test
    public void task1() {
        List result = FilterList.removeIfOrder(task1DataSet);
        System.out.println(result);
        assertThat(result, is(Arrays.asList(1, 7, 8, 13, 21, 1, 2, 18, 2, 8, 21, 9, 8)));
    }

    @Test
    public void task2() {
        List result = FilterList.removeIfNotOrder(task2DataSet);
        System.out.println(result);
        assertThat(result, is(Arrays.asList(7, 15, 13, 21, 18, 21, 9)));
    }
}
