import java.util.Scanner;

public class Gradecalculator{
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the number of subjects:");
            int numsubjects=scanner.nextInt();
            int totalmarks=0;
            double averagepercentage;
            for(int i=1;i<=numsubjects;i++){
                System.out.println("enter the marks obtained in subject"+i+"(out of 100):");
                int marks=scanner.nextInt();
                totalmarks+=marks;
            }
            averagepercentage=(double)totalmarks/numsubjects;
            char grade;
            if(averagepercentage>=90){
                grade='A';
            }else if (averagepercentage>=80){
                grade='B';
            }else if (averagepercentage>=70){
                grade='c';
            }else if (averagepercentage>=60){
                grade='D';
            }else{
                grade='F';
            }
            System.out.println("\nresults:");
            System.out.println("total marks:" +totalmarks);
            System.out.println("average percentage:"+averagepercentage);
            System.out.println("grade:" + grade);
        }
    } 
}  
  
  
