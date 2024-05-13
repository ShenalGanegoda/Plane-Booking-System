import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in); // Creating a Scanner object for inputs.

    public static void main(String[] args) {

        while (true) {
            methodChoose(menuOption());
        }

    }

    private static int menuOption(){
        // Separate method to print out the options in the program.

            System.out.println();
            System.out.println("Menu option: ");
            System.out.println();
            System.out.println("1) Buy a seat");
            System.out.println("2) Cancel a seat");
            System.out.println("3) Find first seat available");
            System.out.println("4) Show seating plan");
            System.out.println("5) Print ticket information and sales");
            System.out.println("6) Search tickets");
            System.out.println("0) Exit program");
            System.out.println();
            System.out.print("Choose here: ");
            return scn.nextInt(); // Returning the input value.

    }

    private static void methodChoose(int choiceOfMethod){
        // Separate method for directing to the specific method call.

        switch (choiceOfMethod) {
            case 1 -> buyASeat();
            case 2 -> cancelASeat();
            case 3 -> findFirstSeatAvailable();
            case 4 -> showSeatingPlan();
            case 5 -> printTicketInfoAndPrice();
            case 6 -> searchTicket();
            case 0 -> quit();

        }
    }
    private static void buyASeat(){};
    private static void cancelASeat(){};
    private static void findFirstSeatAvailable(){};
    private static void showSeatingPlan(){};
    private static void printTicketInfoAndPrice(){};
    private static void searchTicket(){};
    private static void quit(){};
}