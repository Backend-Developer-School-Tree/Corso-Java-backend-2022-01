package gestione_veicoli;

public class GestioneVeicoli {

    public static void main(String[] args) {
        AutoMobile automobile = new AutoMobile("cf123rm", 4, 4);
        AutoCarro autoCarro = new AutoCarro("ca133sm", 4, 2);
        System.out.println(automobile);
        System.out.println(autoCarro);
    }

}