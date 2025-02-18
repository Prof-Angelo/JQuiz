
import java.util.Scanner;

public class Quiz {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //QUIZ
        //CORRECT ANSWERS
        String mathematician = "Isaac Newton";
        int contribution = 2;
        double pi = 3.14159;
        char gender = 'M';
        boolean isTeacher = true;
        
        //Score Monitor
        int correctAnswers = 0;
        int perfectScore = 5;
        
        System.out.println("Question #1");
        System.out.print("Who is the father of modern physics? : ");
        String name = scanner.nextLine();
        
        if(name.equalsIgnoreCase(mathematician)) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Wrong!");
            
        }
        
        System.out.println("\nQuestion #2");
        System.out.print("How many contributions? : ");
        int contribute = scanner.nextInt();
        
        if(contribute == contribution) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Wrong!");
            
        }
        
        System.out.println("\nQuestion #3");
        System.out.print("What is the value of Pi? : ");
        double piValue = scanner.nextDouble();
        
        if(piValue == pi) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Wrong!");
            
        }
        
        System.out.println("\nQuestion #4");
        System.out.print("What is his/her gender? (M/F) : ");
        char isGender = scanner.next().charAt(0);
        
        if(isGender == gender) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Wrong!");
            
        }
        
        System.out.println("\nQuestion #5");
        System.out.print("Is he a teacher? (true/false) : ");
        boolean teacher = scanner.nextBoolean();
        
        if(teacher == isTeacher) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Wrong!");
            
        }
        
        System.out.println("\nTotal score : " + correctAnswers + "/" + perfectScore);
        
        scanner.close();
    }
    
    }