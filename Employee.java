
package data;


public class Employee {
    private String id;
    private String name;
    private double salary;

    
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

   
    public void showInfo(){
        System.out.printf("|%-16s|%-6s|%.2f\n",id,name,salary); 
    }
    
}
