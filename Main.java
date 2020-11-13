import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int[] basketballs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };


    // declare the basketball number
    String[] names = new String[15];

    // declare the unknown names 
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 15; i++) {
      System.out.println("input name");
      // enter the name
      names[i] = scan.next();
    }

    // Loop through names and basketballs
    int count = 0;
    while (count < 15)
    {

      // print out correlating names and basketballs
      System.out.println(names[count] + "plays with ball #"
      + seats[count]);
      count++;
    }
  }
}