fun main() {

}


fun accum(s:String) : String {
    var count = 1
    var resultList = StringBuilder()

    s.toCharArray().forEach {
            element -> run {
        if(count > 1) resultList.append("-")
        resultList.append(element.uppercase())
        if(count > 1) {
            for(i in 1..count-1){
                resultList.append(element.lowercase())
            }
        }
    }
        count++
    }
    return resultList.toString()
}