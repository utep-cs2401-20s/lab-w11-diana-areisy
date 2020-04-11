import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {
    /*
    First test case checks to see if the methods will work when
    given a size smaller than the length of the arrays.
    PASSED :)
    */
    @Test
    public void newSorting1(){
        int[] A = {2, 4, 5, 1, 3};
        int[] B = {1, 2, 3, 4, 5};

        newSorting sort = new newSorting();
        sort.newSorting(A, 3);
        assertArrayEquals(B, A);
    }
}
