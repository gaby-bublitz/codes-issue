
/**
 * Crie um sistema para uma loja de materiais de construção<br>
 * Os objetos terão os atributos: <br>
 * Nome, descrição, preço, peso e estoque<br>
 * 
 * Crie um método para adicionar mais unidades da peça ao estoque a partir do
 * parâmetro passado Caso nenhum parâmetro for passado, se assume que foi
 * adicionado 1 unidade Crie um método para a venda desse produto, podendo ser
 * vendidos até o mesmo número de peças que tem no estoque.<br>
 * Crie um método para colocar o produto em promoção, o parâmetro do método deve
 * ser a porcentagem do desconto.<br>
 * 
 */
public class Ex5 {
    
    // Teste o codigo na main em outra classe
    private String nome;
    private String descricao;
    private double preco;
    private double peso;
    private int estoque;

    public Ex5(String nome, String descricao, double preco, double peso, int estoque) {
	setNome(nome);
	setDescricao(descricao);
	setPreco(preco);
	setPeso(peso);
	setEstoque(estoque);
    }

    public void adicionarEstoque(int quantidade) {
	this.estoque += quantidade;
    }

    public void adicionarEstoque() {
	this.estoque = +1;
    }

    public void venderProduto(int quantidade) {
	if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
	}
    }

    public void aplicarPromocao(double porcentagemDesconto) {
	double desconto = this.preco * (porcentagemDesconto);
	this.preco = this.preco - desconto;

    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public double getPreco() {
	return preco;
    }

    public void setPreco(double preco) {
	this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
	this.peso = peso;
    }

    public int getEstoque() {
	return estoque;
    }

    public void setEstoque(int estoque) {   
	this.estoque = estoque;
    }

}