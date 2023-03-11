package pilares;

public class MSN extends SistemaDeMensagens{
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Mensagem enviada pelo MSN!");
        salvarMensagem();
    }
    @Override
    public void receberMensagem() {
        verificarConexao();
        System.out.println("Mensagem recebida pelo MSN!");
    }
}
