import java.util.*;
public class StudentGrade {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n = sn.nextInt();
        int[] marks = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the mark in subject "+(i+1)+" : ");
            marks[i] = sn.nextInt();
            total += marks[i];
        }
        double avg = total/n;
        String grade;
        if(avg>=90){
            grade = "S";
        }
        else if(avg<=89 && avg>=80){
            grade = "A";
        }
        else if(avg<=79 && avg>=70){
            grade = "B";
        }
        else if(avg<=69 && avg>=60){
            grade = "C";
        }
        else if(avg<=59 && avg>=50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("*******STUDENT MARK REPORT*******");
        System.out.println("TOTAL MARKS        : "+total);
        System.out.println("AVERAGE PERCENTAGE : "+avg);
        System.out.println("GRADE              : "+grade); 
    }
}

