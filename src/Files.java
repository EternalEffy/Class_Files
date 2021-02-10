import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String arg[]) throws IOException {
        constructFile myFile = new constructFile();
        System.out.println("Введите имя файла");
        Scanner console = new Scanner(System.in);
        myFile.fileName = console.nextLine();
        File currentFile = new File(myFile.fileName);
        myFile.byteArray = new byte[(int)currentFile.length()];
        myFile.readFromFile();

        System.out.println(myFile.countOfSymbol());
        System.out.println(myFile.countOfWords());
        System.out.println(myFile.countOfProposal());
    }
}
