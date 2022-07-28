/**
 * Anonymous Class
 *
 * Interface obj = new Interface(){//code}
 */

interface Playable {
    void play();
}

class Q_AnonymousInnerClass {

    public static void main(String[] args) {
        //without lambadas
        Playable obj1 = new Playable() {
            @Override
            public void play() {
                System.out.println("Lets play Cricket");
            }
        };

        //Java 8
        Playable obj2 = () -> System.out.println("Lets play Football");

        //Calling method
        obj1.play();
        obj2.play();
    }
}
