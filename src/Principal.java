
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
         // Criação dos guinchos
        GuinchoCaminhao guinchoCorrente = new GuinchoCaminhao(2.0);
        GuinchoCaminhao guinchoReboque = new GuinchoCaminhao(10.0);
        GuinchoCaminhao guinchoPlataforma = new GuinchoCaminhao(5.0);

        // Leitura da entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de guincho (1 - Corrente, 2 - Reboque, 3 - Plataforma):");
        int tipoGuincho = scanner.nextInt();
        GuinchoCaminhao guinchoEscolhido;
        if (tipoGuincho == 1) {
            guinchoEscolhido = guinchoCorrente;
        } else if (tipoGuincho == 2) {
            guinchoEscolhido = guinchoReboque;
        } else {
            guinchoEscolhido = guinchoPlataforma;
        }

        System.out.println("Escolha o tipo de veículo (1 - Carro, 2 - MiniVan, 3 - Ônibus, 4 - Caminhão):");
        int tipoVeiculo = scanner.nextInt();
        TipoVeiculo tipo;
        if (tipoVeiculo == 1) {
            tipo = TipoVeiculo.CARRO;
        } else if (tipoVeiculo == 2) {
            tipo = TipoVeiculo.MINIVAN;
        } else if (tipoVeiculo == 3) {
            tipo = TipoVeiculo.ONIBUS;
        } else {
            tipo = TipoVeiculo.CAMINHAO;
        }

        System.out.println("Escolha o estado de conservação do veículo (1 - Novo, 2 - Quebrado):");
        int estadoVeiculo = scanner.nextInt();
        EstadoConservacao estado;
        if (estadoVeiculo == 1) {
            estado = EstadoConservacao.NOVO;
        } else {
            estado = EstadoConservacao.QUEBRADO;
        }

        VeiculoImpl veiculo = new VeiculoImpl(tipo, estado);

        System.out.println("Digite a distância do trajeto em quilômetros:");
        int distancia = scanner.nextInt();
        TrajetoBairro trajeto = new TrajetoBairro(distancia);

        // Cálculo e exibição do total
        SimuladorDeOrcamentoImpl simulador = new SimuladorDeOrcamentoImpl(guinchoEscolhido);
        System.out.println("O valor total é: " + simulador.calcularCustoTotal(veiculo, trajeto));
        
    }
    }
    

