package pilares;

public abstract class SistemaDeMensagens {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void verificarConexao(){
        System.out.println("Conexão estável");
    }
    protected void salvarMensagem(){
        System.out.println("Mensagem salva no MSN!");
    }
}
