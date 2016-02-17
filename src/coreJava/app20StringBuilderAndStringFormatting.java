package coreJava;

/**
 * Created by rafael on 17/02/16.
 */
public class App20StringBuilderAndStringFormatting {

    public static void main(String[] args) {
        //Criamos o objeto da classe. Ele é inicializado com vazio.
        StringBuilder sb = new StringBuilder("");

        // Iremos agora adicionar novos valores (append).
        // Primeiro temos essa maneira.
        //sb.append("My name is Sue.");
        //sb.append(" ");
        //sb.append("I am a lion tamer.");

        // Ou ainda outra mais eficiente:
        sb.append("My name is Sue.")
                .append(" ")
                .append("I am a lion tamer.");

        System.out.println(sb.toString());

        // Formatando Strings.
        System.out.println("Here is some text.\tThat was a tab.\nThat was a new line.");

        // Podemos usar caracteres especiais para referenciar tipos de dados dentro de uma string.
        // Para isso precisamos usar printf.
        // Nesse caso usamos %d para referenciar um inteiro.
        System.out.printf("Total cost is: %d", 5);
        // AInda sobre o uso desses caracteres especiais, específicamente falando de números, podemos definir a
        // quantidade de casas decimais que queremos exibir. Por exemplo:
        for (int i = 0; i <=20; i++){
            System.out.printf("%2d\n", i);
        }
        // No caso acima, usando "%2d" ou apenas "%d", o número será impresso corretamente, mas com o uso de "%2d"
        // temos uma formatação na exibição dos números, para que fiquem alinhados à direita.

        // Outros dois exemplos. Primeiro com strings.
        System.out.printf("My name is %s", "Rafael!");
        System.out.println("");
        // Agora com ponrto flututante. Lembrando que podemos também definir o número de casas decimais.
        // Formatação padrão:
        System.out.printf("My salary is %f", 2000.00);
        System.out.println("");
        // Formatando para uma apresentação melhor das casas decimais depois da vírgula.
        System.out.printf("My salary is %.2f", 2000.00);

    }
}
