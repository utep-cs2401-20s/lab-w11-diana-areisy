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
    /*
    Second test case checks to see if the methods will work when
    given a size smaller than the length of the arrays and there are duplicates.
    PASSED :)
    */
    @Test
    public void newSorting2(){
        int[] A = {1, 1, 5, 1, 3};
        int[] B = {1, 1, 1, 3, 5};

        newSorting sort = new newSorting();
        sort.newSorting(A, 3);
        assertArrayEquals(B, A);
    }
    /*
    Third test case checks to see if the methods will work when
    given the length of the arrays as the size and includes
    negative numbers.
    PASSED :)
    */
    @Test
    public void newSorting3(){
        int[] A = {8,2,9,4,1,0,-45};
        int[] B = {-45,0,1,2,4,8,9};

        newSorting sort = new newSorting();
        sort.newSorting(A, 5);
        assertArrayEquals(B, A);
    }
    /*
    Fourth test case checks to see if the methods will work when
    the array has only 1 integer but the size is 2.
    PASSED :)
    */
    @Test
    public void newSorting4(){
        int[] A = {1};
        int[] B = {1};

        newSorting sort = new newSorting();
        sort.newSorting(A, 2);
        assertArrayEquals(B, A);
    }
    /*
    Fifth test case checks to see if the methods will work when
    the array is in order from greatest to least.
    PASSED :)
    */
    @Test
    public void newSorting5(){
        int[] A = {9,8,3,0,-300};
        int[] B = {-300,0,3,8,9};

        newSorting sort = new newSorting();
        sort.newSorting(A, 3);
        assertArrayEquals(B, A);
    }


}
