public abstract class Produto {
    protected Qualidade qualidade;
    protected float precoBase;

    public Produto(float precoBase){
        this.precoBase = precoBase;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
