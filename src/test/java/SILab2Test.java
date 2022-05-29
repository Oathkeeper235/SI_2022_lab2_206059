import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void testEveryStatement() {
        assertEquals(SILab2.function(Arrays.asList("#", "0", "#", "#", "0", "#", "#", "0", "#")),
                Arrays.asList("#", "2", "#", "#", "2", "#", "#", "2", "#"));

        try {
            SILab2.function(Arrays.asList("#", "0", "#"));
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be a perfect square");
        }

        try {
            SILab2.function(List.of());
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be greater than 0");
        }
    }

    @Test
    public void testEveryBranch() {
        assertEquals(SILab2.function(Arrays.asList("#", "0", "#", "#", "0", "#", "#", "0", "#")),
                Arrays.asList("#", "2", "#", "#", "2", "#", "#", "2", "#"));

        try {
            SILab2.function(Arrays.asList("#", "0", "#"));
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be a perfect square");
        }

        try {
            SILab2.function(List.of());
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be greater than 0");
        }
    }
}
