//Modificadores de acesso
//Public = todos podem acessar
//Private = somebnte a propria classe tem acesso
//Protected = visivel apenas napropria classe e  nas classes que a herdam.

package Lista2_Ex04;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    protected String nomePessoa;
    public Departamento departamento;

//Construtor
public Pessoa(int idPessoa){
    this.idPessoa = idPessoa;
}

protected  int getId(){
    return idPessoa;
    }

public void setNome(String nomePessoa){
    this.nomePessoa = nomePessoa;
}

}
