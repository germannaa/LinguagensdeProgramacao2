
package NP1.Quest07;

import POO.Exemplo03.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String cpf;
    public String nome;
    public String telefone;
    public List<Pedido> pedidos;


    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        pedidos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    
    
}
