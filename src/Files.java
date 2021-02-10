import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String arg[]){
        EFFY_ConstructFile myFile = new EFFY_ConstructFile();
        System.out.println("Введите имя файла");

        myFile.readFromFile(new Scanner(System.in).nextLine());
        System.out.println(myFile.countOfSymbol());
        System.out.println(myFile.countOfWords());
        System.out.println(myFile.countOfProposal());
    }
}
