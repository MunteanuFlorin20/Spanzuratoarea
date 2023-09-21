import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Spanzuratoarea {


    public static void main(String[] args) {

        Scanner cititor = new Scanner(System.in);
        Random generator = new Random();

        ArrayList<String> cuvinte = new ArrayList<>(Arrays.asList("masian", "casa", "caine", "farmacie", "dispensar", "extraterestru"));

        String cuvant = cuvinte.get(generator.nextInt(cuvinte.size()));
        int vietiRamase = 6;
        char[] litere = cuvant.toCharArray();
        char[] cuvantAfisat = new char[litere.length];
        Arrays.fill(cuvantAfisat, '_');

        afiseazaCuvantul(cuvantAfisat);

        while (true) {
            System.out.println("Introduceti o litera. Numarul de vieti ramase este egal cu " + vietiRamase);
            char literaIntrodusa = cititor.next().charAt(0);
            boolean cuvantulContineLitera=false;
            for (int i = 0; i <litere.length; i++) {
                if (literaIntrodusa == litere[i]) {
                    cuvantAfisat[i] = literaIntrodusa;
                    cuvantulContineLitera=true;

                    afiseazaCuvantul(cuvantAfisat);

                }
            }
            if (!cuvantulContineLitera){
                vietiRamase--;
            }
            if (vietiRamase<=0){
                System.out.println("AI PIERDUT JOCUL:((");
                break;
            }
            if(Arrays.equals(litere,cuvantAfisat)){
                System.out.println("ATI CASTIGAT!!!");
                afiseazaCuvantul(cuvantAfisat);
                break;
            }
        }

    }

    private static void afiseazaCuvantul(char[] cuvantAfisat) {
        for (char c : cuvantAfisat) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

