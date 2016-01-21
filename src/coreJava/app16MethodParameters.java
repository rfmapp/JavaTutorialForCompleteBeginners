package coreJava;

/**
 * Created by rafael on 21/01/16.
 */

// Criamos uma classe
class Robot {
    // Criamos um método que recebe um parâmetro. O parâmetro fica dentro dos parênteses. É indicado pelo tipo de variável e o nome dela.
    public void speak(String text) {
        System.out.println(text);
    }

    // Outro método.
    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    // Podemos passar mais de um método.
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " metres in direction " + direction + ".");
    }
}


public class App16MethodParameters {

    public static void main(String[] args) {
        // Criamos o objeto da classe criada.
        Robot sam = new Robot();
        // Fazemos uso do método da classe criada.
        sam.speak("Hi, I'm Sam!");
        // Usando outro método.
        sam.jump(7);
        // Ao passar mais de um parâmetro, é importante observar a ordem em que devem ser passados, de acordo com a ordem definida na criação do método.
        sam.move("North", 12);
    }
}
