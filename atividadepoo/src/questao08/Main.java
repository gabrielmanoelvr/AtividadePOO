package questao08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Thor"));
        animais.add(new Gato("Mia"));
        animais.add(new Vaca("Margarida"));

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
