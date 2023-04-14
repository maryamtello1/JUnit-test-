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
SelectionSort sorter = new SelectionSort();

int[] expectedArr = sorter.basicSelectionSort(arr);
assertArrayEquals(Sortedarr, expectedArr);
}
public void testNegative(){
/** Test data contains negative values only **/
int[] arr = {-5, -10, -3, -1, -8};
    SelectionSort sorter = new SelectionSort();
    int[] sortedArr = sorter.basicSelectionSort(arr);
    int[] expectedArr = {-10, -8, -5, -3, -1};
    assertArrayEquals(expectedArr, sortedArr);
}
public void testMixed(){
/** Test data contains with both positive, negative and zeros **/
}
public void testDuplicates(){
/** Test data contains duplicates **/
}
}