
/**
 * Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME,
 * CPF, UF (RS, PR e SC) e RENDA ANUAL. EX: <br>
 * Nome: João da Silva <br>
 * CPF: 123.456.789-00 <br>
 * UF: PR <br>
 * RendaAnual: R$40.000 <br>
 * 
 * Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
 * <br>
 * Nível de Renda Anual Alíquota <br>
 * 0 a 4.000 0% <br>
 * 4.001 a 9.000 5,8% <br>
 * 9.001 a 25.000 15% <br>
 * 25.001 a 35.000 27,5% <br>
 * acima de 35.000 30% <br>
 * 
 * Sendo assim, deve-se calcular o imposto a pagar do seguinte modo: <br>
 * Imposto a pagar = Renda Anual * Alíquota
 * 
 */
public class Ex4correcao {
    
    // Teste o codigo na main em outra classe
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Ex4correcao(String nome, String cpf, String uf, double rendaAnual) {
        
	setNome(nome);
	setCpf(cpf);
	setUf(uf);
	setRendaAnual(rendaAnual);
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCpf() {
        if (this.cpf != null && this.cpf.length() == 11) {
            return this.cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1.$2.$3-$4");
        }
        
	return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null) {
            String cpfClear = cpf.replaceAll("[^0-9]", "");
            
            if (cpfClear.length() == 11) {
                this.cpf = cpfClear;
            } else {
                System.out.println("Erro: CPF inválido. Deve conter apenas 11 dígitos.");
            }
        }
	
    }

    public String getUf() {
	return uf;
    }

    public void setUf(String uf) {
        
        if (uf.equalsIgnoreCase("RS") || uf.equalsIgnoreCase("PR") || uf.equalsIgnoreCase("SC")) {
            this.uf = uf;
        } else {
            System.out.println("UF inválida! Apenas RS, PR ou SC.");
        }
	
    }

    public double getRendaAnual() {
	return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
	if (rendaAnual >= 0) {
            this.rendaAnual = rendaAnual;
	}
    }

    public double calcularImposto() {
        double aliquota = 0.0;

	if (rendaAnual <= 4000) {
            aliquota = 0.0;
            
	} else if (rendaAnual <= 9000) {
            aliquota = 0.058;
            
	} else if (rendaAnual <= 25000) {
            aliquota = 0.15;
                        
	} else if (rendaAnual <= 35000) {
            aliquota = 0.275;                      
	} else {
            aliquota = 0.30;
        }

	return rendaAnual * aliquota;
        
    }

}
