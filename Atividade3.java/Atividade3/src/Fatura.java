public class Fatura {
    private String numero;
    private String desc;//descrição
    private int quant;//quantidade comprada
    private double p_item;//preço por item
    

    public Fatura(String numero, String desc, int quant,double p_item) {
        this.numero=numero;
        this.desc=desc;
        this.quant= quant < 0 ? 0 : quant; //if else diferentão
        this.p_item = p_item < 0 ? 0.0 : p_item;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant < 0 ? 0 : quant;
    }

    public double getP_item() {
        return p_item;
    }

    public void setP_item(double p_item) {
        this.p_item = p_item < 0 ? 0.0 : p_item;
    }

    public double getTotalFatura() {
        return quant * p_item;
    }
   
    //MAIN
    public static void main(String[] args) throws Exception  {
        Fatura fat1 = new Fatura("22", "testando", 5, 25.5);
        System.out.println("fatura total: "+fat1.getTotalFatura());

      /*  Fatura fat2= new Fatura("53", "testando2", 2, 2.5);
        System.out.println("fatura total 2: "+fat2.getTotalFatura());*/
    }
}
