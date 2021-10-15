import controller.TheArray;
import org.junit.jupiter.api.Test;
import view.DisplayManager;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class testClass {
    @Test
    public void testArrayLength(){
        assertSame(TheArray.getUnsortedArray(), TheArray.unsortedArray);
    }

    @Test
    public void testUnsortedPrint(){
        assertEquals(DisplayManager.printUnsortedArray(TheArray.getUnsortedArray()),
                "Unsorted Array: " + Arrays.toString(TheArray.unsortedArray));
    }
}
