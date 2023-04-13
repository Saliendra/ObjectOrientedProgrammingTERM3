import java.util.Scanner;
public class DigitalBookStore{

    public static void main(String[] args) {
        
        String books [] = {"Romeo and Juliet", "1984", "How to kill a Mockingbird"};
        String author [] = {"William Shakespear", "George Orwell", "Harper Lee"};
        int [] copy = {1, 2, 5};
        System.out.println("Welcome to Digital Rental Bookstore");
        System.out.println("Please enter the book number you want to rent:");
        
       
        Scanner sc = new Scanner(System.in);
        boolean Rent = true;

        while (Rent) {
            System.out.println("Book 1");
            System.out.println(books[0]);
            System.out.println(author[0]);
            System.out.print("Copies: ");
            System.out.println(copy [0]);
            System.out.println("====================");
    
            System.out.println("Book 2");
            System.out.println(books[1]);
            System.out.println(author[1]);
            System.out.print("Copies: ");
            System.out.println(copy [1]);
            System.out.println("===================");
    
            System.out.println("Book 3");
            System.out.println(books[2]);
            System.out.println(author[2]);
            System.out.print("Copies: ");
            System.out.println(copy [2]);
            System.out.println("===================");    
         
            System.out.print("Number: ");
            int answer1 = sc.nextInt();

            switch (answer1) {
                case 1:
                    if (copy[0] > 0) {
                        System.out.println("You have rented Romeo and Juliet by William Shakespeare");
                        copy[0]--;
                    } else {
                        System.out.println("Sorry, all copies of Romeo and Juliet are currently rented out.");
                    }
                    break;
                case 2:
                    if (copy[1] > 0) {
                        System.out.println("You have rented 1984 by George Orwell");
                        copy[1]--;
                    } else {
                        System.out.println("Sorry, all copies of 1984 are currently rented out.");
                    }
                    break;
                case 3:
                    if (copy[2] > 0) {
                        System.out.println("You have rented How to kill a Mockingbird by Harper Lee");
                        copy[2]--;
                    } else {
                        System.out.println("Sorry, all copies of How to kill a Mockingbird are currently rented out.");
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            System.out.println("Do you wish to rent another book? (yes/no)");
            String answer2 = sc.next().toLowerCase();
            Rent = answer2.equals("yes");
        }

        System.out.println("Thank you for renting and have a nice day :)");
    }
}
