import java.util.HashMap;
public class Magazin {
    private HashMap<Integer, Produs> inventar;

    public Magazin() {
        inventar=new HashMap<>();
    }
    public void aprovizioneaza(int codProdus, String denumire, float pret, int cantitate){
        Produs produs =new Produs(codProdus,denumire,pret,cantitate);
        inventar.put(produs.getCodProdus(),produs);
    }
    public Produs cautaProdus(int codProdus){
        return inventar.get(codProdus);
    }
    public void aprovizioneaza(int codProdus, int cantitate){
        Produs produs=cautaProdus(codProdus);
        if (produs==null){
            System.out.println("Nu exista produsul de aprovizionat.");
        }
        int cantitateveche=produs.getCantitate();
        if (cantitateveche<0){
            int cantitatep=-cantitateveche;
            produs.setCantitate(cantitatep+cantitate);
        }
        else{
        produs.setCantitate(cantitateveche+cantitate);}
    }
    public int vanzare(int codProdus, int cantitate) {
        Produs produs = cautaProdus(codProdus);

        if (produs == null) {
            System.out.println("Nu exista produsul de vandut.");
            return -1;
        }

        int cantitateCurenta = produs.getCantitate();
        int cantitateVanduta = Math.abs(cantitate);
        if (cantitateVanduta> cantitateCurenta) {
            cantitateVanduta = cantitateCurenta;
            System.out.println("S-au vandut doar " + cantitateVanduta + " produse, in limita stocului disponibil.");
        } else {
            System.out.println("S-au vandut " + cantitateVanduta + " produse.");
        }
        float valoarev=produs.getValoareVanzari();
        int cantitatev=produs.getCantitateVanduta();
        int cantitateNoua = cantitateCurenta - cantitateVanduta;
        produs.setCantitate(cantitateNoua);
        produs.setCantitateVanduta(cantitatev+cantitate);
        produs.setValoareVanzari(valoarev+cantitateVanduta* produs.getPret());
        inventar.put(codProdus,produs);
        return cantitateNoua;
    }
    public int vanzare (int codProdus){
        Produs produs = cautaProdus(codProdus);
        if (produs == null) {
            System.out.println("Nu exista produsul de vandut.");
            return -1;
        }
        int cantitateCurenta = produs.getCantitate();
        if (1> cantitateCurenta) {
            System.out.println("Nu mai sunt produse disponibile.");
            return -1;
        } else {
            System.out.println("S-au vandut " + 1 + " produs.");
        }
        int cantitateNoua = cantitateCurenta - 1;
        produs.setCantitate(cantitateNoua);
        float valoarev=produs.getValoareVanzari();
        int cantitatev=produs.getCantitateVanduta();
        produs.setCantitateVanduta(cantitatev+1);
        produs.setValoareVanzari(valoarev+ produs.getPret());
        inventar.put(codProdus,produs);
        return cantitateNoua;
    }
    public void situatieVanzari(){
        System.out.println(String.format("%-10s %-20s %-10s %-20s %-20s %-20s",
                "Cod", "Denumire", "Pret", "Cantitate Existenta", "Cantitate Vanduta", "Valoare Vanzari"));

        for (Produs produs : inventar.values()) {
            // Afișăm datele produsului cu formatul dorit
            System.out.println(String.format("%-10d %-20s %-10.2f %-20d %-20d %-20.2f",
                    produs.getCodProdus(),
                    produs.getDenumire(),
                    produs.getPret(),
                    produs.getCantitate(),
                    produs.getCantitateVanduta(),
                    produs.getValoareVanzari()));
        }
    }
    float situatieProdus(int codProdus){
        Produs produs = cautaProdus(codProdus);
        if (produs==null){
            return -1;
        }
        System.out.println(produs.toString());
        return produs.getValoareVanzari();
    }
}
