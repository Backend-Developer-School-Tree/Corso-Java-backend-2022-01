package lampadina;

public class Impianto {

    public void staccaElettricita(){
        Lampadina.hasElectricity = false;
    }

    public void attaccaElettricita(){
        Lampadina.hasElectricity = true;
    }


}
