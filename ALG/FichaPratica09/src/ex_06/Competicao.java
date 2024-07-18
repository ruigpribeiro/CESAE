package ex_06;

public class Competicao {
    private String nomeCompeticao;
    private String paisCompeticao;
    private Atleta[] listaAtletas = new Atleta[30];

    // Construtor
    public Competicao(String nomeCompeticao, String paisCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
        this.paisCompeticao = paisCompeticao;
    }

    // Adicionar atletas à array de atletas
    public void adicionarAtleta(Atleta atleta) {
        for (int i = 0; i < listaAtletas.length; i++) {
            if (listaAtletas[i] == null && atleta.getModalidade().equals(nomeCompeticao)) {
                listaAtletas[i] = atleta;
                return;
            }
        }
    }

    // Imprime as informacoes da competicao e os seus atletas
    public void imprimirInformacoes() {
        System.out.println("Competição: " + nomeCompeticao + "\n");
        for (int i = 0; i < listaAtletas.length; i++) {
            if (listaAtletas[i] != null) {
                System.out.println(listaAtletas[i]);
            }
        }
    }
}
