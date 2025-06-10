fun main() {

}

fun getCount(str: String): Int {
    var count = 0

    str.toCharArray().forEach { element ->
        if (element == 'a'
            || element == 'e'
            || element == 'i'
            || element == 'o'
            || element == 'u'
        ) {
            count++
        }
    }

    return count
}
