import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //now, why would i develop it as a class? i've got no reason to


        int p,g,a,b = 0;
        System.out.println("inserire p (deve essere un numero primo)");
        try {
            p = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("inserire g");
        try {
            g = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("inserire a (deve essere minore di p)");
        try {
            a = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("inserire b");
        try {
            b = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        BigInteger A = firstStage(p,g,a);
        BigInteger B = firstStage(p,g,b);
        BigInteger Ka =secondStage(A,p,a);
        BigInteger Kb =secondStage(B,p,b);


        System.out.println("Valore di A = "+ A);
        System.out.println("Valore di B = "+ B);
        System.out.println("Valore di B^a = "+ B.pow(a));
        System.out.println("Valore di A^b = "+ A.pow(b));

        System.out.println("Valore di Ka = "+ Ka);
        System.out.println("Valore di Kb = "+ Kb);

    }

    public static BigInteger firstStage(int P, int G, int ab){//funzione basica, molto basica
        BigInteger Gg = BigInteger.valueOf(G);
        BigInteger Pp = BigInteger.valueOf(P);
        BigInteger AaBb = BigInteger.valueOf(ab);
        return Pp.modPow(AaBb,Gg);
    }

    public static BigInteger secondStage(BigInteger AB, int P, int ayb){//funzione basica, molto basica
        BigInteger Pp = BigInteger.valueOf(P);
        BigInteger AYB = BigInteger.valueOf(ayb);
        return AB.modPow(AYB,Pp);
    }

    public static BigInteger backwardsCalc(){//not working, yet

        return ab;
    }
}