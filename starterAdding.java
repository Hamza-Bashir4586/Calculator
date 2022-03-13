
import java.util.Scanner;
public class starterAdding {


    public static void main(String[] args){
        double result = 0.0;
        int operation;
        double first_operend;
        double second_operend;
        Scanner scnr = new Scanner(System.in);
        int tc=0;
        double sum = 0;
        int vc = 0;

        do {
            if(tc==0){
                result=result-result;
                System.out.println("Current Result: " + result);
            }

            if(vc==0) {
                System.out.println("\nCalculator Menu\n" +
                        "---------------\n" +
                        "0. Exit Program\n" +
                        "1. Addition\n" );
            }
            System.out.print("Enter Menu Selection: ");
            operation = scnr.nextInt();

            if (operation > 1 | operation < 0) {
                System.out.println("\nError: Invalid selection!\n");
                vc++;
                tc++;
            }

            if (operation == 0) {
                System.out.println("\nThanks for using this calculator. Goodbye!");
                break;
            }

            if (operation == 1) {
                vc=0;
                System.out.print("Enter first operand: ");
                first_operend = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                second_operend = scnr.nextDouble();
                result = first_operend + second_operend;
                System.out.println("\nCurrent Result: " + result);
                tc++;
                sum=sum+result;
                continue;
            }


        } while (operation!=0);





    }



}
