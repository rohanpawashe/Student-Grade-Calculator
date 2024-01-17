import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in English (out of 100): ");
        int English = scanner.nextInt();

        System.out.println("Enter marks obtained in Maths (out of 100): ");
        int Maths = scanner.nextInt();

        System.out.println("Enter marks obtained in Science(out of 100): ");
        int Science = scanner.nextInt();

        System.out.println("Enter marks obtained in Marathi(out of 100): ");
        int Marathi = scanner.nextInt();

        int totalMarks = English + Maths + Science + Marathi;

        int totalSubjects = 400;
        double averagePercentage = (double) totalMarks / totalSubjects * 100;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}