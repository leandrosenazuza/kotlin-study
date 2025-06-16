fun main() {

}

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    var result = arrayOf(0,0)
    if(input?.isEmpty() == true || input == null) return arrayOf()
    var negatives = 0
    var positives = 0

    for(element in input!!) {
        if(element < 0) negatives = element + negatives
        else if(element > 0) positives++
        else{}
    }
    result[0] = positives
    result[1] = negatives

    return result
}