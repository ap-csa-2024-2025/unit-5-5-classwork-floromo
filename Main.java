import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    

    // wut da dawg doin?
    Dog david = new Dog("David", "Golden Retriever", "white", 50);
    Dog gerald = new Dog("Gerald", "Husky", "gray", 55);

    System.out.println(david.toString());
    System.out.println(david.equals(gerald));

    // person
    System.out.println("Enter the person's first name: ");
    String firstName = sc.nextLine();
    System.out.println("Enter the person's last name: ");
    String lastName = sc.nextLine();
    System.out.println("Enter the person's age: ");
    int age = sc.nextInt();
    System.out.println("Enter the person's social security number: ");
    int SSN = sc.nextInt();
    
    Person iDavid = new Person(firstName, lastName, age, SSN);
    System.out.println(iDavid.toString());


    // oven
    System.out.println("Maximum oven temperature: ");
    int maxTemp = sc.nextInt();
    System.out.println("Starting temperature of the oven: ");
    int currentTemp = sc.nextInt();
    sc.nextLine();
    String input;

    Oven m_oven = new Oven(maxTemp, currentTemp);

    while (!(input.equals("q"))){
      System.out.println("\n" + m_oven.toString());
      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter \"o\", to restart enter \"r\", to quit enter \"q\"");
      input = sc.nextLine();
      switch (input){
        case p:
          System.out.println("Enter the temperature to preheat the oven to: ");
          int preheat = sc.nextInt();
          sc.nextLine();
          m_oven.preheat(preheat);
          System.out.println("Current temperature of the oven is now " + preheat + " degrees");
          break;
        case o:
          System.out.println("Turning the oven off");
          m_oven.turnOff();
          break;
        case r:
          System.out.println("Restarting the oven");
          m_oven.setCurrentTemp(currentTemp);
          break;
        case q:
          break;
      }
    }
    
  }
}
