
package kt


fun main(){
//    val vahice = Vehicle()
//    print("dafadsfadf")
    val list:MutableList<String> = ArrayList()

    list.add("1")
    list.add("2")
    list.add("3")

    val listTemp:MutableList<String> = ArrayList()
    listTemp.add("0")
    listTemp.addAll(list)
    listTemp.add("4")

    listTemp.forEach {
        println(it)
    }
}