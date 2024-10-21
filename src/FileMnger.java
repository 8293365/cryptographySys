import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileMnger {

    public String StrName;

    private File myObj;
    public File getMyObj(){return myObj;}
    public void setMyObj(File newMyObj){this.myObj= newMyObj;}

    public FileMnger(){}


    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public void getter(String StrName){
        File text = new File(StrName);
        if( text.exists() && text.canRead()){

        }
        return;
    }

    public static void getter(String args) {
        try {
            File textFile = new File(args);
            Scanner myReader = new Scanner(myObj);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String reader(){
        String str;
        while (myReader.hasNextLine()) {
            str = myReader.nextLine();

        }
        myReader.close();
        return str;
    }
    public String chewer(int biteSize){
        String str;


        return str;
    }//takes the String from the reader and then truncates the code to the wanted size;

}
