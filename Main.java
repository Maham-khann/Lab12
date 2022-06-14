import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int a[] = new int[10], i , num;
    for (i=0;i<10;i++) {
      a[i] = 1+(int) + (Math.random()*100);      
    }
    System.out.println("ENTER INDEX TO SEARCH: ");
    Scanner m = new Scanner (System.in);
    num = m.nextInt();
    try {
      System.out.println("VALUE FOUND IN: " + a[num]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("INDEX OUT OF BOUND!");    
    }    
  }
}
