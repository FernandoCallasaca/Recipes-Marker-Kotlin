fun Menu(){
    println("Seleccione la opción deseada")
    println("1. Hacer una reseta")
    println("2. Ver mis recetas")
    println("3. Salir")
}
fun makeRecipe(){
    println("""
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent())
}
fun viewRecipe(){
    println("""
        Ver mis recetas
    """.trimIndent())
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
            in "1" -> makeRecipe()
            in "2" -> viewRecipe()
            else -> println("Ingrese una opcion correcta")
        }

    }while(opcion!="3")
}