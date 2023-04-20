import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Teste_Unitario {



    @Test
    public void testeGetPrimo(){
        // PREPARE
        Numero_Primo testandoNumeroPrimo = new Numero_Primo();

        int vetorTeste[] = {1, 2, 34, 17, 10, 11};

        int vetorEsperado[] = {0,2,0,17,0,11};


        Numero_Primo testando_Numero_Primo = new Numero_Primo();


        //TEST
        testandoNumeroPrimo.Numero_Primo_Com_Vetor(vetorTeste);
        assertEquals(vetorEsperado[1], vetorTeste[1]);





    }

}
