
package data;

import java.util.Locale;


public class Student {
 
    public static final String UNIVERSITY = "FPT University";
    private String id;
    private String name;
    private double gpa;
    
    
    public Student(String id,String name,double gpa){
    
    this.setGpa(gpa);
    this.id=id;
    this.name = name;
    
    }
    
    public void setGpa(double gpa){
        if(gpa<0){
         this.gpa = 0;
            System.out.println("the score gpa invalid!");
        }else if(gpa>10){
        this.gpa = 10;
            System.out.println("gpa can not great than 10!");
        }else{
         this.gpa = gpa;
        }     
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }
    
    
    @Override
    public String toString(){
    return String.format("id: %s| name: %s|gpa: %.2f",id,name,gpa);
    
    }
    
    
}
