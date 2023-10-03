public class Coentro extends Produto{

    public Coentro(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}
