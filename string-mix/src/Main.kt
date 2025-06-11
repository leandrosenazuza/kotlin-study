package mix

fun mix(s1: String, s2: String): String {
    val result = StringBuilder()

    var s1List = s1.filter { it.isLowerCase() }
    var s2List = s2.filter { it.isLowerCase() }

    s1List = s1List.filter { ch -> s1List.count { it == ch } > 1 }
    s2List = s2List.filter { ch -> s2List.count { it == ch } > 1 }

    val allChars = (s1List + s2List).toSet()

    for (ch in allChars) {
        val count1 = s1List.count { it == ch }
        val count2 = s2List.count { it == ch }

        if (maxOf(count1, count2) > 1) {
            when {
                count1 > count2 -> result.append("1:${ch.toString().repeat(count1)}/")
                count2 > count1 -> result.append("2:${ch.toString().repeat(count2)}/")
                else            -> result.append("=:${ch.toString().repeat(count1)}/")
            }
        }
    }

    val listToDelivery = result.dropLast(1).split("/").toMutableList()
    listToDelivery.sortWith(
        compareByDescending<String> { it.substring(2).length }
            .thenBy { it }
    )

    return listToDelivery.joinToString("/")
}
