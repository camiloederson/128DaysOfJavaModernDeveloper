package Testing;

public class App {
    Greeter greeter;

    public App(Greeter greeter) {
        this.greeter = greeter;
    }

    String run(){
        return  greeter.sayHello();
    }
}
