import java.util.Scanner;

public class mathquiz {

    // decalaring fields.
    public String name;

    // creating scanner for user input.
    Scanner gameinput = new Scanner(System.in);

    // forming constructors
    public mathquiz(String name) {
        this.name = name;
    }
    // forming methods.
    public void formingoptions(){

        System.out.println("Welcome to Izyan math quiz game.");

        System.out.print("Enter your name: ");
        String name = gameinput.nextLine();

        System.out.println("Make a choice for the game play; ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");

        System.out.print("Enter your choice: ");
        int choice = gameinput.nextInt();

        switch(choice){
            case 1:
                addition();
                break;
            case 2:
                //subtraction();
                break;
            case 3:
               // multiplication();
                break;
            case 4:
               // division();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println(name + ", you have entered an invalid choice.");
                break;
        }
    }
            // return methods for the game.
        public void addition(){

        int[][] questions = {{2, 2}, {5, 7}, {10, 3}, {15, 9}, {8, 4}, {12, 6}, {20, 11}, {167, 8}, {25, 13}, {30, 17}};

        System.out.println (" Addition Edition!");

        // Iterate through the predefined questions
        for (int i = 0; i < questions.length; i++) {
            int num1 = questions[i][0];
            int num2 = questions[i][1];
            System.out.print((i + 1) + ": What is " + num1 + " + " + num2 + "? " +"\n" + "= ");
            double userAnswer = gameinput.nextDouble();
        }
    }

    public static void main(String[] args) {
        mathquiz game = new mathquiz("");
        game.formingoptions();

        System.out.println("Thank you for choosing Izyan math quiz game.");
    }



}