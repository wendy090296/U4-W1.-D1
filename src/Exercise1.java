import java.util.Arrays;


public class Exercise1 {
    public static void main(String[] args) {

                      //---------ESERCIZIO 1.1----------------//
        int num1=2;
        int num2= 20;

        int prodotto=moltiplica(num1,num2);
        System.out.println("Il prodotto di " + num1 + " e " + num2 + " é: " + prodotto);

                      //---------ESERCIZIO 1.2----------------//

        String string = " Il Numero ";
        int number = 100;

        String result = concat(string, number);

        System.out.println("Il risultato della concatenazione è: " + result);

                      //---------ESERCIZIO 1.3----------------//

        String[] arrayIniziale = {"Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5"};
        String nuovaStringa = "NuovaStringa";


        String[] arrayModificato = aggiungiElemento(arrayIniziale, nuovaStringa);

        System.out.println("Array modificato: " + Arrays.toString(arrayModificato));




    }      //----------METODO 1.1---------//
    public static int moltiplica(int num1, int num2){

        return num1 * num2;
    }

          //----------METODO 1.2---------//
    public static String concat(String str, int num) {
        return str + num;
    }

            //----------METODO 1.3---------//
    public static String[] aggiungiElemento(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];


        // Copio i primi tre elementi dall'array iniziale al nuovo array
        System.arraycopy(array, 0, nuovoArray, 0, 3);

        // Copio gli elementi dalla quarta posizione in avanti spostandoli in avanti di due posizioni
        System.arraycopy(array, 3, nuovoArray, 4, array.length - 3);

        // Aggiungo la nuova stringa al terzo posto
        nuovoArray[2] = nuovaStringa;

        return nuovoArray;
    }

}