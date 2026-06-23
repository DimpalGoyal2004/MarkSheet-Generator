import java.util.Scanner;
class MarkSheet{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student name:");
        String name = sc.nextLine();
        System.out.println("Enter Roll No:");
        int roll = sc.nextInt();
        
        //create array
        int marks[] = new int[5];
        String sub[] = {"Maths","English","Hindi","Computer","Science"};
         int total = 0;
         
         for(int i =0; i<5; i++){
             System.out.println("Enter Marks in "+sub[i] + ":");
             
         
         marks[i] = sc.nextInt();
         total += marks[i];
        }
        //Calculate percentage
        double per = total/5.0;
        
        //Claculate grade
        char grade;
        if(per>=90)
        grade ='A';
        
        else if(per>=75)
        grade ='B';
        
        else if(per>=60)
        grade = 'C';
        
        else if(per>=40)
        grade = 'D';
        
        else
        grade = 'F';
        
        
        System.out.println("\n===STUDENT MARKSHEET===");
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +roll);
        
        
        for(int i= 0; i<5;i++){
            System.out.println(sub[i]+ ":" +marks[i]);
            
        }
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);
        System.out.print("Grade: "+grade+"\n");
        
        
        //Pass or fail
        

        if(per>=40)
        System.out.println("Result: Pass");
        
        else
        System.out.println("Result: Fail");
        
        
    }
}