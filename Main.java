import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Dog david = new Dog("David", "Golden Retriever", "white", 50);
    Dog gerald = new Dog("Gerald", "Husky", "gray", 55);
    
    System.out.println(david.toString());
    System.out.println(david.equals(gerald));
  }
}
