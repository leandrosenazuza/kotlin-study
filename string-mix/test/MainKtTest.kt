import mix.mix
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test


class MainKtTest {
    @Test
    fun sampleTests() {
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", mix("Are they here", "yes, they are here"))
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
            mix("looping is fun but dangerous", "less dangerous than coding"))
    }
}