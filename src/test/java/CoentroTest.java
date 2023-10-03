import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoentroTest {

    @Test
    void deveRetornarPrecoCoentroComum(){
        Qualidade qualidade = new Comum();
        Coentro coentro = new Coentro(3.00f);
        coentro.setQualidade(qualidade);
        assertEquals(3.00f,coentro.calcularPreco(),0.0f);
    }

    @Test
    void deveRetornarPrecoCoentroPremium(){
        Qualidade qualidade = new Premium();
        Coentro coentro = new Coentro(3.00f);
        coentro.setQualidade(qualidade);
        assertEquals(3.30f,coentro.calcularPreco(),0.1f);
    }

    @Test
    void deveRetornarPrecoCoentroSelect(){
        Qualidade qualidade = new Gourmet();
        Coentro coentro = new Coentro(3.00f);
        coentro.setQualidade(qualidade);
        assertEquals(4.50f,coentro.calcularPreco(),0.5f);
    }

}