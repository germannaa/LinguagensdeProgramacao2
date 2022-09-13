
package Lista2_Ex04;

public class PessoaFisica extends Pessoa{
    private String cpf;
    
    public PessoaFisica(int idPessoaFisica, String nomePessoaFisica){
        super(idPessoaFisica);
        setNome(nomePessoaFisica);
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }

    
}
