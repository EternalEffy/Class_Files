import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String arg[]) throws IOException {
        ConstructFile myFile = new ConstructFile();
        System.out.println("Введите имя файла");
        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();

        myFile.readFromFile(fileName);
        System.out.println(myFile.countOfSymbol());
        System.out.println(myFile.countOfWords());
        System.out.println(myFile.countOfProposal());
    }
}
