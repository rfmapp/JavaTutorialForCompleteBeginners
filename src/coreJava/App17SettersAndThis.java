package coreJava;

/**
 * Created by rafael on 22/01/16.
 */

// Criamos uma classe.
class Frog {
    // Definição de variáveis. Estão como private para evitar seu acesso direto de fora da classe.
    private String name;
    private int age;

    // Método que servirá para atribuir valor à variável name. Dessa maneira evitamos a necessidade de ter acesso direto às variáveis da classe.
    // Podemos usar um nome diferente para o parâmetro passado, ou podemos usar um nome igual e fazer uso da estrutura 'this' para referenciar a variável correta.
    public void setName(String name) {
        // 'this.name' refere-se ao atributo, à variável de instância, enquanto 'name' refere-se ao parâmetro passado.
        this.name = name;
    }

    // Método que servirá para atribuir valor à variável age. Dessa maneira evitamos a necessidade de ter acesso direto às variáveis da classe.
    public void setAge(int age) {
        // 'this.age' refere-se ao atributo, à variável de instância, enquanto 'age' refere-se ao parâmetro passado.
        this.age = age;
    }

    // Podemos ainda criar um método para atribuir todos os valores juntos, mas fazendo uso dos métodos 'set' já criados.
    public void setInfo(String name, int age) {
        // Nesse caso não precisamos nos preocupar com a referência, pois a mesma já foi tratada no método 'set'.
        setName(name);
        setAge(age);
    }

    // Método que servirá para recuperar o valor da variável name.
    public String getName() {
        return name;
    }

    // Método que servirá para recuperar o valor da variável age.
    public int getAge() {
        return age;
    }
}

public class App17SettersAndThis {

    public static void main(String[] args) {
        // Criamos o objeto da classe Frog.
        Frog frog1 = new Frog();

        // Fazemos uso dos métodos para definir os valores das variáveis.
        frog1.setName("Bertie");
        frog1.setAge(1);

        // Exibimos os valores usando o método de recuperação da classe.
        System.out.println("The Frog name is " + frog1.getName() + " and it is " + frog1.getAge() + " years old.");

        // Criando novo objeto.
        Frog frog2 = new Frog();

        // Usando o método para atribuir os valores todos de uma vez.
        frog2.setInfo("Sid", 2);

        // Exibindo os valores.
        System.out.println("The Frog name is " + frog2.getName() + " and it is " + frog2.getAge() + " years old.");


    }
}
