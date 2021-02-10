import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ConstructFile {

    private byte[] byteArray;

    public void readFromFile(String fileName) {
       FileInputStream inputReader = null;
       try {
           inputReader = new FileInputStream(fileName);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
        try {
            byteArray = new byte[(inputReader.available())];
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
       inputReader.read(byteArray);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }


    public int countOfSymbol(){
        return new String(byteArray).length();
    }

    public int countOfWords(){
        String [] data = new String(byteArray).split(" +");
        return data.length;
    }

    public int countOfProposal(){
        int countProposal=0;
        String data = new String(byteArray);
        int size=data.length();
        for(int i=0;i<size;i++)
           if(data.charAt(i) == '!' || data.charAt(i) == '?' || data.charAt(i) == '.') {
               countProposal++;
           }
        return countProposal;
    }
}
