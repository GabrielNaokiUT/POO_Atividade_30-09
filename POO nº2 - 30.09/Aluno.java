class Aluno extends Pessoa {

    String curso;

    public Aluno(String nome, String curso, int idade){
        super(nome,idade);
        this.curso = curso;
    }
    public Aluno(String nome, String curso){
        super(nome,18);
        this.curso = curso;
    }
    public void mostrarinfo(){
        System.out.println(
            "Nome: " + nome + "\n" +
            "Idade: " + idade + " anos \n" + 
            "Curso: " + curso + "\n" 
        );
    }
}
