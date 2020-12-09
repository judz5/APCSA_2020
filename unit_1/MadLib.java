import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 
    Scanner kb = new Scanner(System.in); 
    System.out.print("Enter a integer:  ");
    int num = kb.nextInt(); //assigns to int
    System.out.print("Enter an adjective: ");
    String adj = kb.next(); //assigns to string
    System.out.print("Enter an double: ");
    double grade = kb.nextDouble(); //Assigns to double
    System.out.print("Enter a past tense verb: ");
    kb.nextLine(); //throwaway
    String verb = kb.nextLine(); //Assigns to String
    System.out.print("Enter an adjective: ");
    String adj2 = kb.next(); //Assigns to string
    System.out.print("Enter a food item: ");
    kb.nextLine(); //throwaway
    String food = kb.nextLine(); //assigns to string
   
   System.out.print("Mr. Wang had a class of "+num+" "+adj+" Students. One day he alerted a student that they had gotten a score of "+grade+" on their recent test, After hearing this news the student "+verb+" "+adj2+".");

//if than statement to change last sentence depending on grade entered

  if (grade > 60.0) {
    System.out.println(" to congratulate the student on their grade Mr. Wang awarded them with a tasty meal of "+food+".");
  } else {
    System.out.println(" In an attempt to keep the students mind from such a poor grade, Mr. Wang gave the student "+food+".");
  }

  }
}