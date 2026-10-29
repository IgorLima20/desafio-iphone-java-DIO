public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("=== REPRODUTOR MUSICAL ===");
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n=== APARELHO TELEFÔNICO ===");
        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n=== NAVEGADOR DE INTERNET ===");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
