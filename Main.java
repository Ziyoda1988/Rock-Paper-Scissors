import java.util.Scanner;

class Main {   
  

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1 - ROCK
        // 2 - PAPPER
        // 3 - SCISSORS
        System.out.println("Enter the number 1, 2 or 3");
        int choice = scan.nextInt();
        int compChoice = (int) (1 + Math.random() * 3);
        //First check if user input is valid
        //If not valid then print invalid
        //user choice
        if (choice == 1 || choice == 2 || choice == 3) {
            if (choice == 1) {
                System.out.println("You chose rock");
            } else if (choice == 2) {
                System.out.println("You chose paper");
            } else if (choice == 3) {
                System.out.println("You chose scissors");
            } else {
                System.out.println("Invalid choice");
            }
            // compCoice
            switch (compChoice) {
                case 1:
                    System.out.println("comp chose rock!");
                    break;
                case 2:
                    System.out.println("comp chose paper!");
                    break;
                case 3:
                    System.out.println("comp chose scissors!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if ((choice == 1 && compChoice == 2) || (choice == 2 && compChoice == 3) || (choice == 3 && compChoice == 1)) {
                System.out.println("You lose!");
            } else if ((choice == 1 && compChoice == 3) || (choice == 2 && compChoice == 1) || (choice == 3 && compChoice == 2)) {
                System.out.println("You Win!!!");
            } else if (choice == compChoice) {
                System.out.println("Drew");
            }
        }
        //Otherwise if choice is valid, do all the steps
        else {
            System.out.println("Invalid choice");
        }
    }
}

           