public class Iphone implements ReprodutorMusical,
        AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String urlAtual;
    private int quantidadeAbas = 1;

    @Override
    public void tocar() {
        if (musicaAtual == null || musicaAtual.isBlank()) {
            System.out.println("Nenhuma música selecionada.");
            return;
        }

        System.out.println("Tocando: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musica == null || musica.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome da música é obrigatório.");
        }

        musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    @Override
    public void ligar(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException(
                    "O número de telefone é obrigatório.");
        }

        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException(
                    "A URL é obrigatória.");
        }

        urlAtual = url;
        System.out.println("Exibindo página: " + urlAtual);
    }

    @Override
    public void adicionarNovaAba() {
        quantidadeAbas++;
        System.out.println(
                "Nova aba adicionada. Total: " + quantidadeAbas);
    }

    @Override
    public void atualizarPagina() {
        if (urlAtual == null) {
            System.out.println("Nenhuma página aberta.");
            return;
        }

        System.out.println("Atualizando página: " + urlAtual);
    }
}
