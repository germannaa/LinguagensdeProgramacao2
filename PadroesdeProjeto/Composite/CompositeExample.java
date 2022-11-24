
package Composite;


public class CompositeExample {
    public static void main(String[] args) {
        Department sales = new SalesDepartment(1, "Sales");
        Department financial = new FinancialDepartment(2, "Financial");
        Department tecnology = new Tecnology(3, "Department Tecnology");

        HeadDepartment allDepartment = new HeadDepartment(3, "Department Head");
        
        allDepartment.addDepartment(sales);
        allDepartment.printDepartmentName();
        System.out.println("------------------------------------");
        allDepartment.addDepartment(financial);
        allDepartment.printDepartmentName();
        System.out.println("------------------------------------");
        allDepartment.addDepartment(tecnology);
        allDepartment.printDepartmentName();
        System.out.println("------------------------------------");


    }
}
