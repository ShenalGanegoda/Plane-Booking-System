import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in); // Creating a Scanner object for inputs.
    private static int[] A = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
    private static int[] B = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };
    private static int[] C = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };
    private static int[] D = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};

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
    private static void buyASeat(){
        // Separate method to buy and reserve a seat.
        String rowChosen = rowLetterInput();
        int seatNumberChosen = seatNumberInput();



    }
    private static void cancelASeat(){};
    private static void findFirstSeatAvailable(){};
    private static void showSeatingPlan(){};
    private static void printTicketInfoAndPrice(){};
    private static void searchTicket(){};
    private static void quit(){};


    // Other methods

    private static String rowLetterInput(){ // Separate method to get row letter input.
        System.out.print("Enter row here: ");
        return scn.nextLine();
    }

    private static int seatNumberInput(){ // Separate method to get seat number input.
        System.out.print("Enter seat number here: ");
        return scn.nextInt();
    }

    private static boolean rowLetterValidCheck(){ // Separate method to validate row letter.
     return true;
    }

    private static boolean seatValidCheck(int seatNumber){ // Separate method to validate seat number.
        return true;
    }
}