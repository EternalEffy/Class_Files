import java.io.*;
import java.sql.Struct;
import java.util.Scanner;

public class Files {
    private static String fileName;
    public static byte[] byteArray;

    public static void main(String arg[]) throws IOException {
        System.out.println("Введите имя файла");
        Scanner console = new Scanner(System.in);
        fileName = console.nextLine();
        File currentFile = new File(fileName);
        byteArray = new byte[(int)currentFile.length()];
        byteArray = readFromFile();
        countOfSymbol();
        countOfWords();
        countOfProposal();
    }

    public static byte[] readFromFile() throws IOException {
        File currentFile = new File(fileName);
        FileInputStream inputReader = new FileInputStream(currentFile);
        byte[] byteArray = new byte[(int)currentFile.length()];
        inputReader.read(byteArray);
        String dataFile = new String(byteArray);
        System.out.println(dataFile);
        return byteArray;
    }
    public static void countOfSymbol(){
        String dataFile = new String(byteArray);
        System.out.println("Количество символов в файле: "+dataFile.length());
    }
    public static void countOfWords(){
        int countWords=0;
        String dataFile = new String(byteArray);
        String [] data = dataFile.split(" +");
        for (int i=0; i<data.length; i++) {
            countWords++;
        }
        System.out.println("Количество слов в файле:" +countWords);
    }
    public static void  countOfProposal(){
        int countProposal=0;
        String dataFile = new String(byteArray);
        char[] charArray = dataFile.toCharArray();
        char end = '.';
        char end2 = '!';
        char end3 ='?';
        for(int i=0;i<charArray.length;i++)
            if(charArray[i]==end || charArray[i]==end2 || charArray[i]==end3){
                countProposal++;
            }
        System.out.println("Количество предложений в файле: "+countProposal);
    }
}
