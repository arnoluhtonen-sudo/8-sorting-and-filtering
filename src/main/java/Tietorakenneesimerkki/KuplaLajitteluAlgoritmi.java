package Tietorakenneesimerkki;

public class KuplaLajitteluAlgoritmi {
    // Lajittele arvot pienimmästä isompaan
    public static void main(String[] args) {
        int[] values = { 8, 3, 9, 2, 1 };
        boolean swapDone = true;

        while (swapDone) {
            swapDone = false;
            for (int i = 0; i < values.length -1; i++) {
                if (values[i] > values[i + 1]) {
                    // Arvot saadaan vaihdettua mutta ei voida menettää entisiä arvoja
                    // Tarvitaan välimuuttuja
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                    swapDone = true;
                    
                    
                }
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

}
