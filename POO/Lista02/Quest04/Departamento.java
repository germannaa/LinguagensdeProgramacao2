
package Lista2_Ex04;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    public String descricao;
    public List<Pessoa> pessoas;
    


public Departamento (int idDepartamento){
    this.idDepartamento = idDepartamento;
    pessoas = new ArrayList<>();
}

protected  int getIdDepartamento(){
    return idDepartamento;
    }

}

