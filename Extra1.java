import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Main {
  public static void main(String[] args) {
    try {
      File myObj = new File("text.txt");
      Scanner myReader = new Scanner(myObj);
      String fullText = "";

      int lLength = 0;

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        fullText += data;
        lLength++;
      }

      System.out.println("Total Length:" + fullText.length());

      int nLength = 0;
      int wLength = lLength;
      
      for (int i = 0; i < fullText.length(); i++) {
        if (fullText.charAt(i) >= 48 && fullText.charAt(i) <= 57) {
          nLength++;
        }else if (fullText.charAt(i) == ' ') {
          wLength++;
        }

      }

      System.out.println("Numbers Count:" + nLength);
      System.out.println("Line Count:" + lLength);
      System.out.println("Word Count:" + wLength);


      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("--Error--");
      e.printStackTrace();
    }
  }
}
