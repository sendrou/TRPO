import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
public class SelectionSortTest {
    public SelectionSortTest() {
    }

    @Test
    public void testSortEmptyArray() {
        int[] arr = new int[0];
        SelectionSort.sort(arr);
        int[] expectedArr = new int[0];
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testSortSingleElementArray() {
        int[] arr = new int[]{1};
        SelectionSort.sort(arr);
        int[] expectedArr = new int[]{1};
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testSortSortedArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        SelectionSort.sort(arr);
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testSortReverseSortedArray() {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        SelectionSort.sort(arr);
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testSortArrayWithDuplicates() {
        int[] arr = new int[]{5, 1, 3, 2, 5};
        SelectionSort.sort(arr);
        int[] expectedArr = new int[]{1, 2, 3, 5, 5};
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testSortLargeArray() {
        int[] arr = new int[100000];

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = (int)(Math.random() * 100000.0);
        }

        SelectionSort.sort(arr);

        for(i = 0; i < arr.length - 1; ++i) {
            Assert.assertTrue(arr[i] <= arr[i + 1]);
        }

    }

    @Test
    public void testSortArrayWithNegativeNumbers() {
        int[] arr = new int[]{-5, -1, -3, -2, -4};
        SelectionSort.sort(arr);
        int[] expectedArr = new int[]{-5, -4, -3, -2, -1};
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test(
            expected = NullPointerException.class
    )
    public void testSortArrayWithNullElement() {
        Integer[] arr = new Integer[]{1, 2, 3, null, 4};
        int[] intArr = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        SelectionSort.sort(intArr);
        int[] expectedArr = new int[]{1, 2, 3, 4, 0};
        Assert.assertArrayEquals(expectedArr, intArr);
    }
}
