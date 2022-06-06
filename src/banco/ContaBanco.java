package banco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private  boolean status;

    //Métodos Personalizados

    public void estadoAtual() {
        System.out.println("--------------------------");
        System.out.println("Conta: " + numConta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: " + saldo);
        System.out.println("Status: " + status);
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(tipo)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem saldo positivo.");
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois tem saldo negativo.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) { //simplicado de this.isStatus == true
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar. Conta inexistente.");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta inexistente.");
        }
    }

    public void pagarMensalidade() {
        int taxa = 0;
        if (this.getTipo().equals("CC")) {
            taxa = 12;
        } else if (this.getTipo().equals("CP")) {
            taxa = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() >= taxa) {
                setSaldo(getSaldo() - taxa);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar com uma conta inexistente.");
        }

    }

    //Métodos Especiais

    //construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    //getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() { // is porque é booleano
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
