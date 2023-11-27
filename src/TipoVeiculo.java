public enum TipoVeiculo {
     CARRO, MINIVAN, ONIBUS, CAMINHAO
}

// Enum para estados de conservação
enum EstadoConservacao {
    NOVO, QUEBRADO
}
// Interface para trajetos entre bairros
interface Trajeto {
    Integer getDistanciaEmKM();
}

// Interface para tipos de guincho
interface Guincho {
    double calcularCustoDeslocamento(Trajeto trajeto);
}

// Interface para tipos de veículos
interface Veiculo {
    TipoVeiculo getTipo();
    EstadoConservacao getEstado();
}

// Interface para calcular o custo total do orcamento
interface SimuladorDeOrcamento {
    double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto);
}



