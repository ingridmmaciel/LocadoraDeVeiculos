package Veiculos;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double precoDiaria;

    public Veiculo(String placa, String modelo, double precoDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public abstract String getTipo();
}
