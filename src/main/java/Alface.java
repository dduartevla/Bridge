public class Alface extends Produto{

    public Alface(float precobase){
        super(precobase);
    }
    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}
