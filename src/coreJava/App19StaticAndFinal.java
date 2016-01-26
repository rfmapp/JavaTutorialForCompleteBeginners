package coreJava;

/**
 * Created by rafael on 26/01/16.
 */

class Thing {
    // Variáveis. Também conhecida como variável de instância.
    public String name;
    // Essa é uma variável estática. Também conhecida como variável de classe.
    public static String description;
    // Essa é uma 'variável' estática E constante, por isso o uso de 'final'. O uso de letras maiúsculas no nome da variável é uma convenção e sempre deve-se dar um valor à variável.
    public final static int LUCKY_NUMBER = 31;
}


public class App19StaticAndFinal {

    public static void main(String[] args) {

        // Criamos os objetos da classe.
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        // Acessamos as variáveis de instância através dos objetos criados.
        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        // Acessamos as variáveis de classe diretamente, sem criar o objeto.
        Thing.description = "I'm a thing!";

        System.out.println(Thing.description);

        // Vendo o valor da constante.
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
