package Veiculos;
public class VeiculoMedio extends Veiculo {
    public VeiculoMedio(String placa, String modelo, double precoDiaria) {
        super(placa, modelo, precoDiaria);
    }

    @Override
    public String getTipo() {
        return "MEDIO";
    }
}