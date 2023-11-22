import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        scan.close();
        int TotalMarks=0;
        int TotalSubs;
        double AveragePercentage;
        
        System.out.println("Enter Number of Subjects: ");
        TotalSubs=scan.nextInt();

        for(int i=1;i<=TotalSubs;i++){
            System.out.println("Enter Marks Obtained in subject "+ i+ "(out of 100): ");

            int marks=scan.nextInt();
            if(marks<0 || marks>100){
                System.out.println("Invalid Marks! Marks should Be Between 0 and 100.");
                i--;
                continue;
            }
            TotalMarks=TotalMarks+marks;

        }
        AveragePercentage = (double)TotalMarks/TotalSubs;

        String Grade;
        if(AveragePercentage >=90){
            Grade="Congratulations, You have Achieved Grade A. You are a Topper!";
        }
        else if(AveragePercentage>=80){
            Grade="Congratulations, You have Achieved Grade B. You can be a Topper!";
        }
        else if(AveragePercentage>=70){
            Grade="Congratulations, You have Achieved Grade C. Study Little More!";
        }
        else if(AveragePercentage>=60){
            Grade="Congratulations, You have Achieved Grade D. Focus on your Target!";
        }
        else if(AveragePercentage>=50){
            Grade="Congratulations, You have Achieved Grade E. Study more else you'll fail!";
        }
        else{
            Grade="Better Luck Next Time!";
        }
        System.out.println("\nResults");
        System.out.println("Total Marks: "+ TotalMarks);
        System.out.println("Average Percentage: "+ AveragePercentage+ "%");
        System.out.println(Grade);
    }

}