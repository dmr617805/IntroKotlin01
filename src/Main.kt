
val alimentos = mapOf(
    "Pizza" to 800,
    "Ensalada" to 200,
    "Hamburguesa" to 700,
    "Manzana" to 100,
    "Helado" to 300,
    "Pasta" to 600,
    "Yogurt" to 150
)

fun mostrarAlimentosPorCategoria(cabecera: String, detalle: String, filtro: (Map.Entry<String, Int>) -> Boolean){
    val alimentosCategoria = alimentos.filter {entry -> filtro(entry)}
    val listadoAlimentos = alimentosCategoria.keys.joinToString(", ")
    val totalCalorias =  alimentosCategoria.values.sum()

    println("$cabecera : $listadoAlimentos")
    println("Cantidad: ${alimentosCategoria.count()}")
    println("$detalle : $totalCalorias")
    println()
}

fun main(){

    println("Lista de Alimentos, cantidad ${alimentos.count()}")
    println("Total Calorias Consumidas: ${alimentos.values.sum()}")
    println()

    for(alimento in alimentos){
        println("-> ${alimento.key} , calorias: ${alimento.value}")
    }

    println()
    mostrarAlimentosPorCategoria("Altos en calorias", "total altos en calorias") { it.value >= 500}
    mostrarAlimentosPorCategoria("Bajos en calorias", "total bajos en calorias") { it.value < 500}



}