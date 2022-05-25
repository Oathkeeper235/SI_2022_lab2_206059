import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void test1() {
        assertEquals(SILab2.function(Arrays.stream("# 0 # # 0 # # 0 #".split(" ")).toList()),
                Arrays.stream("# 2 # # 2 # # 2 #".split(" ")).toList());

        try {
            SILab2.function(Arrays.stream("# 0 #".split(" ")).toList());
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be a perfect square");
        }

        try {
            SILab2.function(Arrays.stream("".split(" ")).toList());
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be greater than 0");
        }
    }

    @Test
    public void test2() {
        assertEquals(SILab2.function(Arrays.stream("# 0 # # 0 # # 0 #".split(" ")).toList()),
                Arrays.stream("# 2 # # 2 # # 2 #".split(" ")).toList());

        try {
            SILab2.function(Arrays.stream("# 0 #".split(" ")).toList());
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be a perfect square");
        }

        try {
            SILab2.function(Arrays.stream("".split(" ")).toList());
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "List length should be greater than 0");
        }
    }
}
