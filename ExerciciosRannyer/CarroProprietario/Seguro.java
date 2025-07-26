package CarroProprietario;

public class Seguro {
    private String empresaSeguradora;
    private String numeroApolice;
    private boolean coberturaTotal;

    public Seguro(String empresaSeguradora, String numeroApolice, boolean coberturaTotal) {
        this.empresaSeguradora = empresaSeguradora;
        this.numeroApolice = numeroApolice;
        this.coberturaTotal = coberturaTotal;
    }

    public void exibirDados() {
        System.out.println("Seguradora: " + empresaSeguradora);
        System.out.println("Número da Apólice: " + numeroApolice);
        System.out.println("Cobertura Total: " + (coberturaTotal ? "Sim" : "Não"));
    }
}