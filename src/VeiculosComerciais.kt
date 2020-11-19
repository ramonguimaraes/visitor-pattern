class VeiculosComerciais(placa: String, cor: String, val numEixos: Int) : Veiculo(placa, cor) {
    override fun accept(visitor: IVisitor): Double {
        return visitor.visit(this)
    }
}