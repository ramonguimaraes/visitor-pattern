interface IVisitor {
    fun visit(veiculoDePasseio: VeiculoDePasseio) : Double
    fun visit(veiculosComerciais: VeiculosComerciais) : Double
}