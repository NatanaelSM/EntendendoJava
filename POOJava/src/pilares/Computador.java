package pilares;

public class Computador {
    public static void main(String[] args) {
        Facebook face = new Facebook();
        face.enviarMensagem();
        face.receberMensagem();

        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
