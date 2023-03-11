package pilares;

public class Facebook extends SistemaDeMensagens{
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Mensagem enviada pelo Facebook!");
        salvarMensagem();
    }
    @Override
    public void receberMensagem() {
        verificarConexao();
        System.out.println("Mensagem recebida pelo Facebook!");
    }

}
