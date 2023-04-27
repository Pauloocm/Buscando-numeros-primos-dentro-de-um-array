public class Numero_Primo {

    public int[] vetorPrimos = new int[6];


    public void Numero_Primo(int numTeste) {
        if (numTeste > 1) {
            if (numTeste == 2) {
                System.out.println("Primo: " + numTeste);
            } else if (numTeste % 2 != 0) {
                System.out.println("Primo: " + numTeste);
            } else {
                System.out.println("Nao e primo!");
            }
        } else {
            System.out.println("Nao e primo!");
        }
    }


    public int[] Numero_Primo_Com_Vetor(int[] vetorTeste) {

        int[] vetorDePrimos = new int[vetorTeste.length];

        for (int i = 0; i < vetorTeste.length; i++) {
            if (vetorTeste[i] > 1) {
                if (vetorTeste[i] == 2) {
                    vetorDePrimos[i] = vetorTeste[i];
                } else if (vetorTeste[i] % 2 != 0) {
                    vetorDePrimos[i] = vetorTeste[i];
                }
            }
        }

        return vetorDePrimos;
    }
}
