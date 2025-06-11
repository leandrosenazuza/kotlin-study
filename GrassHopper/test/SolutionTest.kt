import org.testng.annotations.Test
import org.testng.AssertJUnit.assertEquals

class SolutionTest{

    @Test
    fun basicTests() {
        assertEquals(8, move(0, 4))
        assertEquals(15, move(3, 6))
        assertEquals(12, move(2, 5))
    }

    @Test
    fun testMove() {
        assertEquals(8, move(0, 4))
        assertEquals(15, move(3, 6))
        assertEquals(12, move(2, 5))
    }
}