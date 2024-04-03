import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testSepararNomesFemininos() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Pedro");

        List<String> nomesFemininos = separarNomesFemininos(nomes);

        List<String> nomesEsperados = new ArrayList<>();
        nomesEsperados.add("Maria");
        nomesEsperados.add("Ana");

        assertEquals(nomesEsperados, nomesFemininos);
    }

    private List<String> separarNomesFemininos(List<String> nomes) {
        return nomes.stream()
                .filter(nome -> nome.charAt(nome.length() - 1) == 'a')
                .collect(Collectors.toList());
    }
}