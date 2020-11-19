abstract class Veiculo (val placa: String, val cor: String) {
    abstract fun accept(visitor: IVisitor): Double
}