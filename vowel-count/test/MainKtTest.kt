import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class MainKtTest {
    class TestExample {
        @Test
        fun testFixed() {
            assertEquals(5, getCount("abracadabra"))
            assertEquals(1, getCount("test"))
            assertEquals(3, getCount("example"))
        }
    }
}