fun Menu(){
    println("Seleccione la opción deseada")
    println("1. Hacer una reseta")
    println("2. Ver mis recetas")
    println("3. Salir")
}
fun main(args: Array<String>) {
    println("""
        :: Bienvenido a Recipe Maker ::
        
    """.trimIndent())
    var opcion: String? = ""
    do{
        Menu()
        opcion = readLine()
        when(opcion.toString()){
            in "1" -> println("Hacer una receta")
            in "2" -> println("Ver mis recetas")
            else -> println("Ingrese una opcion correcta")
        }

    }while(opcion!="3")
}