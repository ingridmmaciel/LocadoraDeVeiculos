package Veiculos;

public class VeiculoPequeno extends Veiculo {
    public VeiculoPequeno(String placa, String modelo, double precoDiaria) {
        super(placa, modelo, precoDiaria);
    }

    @Override
    public String getTipo() {
        return "PEQUENO";
    }
}
