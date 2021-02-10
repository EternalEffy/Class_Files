import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String arg[]) {
        ConstructFile myFile = new ConstructFile();
        System.out.println("Введите имя файла");
        Scanner console = new Scanner(System.in);

        myFile.readFromFile(console.nextLine());
        System.out.println(myFile.countOfSymbol());
        System.out.println(myFile.countOfWords());
        System.out.println(myFile.countOfProposal());
    }
}
