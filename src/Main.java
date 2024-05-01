import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class Main {
    static Scanner input = new Scanner(System.in);
    static String libraryName, libraryAddress;
    static int options;
    static Book[] book = new Book[99];
    static int index = 3;
    static void addBook(){
        book[index] = new Book();
        System.out.println(" ================ ADD BOOK INFO  ================");
        System.out.println("Enter Book's Name:");
        input.nextLine();
        String name = input.nextLine();
        book[index].setTitle(name);
        System.out.println("Enter Author's Name:");
        book[index].setAuthorName(input.nextLine());
        System.out.println("Enter Author's Year Active:");
        book[index].setAuthorYear(input.nextLine());
        System.out.println("Enter Published Year:");
        book[index].setPubYear(input.nextLine());
        book[index].setStatus("Available");
        System.out.println("Book is added successfully");
        book[index].setId(index+1);
        index++;
    }
    static void showAll(){
        System.out.println(" ================ ALL BOOK INFO  ================");
      for(int i = 0; i< book.length; i++){
          if (book[i] != null) {
              System.out.print(book[i].getId()+ " ");
              System.out.print(book[i].getTitle()+ " ");
              System.out.print(book[i].getAuthorName()+ " ");
              System.out.print(book[i].getAuthorYear()+ " ");
              System.out.print(book[i].getPubYear()+ " ");
              System.out.print(book[i].getStatus()+ " ");
              System.out.println();
          }
        }
    }static void showAvailable(){
        System.out.println(" ================ AVAILABLE BOOK INFO  ================");
            for(Book book2 : book){
                if (book2 != null && Objects.equals(book2.getStatus(), "Available")) {
                    System.out.print(book2.getId()+ " ");
                    System.out.print(book2.getTitle()+ " ");
                    System.out.print(book2.getAuthorName()+ " ");
                    System.out.print(book2.getAuthorYear()+ " ");
                    System.out.print(book2.getPubYear()+ " ");
                    System.out.print(book2.getStatus()+ " ");
                    System.out.println();
                }
            }
    }
    static void borrowBook(){
        System.out.println(" ================ BORROW BOOK INFO ================");
        System.out.println("Input Book ID: ");
        int borrowId = input.nextInt();
        for(int i = 0; i< book.length; i++){
            if (book[i] != null){
                if (borrowId == book[i].getId()){
                    System.out.println("Borrow Book Successfully.");
                    book[i].setStatus("Unavailable");
                    break;
                } else {
                    System.out.println("ID not found.");
                    break;
                }
            }
        }
    }
    static void returnBook(){
        System.out.println(" ================ RETURN BOOK INFO ================");
        System.out.println("Input Book ID: ");
        int borrowId = input.nextInt();
        for(int i = 0; i< book.length; i++){
            if (book[i] != null){
                if (borrowId == book[i].getId()){
                    System.out.println("Return Book Successfully.");
                    book[i].setStatus("Available");
                    break;
                } else {
                    System.out.println("ID not found.");
                    break;
                }
            }
        }
    }
    static void exit(){
        System.exit(0);
    }

    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("================ SET UP YOUR LIBRARY ================");
        System.out.println("Enter Library's name:");
        libraryName = input.nextLine();
        System.out.println("Enter Library's Address:");
        libraryAddress = input.nextLine();
        System.out.println(libraryName + " Library is already created in " + libraryAddress + " address successfully " +formattedDate);
        book[0] = new Book(1,"200","Titanic", "James Cameron", "2000", "Available");
        book[1] = new Book( 2, "300", "Harry Potter", "J.K Rowling", "1900", "Available");
        book[2] = new Book( 3, "400", "The Art Of War", "Sun Tzu", "1980","Available");

        while (true) {
            System.out.println("================" +libraryName+ "Library, "+libraryAddress+ "================");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Show Available Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("Choose options:(1-6)");
            options = input.nextInt();
            switch (options) {
                case 1 -> addBook();
                case 2 -> showAll();
                case 3 -> showAvailable();
                case 4 -> borrowBook();
                case 5 -> returnBook();
                case 6 -> exit();
                default -> System.out.println("Sorry, Invalid Option.");
            }
    }
    }
}
