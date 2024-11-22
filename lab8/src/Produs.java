public class Produs {
    private int codProdus;
    private String denumire;
    private float pret;
    private int cantitate;
    private float valoareVanzari;
    private int cantitateVanduta;


    public Produs(int codProdus, String denumire, float pret, int cantitate) {
        this.codProdus = codProdus;
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        valoareVanzari=0;
        cantitateVanduta=0;
    }

    public int getCantitateVanduta() {
        return cantitateVanduta;
    }

    public void setCantitateVanduta(int cantitateVanduta) {
        this.cantitateVanduta = cantitateVanduta;
    }

    public int getCodProdus() {
        return codProdus;
    }
    public float getValoareVanzari(){
        return valoareVanzari;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCodProdus(int codProdus) {
        this.codProdus = codProdus;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setValoareVanzari(float valoareVanzari) {
        this.valoareVanzari = valoareVanzari;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "codProdus=" + codProdus +
                ", denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", valoareVanzari=" + valoareVanzari +
                ", cantitateVanduta=" + cantitateVanduta +
                '}';
    }
}
