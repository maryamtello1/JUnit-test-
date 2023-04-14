import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
/** add tests to check for this unit test **/
}
public void testNegative(){
/** Test data contains negative values only **/
}
public void testMixed(){
/** Test data contains with both positive, negative and zeros **/
int[] arr = {-5, 10, 0, -1, 3};
    SelectionSort sorter = new SelectionSort();
    int[] sortedArr = sorter.basicSelectionSort(arr);
    int[] expectedArr = {-5, -1, 0, 3, 10};
    assertArrayEquals(expectedArr, sortedArr);
}
public void testDuplicates(){
/** Test data contains duplicates **/
int[] arr = {10, 5, 20, 10, 30};
    SelectionSort sorter = new SelectionSort();
    int[] sortedArr = sorter.basicSelectionSort(arr);
    int[] expectedArr = {5, 10, 10, 20, 30};
    assertArrayEquals(expectedArr, sortedArr);
}
}