
public class principal {

    public static void main(String[] args) {
        agenda agenda1 = new agenda();
        agenda agenda2 = new agenda();

        agenda1.anotar(12, 10, "Dia da Criança!");
        agenda2.anotar(12, 15, "Natal");

        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();

//        agenda2.dia=12;
//        agenda2.mes=15;
//        agenda2.anotacao="Natal";
//        agenda1.mostraAnotacao();
    }
}
