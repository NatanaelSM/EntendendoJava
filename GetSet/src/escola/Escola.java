package escola;

public class Escola {
    public static void main(String[] args) {
        Alunos felipe = new Alunos();

        felipe.setNome("Felipe");
        felipe.setIdade(15);

        System.out.println("O aluno " + felipe.getNome() + " de " + felipe.getIdade() +
                " foi cadastrado!");
    }
}
