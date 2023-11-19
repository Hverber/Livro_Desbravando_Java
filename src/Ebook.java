public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook (Autor autor){
        super(autor);
    }
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }



}
