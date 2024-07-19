package ex_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {
    private double premio;
    private List<Pessoa> arrayList;

    public Sorteio() {
        arrayList = new ArrayList<>();
    }

    public void adicionarParticipante(Pessoa pessoa) {
        if (pessoa.getIdade() >= 18) {
            arrayList.add(pessoa);
        } else {
            System.out.println("Não podes participar pois és menor de idade!");
        }
    }

    public Pessoa sortear() {
        int random = new Random().nextInt(arrayList.size());
        return arrayList.get(random);
    }

    public void imprimirListaParticipantes() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Participante " + (i+1) + ": " + arrayList.get(i).getNome() + " | " + arrayList.get(i).getIdade() + " | "
                    + arrayList.get(i).getTelemovel() + " | " + arrayList.get(i).getEmail());
        }
    }
}
