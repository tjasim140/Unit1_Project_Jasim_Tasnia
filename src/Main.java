import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Preparation for user input
        Scanner s = new Scanner(System.in);

        //Decoration
        System.out.println("---------------------------------------");
        //Variables bill, tip, and numPpl take initial costs and number of people through user input and convert them to double or integer values to be used to calculate final amounts
        System.out.print("Enter Your Bill Amount (leave out $): ");
        String a = s.nextLine();
        double bill = Double.parseDouble(a);

        System.out.print("Enter Tip Amount (leave out %): ");
        String b = s.nextLine();
        int tip = Integer.parseInt(b);

        System.out.print("Number of People: ");
        String c = s.nextLine();
        int numPpl = Integer.parseInt(c);

        //Calculates total costs in correct double form
        double totalTip = bill*((double)tip/100);
        double totalBill = bill + totalTip;

        //Finds tip and bill amount per person
        double tipPer = totalTip/numPpl;
        double billPer = totalBill/numPpl;

        //Prints receipt while rounding values to nearest hundredths place to resemble money values
        System.out.println("---------------------------------------");
        System.out.println("Total Tip: $" + String.format("%.2f",totalTip));
        System.out.println("---------------------------------------");
        System.out.println("Total Bill: $" + String.format("%.2f",totalBill));
        System.out.println("---------------------------------------");
        System.out.println("Tip per Person: $" + String.format("%.2f",tipPer));
        System.out.println("---------------------------------------");
        System.out.println("Bill per Person: $" + String.format("%.2f",billPer));

        }
    }
