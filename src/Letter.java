import java.util.Scanner;

public class Letter {
 /*i have absolutely no idea of what i have to do
 *prepare input for the encryption class
 * print the ecrypted code
 *
 *
 *
 * */
 //we shall now do the rot13 encryption standard

    public static int offset(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el Offset numerico deseado: ");
        if(sc.nextInt() ==  );
    }

    public static String ingestor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el texto de criptar: ");
        return sc.nextLine();
    }

    public String encrypt(String a){
        String result ="";
        for(int i=0;i<a.length();i++){
            result.concat(Character.toString(a.codePointAt(i)+13));
        }
        return result;
    }

    public String encrypt13(String a){
        String result ="";
        for(int i=0;i<a.length();i++){
            result.concat(Character.toString(a.codePointAt(i)+13));
        }
        return result;
    }
    public String decrypt13(String a){
        String result ="";
        for(int i=0;i<a.length();i++){
            if(a.codePointAt(i)>65 && a.codePointAt(i)<90 || a.codePointAt(i)<97 && a.codePointAt(i)>122){
                int num = a.codePointAt(i);
                result.concat(Character.toString(a.codePointAt(i)-13));
        }else{result.concat("_");}

        }
        return result;
    }

    public int addMod(int num, int uplim, int lowlim){//no idea of what to do
        int result;
        if((num-uplim)<13)
            lowlim+=(num-uplim);
        return result;
    }

}
