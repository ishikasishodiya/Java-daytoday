import java.lang.*;

public class StringBuilderDemo {

   public static void main(String[] args) {
  
      StringBuilder str = new StringBuilder("Java lang package");
      System.out.println("string = " + str);

      // deleting character from index 4 to index 9
      str.delete(4, 9);
      System.out.println("After deletion = " + str);

      str = new StringBuilder("amit");
      System.out.println("string = " + str);
      
      // deleting character at index 2
      str.deleteCharAt(2);
      System.out.println("After deletion = " + str);
   }
}  