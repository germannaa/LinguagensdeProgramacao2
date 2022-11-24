
package Composite;


public class Tecnology implements Department {

    private int id;
    private String description;

    public Tecnology(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
        //System.out.println(this.name);


    }


}
