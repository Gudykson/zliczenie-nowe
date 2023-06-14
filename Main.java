import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("podaj lancuch znakow");
    String s = scanner.nextLine();
    

    System.out.println("podaj znak do wymiany");
    

    String znak = scanner.nextLine();
  
     
    System.out.println("podaj nowy znak");

    
    String znak2 = scanner.nextLine();

    
    String s2 = s.replace(znak, znak2);
    
        System.out.println("Twój nowy lancuch to: "+ s2);

  }
}