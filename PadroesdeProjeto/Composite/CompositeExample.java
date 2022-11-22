
package Composite;


public class CompositeExample {
    public static void main(String[] args) {
        Department sales = new SalesDepartment(1, "Sales");
        Department financial = new FinancialDepartment(2, "Financial");
        HeadDepartment headDepartment = new HeadDepartment(3, "Department Head");
        
        headDepartment.addDepartment(sales);
        headDepartment.addDepartment(financial);
        headDepartment.printDepartmentName();
    }
}
