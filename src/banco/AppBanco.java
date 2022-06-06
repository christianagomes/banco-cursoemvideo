package banco;

public class AppBanco {
    public static void main(String[] args) {

        ContaBanco contaBanco = new ContaBanco();
        contaBanco.setNumConta(1111);
        contaBanco.setDono("Chris");
        contaBanco.abrirConta("CC");

        ContaBanco contaBanco1 = new ContaBanco();
        contaBanco1.setNumConta(2222);
        contaBanco1.setDono("Matheus");
        contaBanco1.abrirConta("CP");

        contaBanco.depositar(100);
        contaBanco1.depositar(500);
        contaBanco1.sacar(100);


        contaBanco.estadoAtual();
        contaBanco1.estadoAtual();
    }

}
