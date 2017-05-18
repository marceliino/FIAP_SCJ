import java.time.LocalDate;

public class Cliente {
	
	private String nome;
	private int idade;
	private boolean ativo;
	private LocalDate datePrimeiraCompra;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDate getDatePrimeiraCompra() {
		return datePrimeiraCompra;
	}
	public void setDatePrimeiraCompra(LocalDate datePrimeiraCompra) {
		this.datePrimeiraCompra = datePrimeiraCompra;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", ativo=" + ativo + ", datePrimeiraCompra="
				+ datePrimeiraCompra + "]";
	}
}