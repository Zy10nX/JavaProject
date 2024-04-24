import java.util.Scanner;

interface Mathquizlook{

    String game = "Izyan-Math-quiz";
    void formingoptions();
    void addition();
    void subtraction();
    void multiplication();
    void division();

}

class Userdata implements Mathquizlook{

    // decalaring fields.
    public String name;

    // creating scanner for user input.
    Scanner gameinput = new Scanner(System.in);

    // forming constructors
    public Userdata(String name) {
        this.name = name;
    }
    
    // forming methods.
    @Override
    public void formingoptions(){

        System.out.print("Enter your name: ");
        String name = gameinput.nextLine();

        System.out.println("Make a choice for the game play; ");
        System.out.println("1.Easymode");
        System.out.println("2.Mediummode");
        System.out.println("3.Hardmode");
        System.out.println("4.Extrahard");
        System.out.println("5.Exit");

        System.out.print("Enter your choice: ");
        int choice = gameinput.nextInt();

        switch(choice){
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
               multiplication();
                break;
            case 4:
               division();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println(name + ", you have entered an invalid choice.");
                break;
        }
    }
    @Override
    public void addition(){}
    @Override
    public void subtraction(){}
    @Override
    public void multiplication(){}
    @Override
    public void division(){}

}

class Mathquizz extends Userdata {

    
    public Mathquizz(String name) {
        super(name);
    }

        // return methods for the game.
        @Override
        public void addition(){

        int[][] questions = {{2, 2}, {5, 7}, {10, 3}, {15, 9}, {8, 4}, {12, 6}, {20, 11}, {167, 8}, {25, 13}, {30, 17}};
        int score = 0;
        System.out.println (" Addition");

        
        for (int i = 0; i < questions.length; i++) {
            int num1 = questions[i][0];
            int num2 = questions[i][1];
            System.out.print((i + 1) + ": What is " + num1 + " + " + num2 + "? " +"\n" + "= ");
            double userAnswer = gameinput.nextDouble();

            
            double correctanswer = (double) num1 + num2;

            if (userAnswer == correctanswer){
                System.out.println("Correct!");
                score++;
            }
            else {
            System.out.println("Incorrect!");
            }
            System.out.println("Your score is: " + score + " + " + questions.length);
        }
        
    }

    @Override
    public void subtraction() {
        int[][] questions = {{59, 20}, {9033, 3788}, {159, 7}, {203, 95}, {1233, 400}, {1800, 600}, {25, 11}, {170, 8}, {30, 13}, {35, 17}};
        int score = 0;
        System.out.println("Medium");

        for (int i = 0; i < questions.length; i++) {
            int num1 = questions[i][0];
            int num2 = questions[i][1];
            System.out.print((i + 1) + ": What is " + num1 + " - " + num2 + "? " + "\n" + "= ");
            double userAnswer = gameinput.nextDouble();

            
            double correctanswer = (double) num1 - num2;

            if (userAnswer == correctanswer){
                System.out.println("Correct!");
                score++;
            }
            else {
            System.out.println("Incorrect!");
            }
            System.out.println( name + " score is: " + score + " - "  + questions.length);
        }
        
    }

    @Override
    public void multiplication() {
        int[][] questions = {{222, 222}, {59, 70}, {109, 33}, {155, 9}, {80, 42}, {121, 6}, {78, 16}, {167, 81}, {259, 138}, {301, 19}};
        int score = 0;
        System.out.println("Hard");

        for (int i = 0; i < questions.length; i++) {
            int num1 = questions[i][0];
            int num2 = questions[i][1];
            System.out.print((i + 1) + ": What is " + num1 + " * " + num2 + "? " + "\n" + "= ");
            double userAnswer = gameinput.nextDouble();

            
            double correctanswer = (double) num1 * num2;

            if (userAnswer == correctanswer){
                System.out.println("Correct!");
                score++;
            }
            else {
            System.out.println("Incorrect!");
            }
            System.out.println( name+ " score is: " + score + " * " + questions.length);

        }
        
    }

    @Override
    public void division() {
        int[][] questions = {{106, 31}, {205, 54}, {30, 22}, {4000, 80}, {505, 5}, {600, 4}, {70, 2}, {80, 3}, {90, 12}, {100, 8}};
        int score = 0;
        System.out.println("Exra hard");

        for (int i = 0; i < questions.length; i++) {
            int num1 = questions[i][0];
            int num2 = questions[i][1];
            System.out.print((i + 1) + ": What is " + num1 + " / " + num2 + "? " + "\n" + "= ");
            double userAnswer = gameinput.nextDouble();

            double correctanswer = (double) num1 / num2;

            if (userAnswer == correctanswer){
                System.out.println("Correct!");
                score++;
            }
            else {
            System.out.println("Incorrect!");
            }
            System.out.println(name +" score is: " + score + " / "  + questions.length);
            gameinput.close();
        }
      
    }
}

public class Mathquiz {
    public static void main(String[] args) {

        Mathquizz game = new Mathquizz("");

        System.out.println("Welcome to  " + Mathquizlook.game);
        game.formingoptions();

        System.out.println("Thank you for choosing Izyan math quiz game " );
    }
}