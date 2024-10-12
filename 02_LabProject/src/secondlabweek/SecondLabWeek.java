
package secondlabweek;

import java.util.Scanner;

public class SecondLabWeek {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        
        System.out.print("Enter your books number: ");
        int numberOfBooks = keyb.nextInt();
        String empty = keyb.nextLine();
        
        System.out.println();
        
        String[] bookName = new String[numberOfBooks];
        String[] bookAuthor = new String[numberOfBooks];
        String[] bookPublisher = new String[numberOfBooks];
        
        for (int i = 0; i < numberOfBooks; i++) {
            
            System.out.printf("Write the name of %dst book: ", i + 1);
            bookName[i] = keyb.nextLine();
            
            System.out.printf("Write the author of %dst book: ", i + 1);
            bookAuthor[i] = keyb.nextLine();
            
            System.out.printf("Write the publisher of %dst book: ", i + 1);
            bookPublisher[i] = keyb.nextLine();
            System.out.println();
            
        }

        System.out.print("Search a book name, author or publisher: ");
        String searchedText = keyb.nextLine();
        System.out.println();
        
        boolean findOut = false;
        for (int i = 0; i < numberOfBooks; i++) {
            if (bookName[i].equalsIgnoreCase(searchedText) 
                    || bookAuthor[i].equalsIgnoreCase(searchedText) 
                    || bookPublisher[i].equalsIgnoreCase(searchedText)) {
                System.out.printf("Searched book infos;%n"
                        + "Book name: %s%n"
                        + "Book author: %s%n"
                        + "Book publisher: %s%n%n",bookName[i],bookAuthor[i],bookPublisher[i]);
                findOut = true;
                break;
            }           
        }
        
        if (!findOut) {
            System.out.println("There is no result!");
            System.out.println();
        }
        
        System.out.println("---------------- All Books in Library ----------------");
        for (int i = 0; i < numberOfBooks; i++) {
            
            System.out.printf("%nBook name: %s%n"
                    + "Book author: %s%n"
                    + "Book publisher: %s%n",bookName[i],bookAuthor[i],bookPublisher[i]);
            
        }
    }
    
}
