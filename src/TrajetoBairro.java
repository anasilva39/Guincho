
// Implementação dos trajetos entre bairros
class TrajetoBairro implements Trajeto {
    private int distancia;

    public TrajetoBairro(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distancia;
    }
}

// Implementação dos tipos de guincho
class GuinchoCaminhao implements Guincho {
    private final double taxa;

    public GuinchoCaminhao(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return taxa * trajeto.getDistanciaEmKM();
    }
}

// Implementação dos tipos de veículos
class VeiculoImpl implements Veiculo {
    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public VeiculoImpl(TipoVeiculo tipo, EstadoConservacao estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    @Override
    public TipoVeiculo getTipo() {
        return tipo;
    }

    @Override
    public EstadoConservacao getEstado() {
        return estado;
    }
}

// Implementação do simulador de orçamento
class SimuladorDeOrcamentoImpl implements SimuladorDeOrcamento {
    private final Guincho guincho;

    public SimuladorDeOrcamentoImpl(Guincho guincho) {
        this.guincho = guincho;
    }

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        return guincho.calcularCustoDeslocamento(trajeto);
    }
}



