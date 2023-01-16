public class SayGoodbye {
    void goodbye() {
        String goodbye = "See you next time! Goodbye!";
        for (int i = 0; i < goodbye.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(goodbye);
        for (int i = 0; i < goodbye.length(); i++) {
            System.out.print("*");
        }
    }

}
