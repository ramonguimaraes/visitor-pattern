class VeiculoDePasseio(placa: String, cor: String) : Veiculo(placa, cor) {
    override fun accept(visitor: IVisitor): Double {
        return visitor.visit(this)
    }
}