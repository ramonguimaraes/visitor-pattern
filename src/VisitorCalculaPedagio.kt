class VisitorCalculaPedagio : IVisitor {
    override fun visit(veiculoDePasseio: VeiculoDePasseio): Double {
        return 2.99
    }

    override fun visit(veiculosComerciais: VeiculosComerciais): Double {
        return veiculosComerciais.numEixos * 2.99
    }
}