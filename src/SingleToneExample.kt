class SingleToneExample private constructor() {

    companion object{
        private  var checkSingleTone: SingleToneExample? = null
        private  val checkSingleToneNon: SingleToneExample? = null
         fun getInstance(): SingleToneExample {
            if (checkSingleTone == null) {
                checkSingleTone=SingleToneExample()
            }
            return checkSingleTone as SingleToneExample
        }
        fun getiIn() {

        }
    }
}
object SingleToneTwo {
    fun mainCheck() {
        println("Object Example ")
    }
}

fun main() {
    var sigleTone=SingleToneExample.getInstance()
    var sigleTone2=SingleToneExample.getInstance()
    println("${sigleTone}")
    println("${sigleTone2}")
    var singleToneObject = SingleToneTwo.mainCheck()
    var singleToneObjectD2 = SingleToneTwo
    println("${singleToneObjectD2.mainCheck()}")
    println("${singleToneObject}")

}
