fun main(){
    program()
    modulus()
    var w = "Hi, my name is Wambui and i am 24 years old."
println(w)
    var j = w()
    println(j)
}

fun program() {
    var names = "CodeHive"
    println(names[4].toString()+names[5]+names[6]+names[7])
}
fun modulus(){
    var x = 30
    var y = 8
    var w = 30%8
    println(w)
}
fun statement(name:String,age:Int): String {
    var w = name.toString() + age
    return w
}
fun w(): Int {
    var text = "laptop"
    var j = text.length
    return j
}