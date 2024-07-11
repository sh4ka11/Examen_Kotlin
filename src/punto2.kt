
class Producto(val nombre: String, val precio: Double) {

    fun mostrarPrecioConIVA() {
        val iva = 0.16
        val precioConIVA = precio * (1 + iva)
        println("precio con iva: $precioConIVA")
    }
}

fun main() {
    val electrodomestico = Producto("nevera", 1500.0)
    electrodomestico.mostrarPrecioConIVA()
}
