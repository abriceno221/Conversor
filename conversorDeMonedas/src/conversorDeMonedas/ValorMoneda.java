package conversorDeMonedas;

public enum ValorMoneda {
    DOLAR(0.00024),
    EURO(0.00022),
    LIBRA(0.00019),
    YEN(0.034),
	WON(0.31);

    private final double valor;

    ValorMoneda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}






