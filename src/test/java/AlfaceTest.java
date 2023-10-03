import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlfaceTest {
    @Test
    void deveRetornarPrecoAlfaceComum(){
        Qualidade qualidade = new Comum();
        Alface alface = new Alface(3.00f);
        alface.setQualidade(qualidade);
        assertEquals(3.00f,alface.calcularPreco(),0.0f);
    }

    @Test
    void deveRetornarPrecoAlfacePremium(){
        Qualidade qualidade = new Premium();
        Alface alface = new Alface(3.00f);
        alface.setQualidade(qualidade);
        assertEquals(3.30f,alface.calcularPreco(),0.1f);
    }

    @Test
    void deveRetornarPrecoAlfaceSelect(){
        Qualidade qualidade = new Gourmet();
        Alface alface = new Alface(3.00f);
        alface.setQualidade(qualidade);
        assertEquals(4.50f,alface.calcularPreco(),0.5f);
    }
}