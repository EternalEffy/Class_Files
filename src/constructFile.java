import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class constructFile {
    public static String fileName;
    public static byte[] byteArray;

    public void readFromFile() throws IOException {
        File currentFile = new File(fileName);
        FileInputStream inputReader = new FileInputStream(currentFile);
        byte[] byteArray = new byte[(int)currentFile.length()];
        inputReader.read(byteArray);
        this.byteArray = byteArray;
    }
    public static String countOfSymbol(){
        return (String.valueOf(byteArray.length));
    }

    public static int countOfWords(){
        int countWords=0;
        String dataFile = new String(byteArray);
        String [] data = dataFile.split(" +");
        for (int i=0; i<data.length; i++) {
            countWords++;
        }
        return countWords;
    }
    public static int countOfProposal(){
        int countProposal=0;
        String dataFile = new String(byteArray);
        char[] charArray = dataFile.toCharArray();
        for(int i=0;i<charArray.length;i++)
            if(charArray[i]=='.' || charArray[i]=='!' || charArray[i]=='?'){
                countProposal++;
            }
        return countProposal;
    }
}
