public abstract class Produto {
    protected Qualidade qualidade;
    protected double precoBase;

    public Produto(float precoBase){
        this.precoBase = precoBase;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();
}
