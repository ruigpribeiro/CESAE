package VidaMundial;

import VidaMundial.enums.Alimentacao;
import VidaMundial.enums.Familia;
import VidaMundial.serVivo.Animal;
import VidaMundial.serVivo.Inseto;
import VidaMundial.serVivo.Planta;
import VidaMundial.serVivo.SerVivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MeioAmbiente {
    private String nome;
    private double aguaMeio;
    private List<SerVivo> seresVivos;

    public MeioAmbiente(String nome, double aguaMeio) {
        this.nome = nome;
        this.aguaMeio = aguaMeio;
        seresVivos = new ArrayList<>();
    }

    /**
     * Adiciona um ser vivo à coleção de ser vivo
     *
     * @param serVivo
     */
    public void addSerVivo(SerVivo serVivo) {
        seresVivos.add(serVivo);
    }

    /**
     * Analisa a água disponível no meio ambiente e se possível, a planta bebe de acordo com a familia, caso contrario morre
     *
     * @param indexPlanta índice da planta na lista de seres vivos
     * @return True se poder beber, False se não poder
     */
    public boolean plantaBebe(int indexPlanta) {
        SerVivo serVivo = seresVivos.get(indexPlanta);

        if (serVivo instanceof Planta) {
            Planta planta = (Planta) serVivo;
            double quantidadeAgua = 0;

            switch (planta.getFamilia()) {
                case Familia.ARVORES:
                    quantidadeAgua = 1.00;
                    break;
                case Familia.FLORES:
                    quantidadeAgua = 0.10;
                    break;
                case Familia.ERVAS:
                    quantidadeAgua = 0.25;
                    break;
            }

            if (quantidadeAgua <= aguaMeio) {
                System.out.println("A planta bebeu água.");
                aguaMeio -= quantidadeAgua;
                return true;
            }
        }
        System.out.println("Não existe água suficiente, a planta vai morrer.");
        seresVivos.remove(indexPlanta);
        return false;
    }

    /**
     * Verifica se a planta pode ou não comer um inseto e remove o inseto/planta consoante a verificação
     *
     * @param indexPlanta Índice da planta na lista de seres vivos
     * @return True se pode comer inseto e False se não existem insetos no meio ambiente
     */
    public boolean plantaComeInsetos(int indexPlanta) {
        SerVivo serVivo = seresVivos.get(indexPlanta);

        if (serVivo instanceof Planta) {
            for (SerVivo ser : seresVivos) {

                if (ser instanceof Inseto) {
                    seresVivos.remove(ser);
                    System.out.println("A planta comeu um inseto.");
                    return true;
                }
            }
        }
        seresVivos.remove(indexPlanta);
        System.out.println("Não existem insetos no meio ambiente, a planta vai morrer.");
        return false;
    }

    /**
     * Imprime na consola a mensagem "Está muito vento"
     *
     * @param indexPlanta Índice da planta na lista de seres vivos
     */
    public void plantaAbanaComVento(int indexPlanta) {
        SerVivo serVivo = seresVivos.get(indexPlanta);
        if (serVivo instanceof Planta) {
            System.out.println("Está muito vento...");
        }
    }

    /**
     * Imprime na consola o barulho do animal
     *
     * @param indexAnimal Índice do animal na lista de seres vivos
     */
    public void animalFazBarulho(int indexAnimal) {
        SerVivo serVivo = seresVivos.get(indexAnimal);
        if (serVivo instanceof Animal) {
            ((Animal) serVivo).getBarulho();
        }
    }

    /**
     * Imprime na consola a mensagem "O <i>nome do animal</i> movimentou-se"
     *
     * @param indexAnimal
     */
    public void animalMovimenta(int indexAnimal) {
        SerVivo serVivo = seresVivos.get(indexAnimal);
        if (serVivo instanceof Animal) {
            System.out.println("O " + serVivo.getNome() + " movimentou-se.");
        }
    }

    /**
     * Analisa a água disponível no meio ambiente e se possível, o animal bebe de acordo com o seu peso, caso contrário morre
     *
     * @param indexAnimal Índice do animal na lista de seres vivos
     * @return True se poder beber, False se não poder
     */
    public boolean animalBebe(int indexAnimal) {
        SerVivo serVivo = seresVivos.get(indexAnimal);

        if (serVivo instanceof Animal) {
            double peso = ((Animal) serVivo).getPeso();
            double quantidadeAgua = peso * 0.025;

            if (quantidadeAgua <= aguaMeio) {
                System.out.println("O animal bebeu água.");
                aguaMeio -= quantidadeAgua;
                return true;
            }
        }
        System.out.println("Não existe água suficiente, o animal vai morrer.");
        seresVivos.remove(indexAnimal);
        return false;
    }

    /**
     * Verifica se um animal pode comer outro depedendo da sua alimentação
     *
     * @param indexAnimal Índice do animal na lista de seres vivos
     * @return True se comeu, False se não comeu
     */
    public boolean animalCome(int indexAnimal) {
        SerVivo serVivo = seresVivos.get(indexAnimal);

        if (serVivo instanceof Animal) {
            Animal animal = (Animal) serVivo;

            if (!animal.isFome()) {
                System.out.println("O animal está de barriga cheia!");
                return false;
            }

            for (SerVivo ser : seresVivos) {

                // Se estiver a comer uma planta
                if (animal.getDieta() == Alimentacao.HERBIVORO || animal.getDieta() == Alimentacao.OMNIVORO) {
                    Planta planta = (Planta) ser;
                    double inteligencia = animal.getInteligencia();
                    int grauDefesa = planta.getGrauDefesa();

                    if (ser instanceof Planta) {

                        if (inteligencia >= 0 && inteligencia < 20 && grauDefesa == 0) {
                            seresVivos.remove(ser);
                            animal.setFome(false);
                            return true;
                        }
                        if (inteligencia >= 20 && inteligencia < 40 && grauDefesa < 2) {
                            seresVivos.remove(ser);
                            animal.setFome(false);
                            return true;
                        }
                        if (inteligencia >= 40 && inteligencia < 80 && grauDefesa == 3) {
                            seresVivos.remove(ser);
                            animal.setFome(false);
                            return true;
                        }
                        if (inteligencia >= 80 && inteligencia < 95 && grauDefesa == 4) {
                            seresVivos.remove(ser);
                            animal.setFome(false);
                            return true;
                        }
                        if (inteligencia >= 95 && grauDefesa == 5) {
                            seresVivos.remove(ser);
                        }
                    }
                    animal.setFome(true);
                    return false;
                }

                // Se estiver a comer um animal ou inseto
                if (animal.getDieta() == Alimentacao.CARNIVORO || animal.getDieta() == Alimentacao.OMNIVORO) {

                    // Se for um animal
                    if (ser instanceof Animal) {
                        Animal animalDef = (Animal) ser;
                        double capacidadeAnimal = animal.getPeso() + (2.5 * animal.getInteligencia());
                        double capcidadeAnimalDef = animalDef.getPeso() + (2.5 * animalDef.getInteligencia());

                        if (capacidadeAnimal > capcidadeAnimalDef) {
                            seresVivos.remove(animalDef);
                            return true;
                        }
                        animal.setFome(true);
                        return false;
                    }

                    // Se for um inseto
                    if (ser instanceof Inseto) {
                        Inseto inseto = (Inseto) ser;

                        if (inseto.isVenenoso()) {
                            seresVivos.remove(animal);
                            return false;
                        }
                        animal.setFome(false);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Imprime na consola um barulho gerado aleatóriamente num conjunto
     */
    public void insetoChateia() {
        String[] barulhos = {"Bzzzz bzzzz", "Tic tic tic tic", "Pssssssss"};
        Random random = new Random();
        int index = random.nextInt(barulhos.length);
        System.out.println(barulhos[index]);
    }

    /**
     * Imprime todos os seres vivos presentes na coleção seresVivos
     */
    public void listarSeresVivos() {
        for (SerVivo ser : seresVivos) {
            ser.listarInformacoes();
        }
    }

    public void simulador(int dias) {
        Random random = new Random();

        // Por cada dia
        for (int dia = 0; dia < dias; dia++) {
            System.out.println("***** Um novo dia começa na " + nome + "*****\n");
            listarSeresVivos(); // Imprime todos os seres vivos

            // Animais ficam todos com fome a cada dia novo
            for (SerVivo ser : seresVivos) {
                if (ser instanceof Animal) {
                    ((Animal) ser).setFome(true);
                }
            }

            // Para cada momento: manhã, tarde e noite
            for (int momento = 0; momento < 3; momento++) {
                int acontecimento = random.nextInt(4) + 1;
                List<Integer> indices = new ArrayList<>();

                for (int i = 0; i < seresVivos.size(); i++) {
                    SerVivo serVivoAtual = seresVivos.get(i);

                    if (acontecimento == 1 && serVivoAtual instanceof Animal) {
                        indices.add(i);
                    }
                    if (acontecimento == 2 && serVivoAtual instanceof Planta) {
                        indices.add(i);
                    }
                    if (acontecimento == 3 && serVivoAtual instanceof Inseto) {
                        indices.add(i);
                    }
                }

                int index = indices.get(random.nextInt(indices.size()));
                SerVivo serVivo = seresVivos.get(index);

                // Caso seja planta
                if (serVivo instanceof Planta) {
                    int metodoAleatorio = random.nextInt(3);

                    switch (metodoAleatorio) {
                        case 0:
                            plantaAbanaComVento(index);
                            break;
                        case 1:
                            plantaBebe(index);
                            break;
                        case 2:
                            plantaComeInsetos(index);
                            break;
                    }
                }

                // Caso seja animal
                if (serVivo instanceof Animal) {
                    int metodoAleatorio = random.nextInt(4);

                    switch (metodoAleatorio) {
                        case 0:
                            animalFazBarulho(index);
                            break;
                        case 1:
                            animalMovimenta(index);
                            break;
                        case 2:
                            animalBebe(index);
                            break;
                        case 3:
                            animalCome(index);
                            break;
                    }
                }

                // Caso seja inseto
                if (serVivo instanceof Inseto) {
                    insetoChateia();
                }

                // Caso o acontecimento seja uma catrástofe natural
                if (acontecimento == 4) {
                    int randomCenario = random.nextInt(3);

                    switch (randomCenario) {
                        case 0:
                            System.out.println("Seca: Diminuindo a água para metade...");
                            aguaMeio /= 2;
                            break;
                        case 1:
                            System.out.println("Chuvas: Aumentando a água para o dobro...");
                            aguaMeio *= 2;
                            break;
                        case 2:
                            System.out.println("Erupção Vulcânica: Morreram metade das plantas e metade dos animais...");
                            int plantasMortas = 0;
                            int animaisMortos = 0;

                            // Remover metade das plantas e metade dos animais
                            for (int i = 0; i < seresVivos.size() / 2; i++) {
                                if (seresVivos.get(i) instanceof Planta && plantasMortas < seresVivos.size() / 4) {
                                    seresVivos.remove(i);
                                    plantasMortas++;
                                } else if (seresVivos.get(i) instanceof Animal && animaisMortos < seresVivos.size() / 4) {
                                    seresVivos.remove(i);
                                    animaisMortos++;
                                }
                            }
                            break;
                    }
                }

                // Verificação no final do terceiro momento
                if (momento == 2) {
                    for (SerVivo serAtual : seresVivos) {
                        SerVivo serVivoAtual = serAtual;
                        int indexAnimalAtual = seresVivos.indexOf(serVivoAtual);

                        if (serAtual instanceof Animal) {
                            Animal animalAtual = (Animal) serAtual;
                            if (animalAtual.isFome()) {
                                boolean comeu = animalCome(indexAnimalAtual);

                                if (!comeu) {
                                    System.out.println("O animal " + animalAtual.getNome() + " morreu de fome.");
                                    seresVivos.remove(animalAtual);
                                }
                            }
                        }
                    }
                }
            }

            // Final do dia imprimir os seres que se mantiveram vivos
            System.out.println("Seres vivos no final do dia: ");
            for (SerVivo serAtual : seresVivos) {
                serAtual.listarInformacoes();
            }
        }
    }
}
