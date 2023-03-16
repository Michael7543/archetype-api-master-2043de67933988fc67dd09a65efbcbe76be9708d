package ec.edu.epn.model.enums;

public enum EnumStatus {
    ACTIVO("ACTIVO"),
    INACTIVO("INACTIVO");

    private String valor;

    EnumStatus(String nombreValor) {
        this.valor = nombreValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
