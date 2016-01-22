package coreJava;

/**
 * Created by rafael on 22/01/16.
 */

// Criação da classe.
class Machine {
    //
    private String name;

    // Método construtor. É invocado sempre que o objeto da classe é criado. Tem sempre o mesmo nome da classe.
    public Machine() {
        System.out.println("Constructor Running!");
    }

    // Podemos ter mais de um construtor. Por exemplo, se quisermos um construtor com passagem de parâmetros.
    public Machine(String name) {
        System.out.println("Second Constructor!");
        // Atribuímos o valor da variável.
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class App18Constructors {
    public static void main(String[] args) {
        // Criação do objeto da classe.
        Machine machine1 = new Machine();

        // Criando um segundo objeto, utilizando o construtor com parâmetro.
        Machine machine2 = new Machine("Rafael");

        // Recuperando o dado passado como parâmetro.
        System.out.println(machine2.getName());
    }
}
