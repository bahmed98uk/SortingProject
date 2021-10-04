import controller.theArray;
import org.junit.jupiter.api.Test;
import view.DisplayManager;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class testClass {
    @Test
    public void testArrayLength(){
        assertSame(theArray.getUnsortedArray(), theArray.unsortedArray);
    }
    @Test
    public void testUnsortedPrint(){
        assertEquals(DisplayManager.printUnsortedArray(theArray.getUnsortedArray()),
                "Unsorted Array: " + Arrays.toString(theArray.unsortedArray));
    }
}
