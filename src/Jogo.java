public class Jogo {

    String nome;
    String genero;
    int ano;
    double nota;

    public Jogo(String nome, String genero, int ano, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.nota = nota;
    }

    public void exibir() {
        System.out.println(
                "Nome: " + nome +
                        " | Gênero: " + genero +
                        " | Ano: " + ano +
                        " | Nota: " + nota
        );
    }
}