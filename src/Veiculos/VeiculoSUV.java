package Veiculos;
public class VeiculoSUV extends Veiculo {
    public VeiculoSUV(String placa, String modelo, double precoDiaria) {
        super(placa, modelo, precoDiaria);
    }

    @Override
    public String getTipo() {
        return "SUV";
    }
}