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
       inputReader.read(byteArray = new byte[(inputReader.available())]);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }


    public int countOfSymbol(){
        return new String(byteArray).length();
    }

    public String[] countOfWords(){
        return new String(byteArray).split(" +");
    }

    public int countOfProposal(){
        int countProposal=0;
        String data = new String(byteArray);
        for(int i=0;i<data.length();i++)
           if(data.charAt(i) == '!' || data.charAt(i) == '?' || data.charAt(i) == '.') {
               countProposal++;
           }
        return countProposal;
    }
}
