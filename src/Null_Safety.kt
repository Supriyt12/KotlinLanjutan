fun main(args: Array<String>) {
    //NuLLabel types
    var maybeNumber : Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}