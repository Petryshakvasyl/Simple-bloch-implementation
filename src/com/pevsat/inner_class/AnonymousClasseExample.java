package com.pevsat.inner_class;

import java.util.Map;

/**
 * Created by pevsat on 07.09.2017.
 */
public class AnonymousClasseExample {

    interface HellowWorld{
        void greet();
        void greetSomeone(String someone);

    }

    public void sayHello(){

        class EnglishGreeting implements HellowWorld{
           private String name = "Word";

            @Override
            public void greet() {
                greetSomeone("Word");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HellowWorld englishGreeting = new EnglishGreeting();

        class FrenchGreeting implements HellowWorld{
            private String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        }

        HellowWorld frenchGreeting = new FrenchGreeting();

        HellowWorld spanishGreeting = new HellowWorld() {

            String name = "mundo";
            @Override
           public void greet(){
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        AnonymousClasseExample app = new AnonymousClasseExample();
        app.sayHello();

    }
}
