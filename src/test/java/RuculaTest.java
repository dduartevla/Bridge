import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuculaTest {

    @Test
    void deveRetornarPrecoRuculaComum(){
        Qualidade qualidade = new Comum();
        Rucula rucula = new Rucula(3.00f);
        rucula.setQualidade(qualidade);
        assertEquals(3.00f,rucula.calcularPreco(),0.0f);
    }

    @Test
    void deveRetornarPrecoRuculaPremium(){
        Qualidade qualidade = new Premium();
        Rucula rucula = new Rucula(3.00f);
        rucula.setQualidade(qualidade);
        assertEquals(3.30f,rucula.calcularPreco(),0.1f);
    }

    @Test
    void deveRetornarPrecoRuculaSelect(){
        Qualidade qualidade = new Gourmet();
        Rucula rucula = new Rucula(3.00f);
        rucula.setQualidade(qualidade);
        assertEquals(4.50f,rucula.calcularPreco(),0.5f);
    }

}