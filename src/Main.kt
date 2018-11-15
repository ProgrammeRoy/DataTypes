fun main(args: Array<String>){

//INT
    var numInt1:Int
    numInt1=-10

    var numInt2=20

//FLOAT
    var numFloat:Float
    numFloat=-2.2f

    var numFloat2=1.1f

//DOUBLE
    var numDouble:Double
    numDouble=-2.2

    var numDouble2=3.3

//SAVE VAR FLOAT INTO INT
    var numFloat4 = 4.4f
    var numInt3:Int
    numInt3=numFloat4.toInt()

//SAVE VAR INT INTO STRING
    var numInt4=5
    var stringNew="world"
    stringNew = numInt4.toString()

//BOOLEAN : true, false always lower
    var verdad:Boolean
    verdad=true

    var falso:Boolean
    falso=false

//CHAR
    var letra:Char
    letra='a'

    var letra2='b'

//STRING
    var palabra:String
    palabra="home"

    var palabra2="build"

//RETURN LETTER(POSITION)
    var palabra3="colmillo blanco"
    println(palabra3)
    println(palabra3.get(3))

//CONCATENATE
    var concatenar="tus ojos"
    println("fuego en $concatenar")

//Arrays
    var array= arrayOf(1,2,3,4,5,6,7,8,9)
    array[0]=20
    println(array[0])
}