public class Main {
    public static void main(String[] args) {
    int[] array = {4,5,2,1,5};
    divideByZeroArray(array,5);
    }

    public static void divideByZeroArray(int[] array, int indexArray) {
        try {
            int risultato = array[indexArray] / 0;
            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore nel calcolo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice non presente nell'array: " + e.getMessage());
        }
    }
}