public class Rucula extends Produto{
    public Rucula(float precoBase) {
        super(precoBase);
    }
    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}
