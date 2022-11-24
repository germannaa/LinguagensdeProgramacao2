
package Composite;

import java.util.ArrayList;
import java.util.List;
//composite

public class HeadDepartment implements Department{
    private int id;
    private String description;
    private List<Department> childDepartments;

    public HeadDepartment(int id, String description) {
        this.id = id;
        this.description = description;
        this.childDepartments = new ArrayList<>();
    }

    
    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
        /*
        for(Department department: childDepartments) {
            department.printDepartmentName();
        }
        */

    }
    
    public void addDepartment(Department department){
        childDepartments.add(department);
    }
    
    public void removeDepartment(Department department){
        childDepartments.remove(department);
    }
    
}
