
public class Conta {

	int conta;
	double saldo;
	double limite;

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public double consultarSaldo() {

		return saldo;
	}

	public String retornaDados() {
		String aux = "";
		aux += "Número ->" + conta + "\n";
		aux += "Saldo ->" + saldo + "\n";
		aux += "Limite ->" + limite + "\n";
		return aux;
	}

	// método para gera um extato de 7 dias
	public String gerarExtrato() {
		return "Extrato de 7 dias";
	}

	// método apra gera um extato de acordo com a qtd de dias
	public String gerarExtrato(int dias) {
		return "Extrato de 7 dias";
	}
	
	//método para transferir dinheiro de uma conta para outra
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
}
