
package Composite;
//folha

public class FinancialDepartment implements Department {
    private int id;
    private String description;

    public FinancialDepartment(int id, String description) {
        this.id = id;
        this.description = description;
    }
    
   

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
    
}
