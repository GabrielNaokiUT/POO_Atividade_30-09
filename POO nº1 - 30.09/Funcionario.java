public class Funcionario {

    String nome;
    double salbruto;
    double salliquido;

    public Funcionario(String nome, double salbruto){
        this.nome = nome;
        this.salbruto = salbruto;
        this.salliquido = this.salbruto * 0.9;
    }
    public Funcionario(String nome){
        this.nome = nome;
        this.salbruto = 2000;
        this.salliquido = salbruto * 0.9;
    }

    public void mostrarinfo(){
        System.out.printf(
            "Nome: " + nome + "\n" +
            "Salário bruto: R$" + String.format("%.2f", salbruto) + "\n" +
            "Salário líquido: R$" + String.format("%.2f", salliquido) + "\n" +
            "\n"
        );
    }
}
