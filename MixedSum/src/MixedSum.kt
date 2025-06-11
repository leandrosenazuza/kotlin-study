public class MixedSum {

    public fun sum(mixed: List<Any>): Int {
        var sumTotal = 0

        mixed.map {
            if(it is Int) {
                sumTotal += it
            }
            else if(it is String) {
                sumTotal += it.toInt()
            }
            else throw Exception()
        }

        return sumTotal;
    }
}