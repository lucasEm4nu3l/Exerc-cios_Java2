package Questão1;

class CompradeMaca {
    private int quantidade;

    public CompradeMaca(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularCustoTotal() {
        if (quantidade < 12) {
            return quantidade * 1.30; // Custo por maçã se comprar menos de uma dúzia
        } else {
            return quantidade * 1.00; // Custo por maçã se comprar pelo menos uma dúzia
        }
    }
}
