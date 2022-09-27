
package Polimorfismo01;

import java.math.BigInteger;

public class Cliente extends Pessoa {
    private BigInteger cpf;
    //Construtor do pai
    public Cliente(String nome) {
        super(nome);
    }

    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
    }

    public BigInteger getCpf() {
        return cpf;
    }
    
    //SobreEscrita (mesmo do pai)
    @Override
    public void imprimir(){
        System.out.println("Cliente: " + getNome());
    }
}
