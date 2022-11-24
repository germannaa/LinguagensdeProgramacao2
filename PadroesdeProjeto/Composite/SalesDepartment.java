package Composite;

//Folha
public class SalesDepartment implements Department {

    private int id;
    private String description;

    public SalesDepartment(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
        //System.out.println(this.name);


    }

}
