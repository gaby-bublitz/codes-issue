
public class Ex5teste {
    public static void main(String[] args) {
        Ex5 ex1 = new Ex5("Nome", "Descricao", 100, 20, 10); // Nome, Descrição, Preço, Peso, Quantidade
        Ex5 ex2 = new Ex5("Nome", "Descricao", 10, 20, 5); // Nome, Descrição, Preço, Peso, Quantidade
        Ex5 ex3 = new Ex5("Nome", "Descricao", -5.0, -2.5, -10); // Nome, Descrição, Preço, Peso, Quantidade
        
        ex1.adicionarEstoque();
        System.out.println("Quantidade de itens no estoque: " + ex1.getEstoque());
     
        ex1.aplicarPromocao(10);
        System.out.println("Preço com desconto: " + ex1.getPreco());
        
        ex2.venderProduto(10);
        
        ex3.getPreco();
        ex3.getPeso();
        ex3.getEstoque();
    }
}
