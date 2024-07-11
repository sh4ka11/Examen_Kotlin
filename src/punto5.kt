abstract class figuraGeometrica {
    abstract fun calcularArea(): Double
}
class Rectangulo (val ancho: Double, val alto: Double) : figuraGeometrica() {
    override fun calcularArea(): Double {
        return ancho*alto
    }
}
class Circulo (val radio: Double) : figuraGeometrica() {

    override fun calcularArea(): Double {

        return 3.1416*radio*radio
    }
}
fun main() {
    val rectangulo = Rectangulo(16.0, 9.0)
    val circulo = Circulo(7.0)
    println("Área del rectangulo ${rectangulo.calcularArea()}")
    println("Área del circulo: ${circulo.calcularArea()}")
}
