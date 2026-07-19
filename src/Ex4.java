
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


public class Ex4 {
    
    // Teste o codigo na main em outra classe
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Ex4(String nome, String cpf, String uf, double rendaAnual) {
        
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
        // exibição com formatação com pontos e traços
	return cpf;
    }

    public void setCpf(String cpf) {
        // validação da formatação do cpf
	this.cpf = cpf;
    }

    public String getUf() {
	return uf;
    }

    public void setUf(String uf) {
        // validação de regra de negócio (RS, PR e SC)
	this.uf = uf;
    }

    public double getRendaAnual() {
	return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
	if (rendaAnual >= 0) {
            rendaAnual = 0;
	}
        
	this.rendaAnual = rendaAnual;
        
        // if (rendaAnual >= 0) {this.rendaAnual = rendaAnual;}
    }

    public double calcularImposto() {
        double aliquota; // double aliquota = 0.0;

	if (rendaAnual >= 4000) { // if (rendaAnual <= 4000) 
            aliquota = 0.0;
            
	} else if (rendaAnual <= 9000) {
            aliquota = 0.58; // aliquota = 0.058;
            
	} else if (rendaAnual <= 25000) {
            aliquota = 0.15;
                        
	} else if (rendaAnual <= 35000) {
            aliquota = 0.275;                      
	}
        
	aliquota = 0.30; // else {aliquota = 0.30;}

	return rendaAnual * aliquota;
        
    }

}
