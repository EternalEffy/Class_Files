import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ConstructFile {
    //private String fileName;
    private static byte[] byteArray;

   /* public ConstructFile(String fileName){
        this.fileName = fileName;
    } */

   public void readFromFile(String str) {
       File currentFile = new File(str);
       FileInputStream inputReader = null;
       try {
           inputReader = new FileInputStream(currentFile);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       byte[] byteArray = new byte[(int) currentFile.length()];
       try {
       inputReader.read(byteArray);
       } catch (IOException e) {
           e.printStackTrace();
       }
       this.byteArray = byteArray;
   }


    public int countOfSymbol(){
        return new String(byteArray).length();
    }

    public int countOfWords(){
        int countWords=0;
        String [] data = new String(byteArray).split(" +");
        for (int i=0; i<data.length; i++) {
            countWords++;
        }
        return countWords;
    }
    public int countOfProposal(){
        int countProposal=0;
        char[] charArray = new String(byteArray).toCharArray();
        for(int i=0;i<charArray.length;i++)
            if(charArray[i]=='.' || charArray[i]=='!' || charArray[i]=='?'){
                countProposal++;
            }
        return countProposal;
    }
}
