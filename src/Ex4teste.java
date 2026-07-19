
public class Ex4teste {
    
    public static void main(String[] args) {
        Ex4 ex1 = new Ex4("Maria", "12345678900", "PR", 4000.0);
        Ex4 ex2 = new Ex4("Maria", "12345678900", "PR", 8000.0);
        
        System.out.println("Renda anual salva: " + ex1.getRendaAnual()); 
        System.out.println("Imposto: " + ex2.calcularImposto());
        ex2.setUf("SP");
        
        ex2.setCpf("123.456.789-00");
        System.out.println("CPF: " + ex2.getCpf());
        
    }
}
