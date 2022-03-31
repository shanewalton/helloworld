/*
 * Please see https://www.gnu.org/licenses/
 */

package helloworld;

/**
 *
 * @author shanewalton
 */
public class HelloWorld {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      if (args.length > 1) {
         StringBuilder tStr = new StringBuilder("HelloWorld: ");
         for ( String tArg : args) {
            tStr.append(tArg).append(", ");
         }
         System.out.println(tStr.toString());
      } else {
         System.out.println("HelloWorld!!!");
      }
   }
   
}
