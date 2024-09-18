import java.util.ArrayList;
import java.util.Scanner;

public class tshirt {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Type anything");
                String keyword = sc.nextLine();

                System.out.println("Enter the username");
                String username = sc.nextLine();
                System.out.println("Enter the password");
                double password = sc.nextDouble();

                if (username.equals("user") && password == 1234) {
                    System.out.println("You are logged in");
                    ArrayList<String> Myarray = new ArrayList<String>();
                    System.out.println("Enter the number of tshirts");
                    int numoftshirts = sc.nextInt();

                    System.out.println("Enter the names of tshirts");
                    for (int i = 0; i <= numoftshirts; i++) {
                        Myarray.add(sc.nextLine());
                    }
                    for (int i = 0; i <= numoftshirts; i++) {
                        System.out.println(Myarray.get(i));
                    }
                    System.out.println("Enter the total");
                    double total = sc.nextDouble();
                    System.out.println("Enter the VAT% you want to add to the total");
                    double VAT = sc.nextDouble();
                    double temp = total + (VAT / 100 * total);
                    System.out.println("Enter the Discount you want to subtract from the total");
                    double Dis = sc.nextDouble();
                    double actual_total = temp - (Dis / 100 * temp);
                    System.out.println("The total is " + actual_total);
                    System.out.println("Enter payable amount");
                    double payable_amount = sc.nextDouble();
                    double change = payable_amount - actual_total;
                    System.out.println("Your change is" + change);
                    if (change >= 1000) {
                        int temp1 = (int) (change / 1000);
                        change = (int) change - (temp1 * 1000);
                        System.out.println("The 1000s you receive are" + temp1);
                    }
                    if (change >= 500) {
                        int temp2 = (int) change / 500;
                        change = (int) change - (temp2 * 500);
                        System.out.println("The 500s you receive are" + temp2);
                    }
                    if (change >= 100) {
                        int temp3 = (int) change / 100;
                        change = (int) change - (temp3 * 100);
                        System.out.println("The 100s you receive are" + temp3);
                    }
                    if (change >= 50) {
                        int temp4 = (int) change / 50;
                        change = (int) change - (temp4 * 50);
                        System.out.println("The 50s you receive are" + temp4);
                    }
                    if (change >= 20) {
                        int temp5 = (int) change / 20;
                        change = (int) change - (temp5 * 20);
                        System.out.println("The 20s you receive are" + temp5);
                    }
                    if (change >= 10) {
                        int temp6 = (int) change / 10;
                        change = (int) change - (temp6 * 10);
                        System.out.println("The 10s you receive are:" + temp6);
                    }
                    if (change >= 5) {
                        int temp7 = (int) change / 5;
                        System.out.println("The 5s you receive are" + temp7);

                    } else {
                        System.out.println("Wrong credentials");

                    }
                    if (keyword.equals("quit")) {
                        break;
                    } else {
                        continue;
                    }


                }


            }
        }
    }


