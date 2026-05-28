
package studentmanagerment;

import data.Student;
import java.util.Scanner;

public class StudentManagerment {

    public static void main(String[] args) {
      
           Scanner sc = new Scanner(System.in);
           double inputGpa = 0;
           
         while(true){
        try{
        
            System.out.printf("enter GPA of a student:");
            
             inputGpa = sc.nextInt();
             break;
        }catch(Exception e){
            System.out.println("Invalid!\n please enter again information.");
        
        }
    }

  
      Student st1 = new Student("SE201490","Phan Văn Minh",inputGpa);
        
        System.out.println(st1);
   
        if(st1.getGpa()>=5){
            System.out.println("passed");
        }else{
            System.out.println("false");
        }
    }
}
