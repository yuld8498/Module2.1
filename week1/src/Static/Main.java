package Static;

public class Main {
    public String sayHello(String name) {
        int cnt = 0;
        class WelcomeMessage {
            WelcomeMessage(){
                System.out.println(cnt);
            }
            String getMessage() {
                return "Welcome";
            }

            void showName(){
                System.out.println(name);
            }
        }
        WelcomeMessage msg = new WelcomeMessage();
        return msg.getMessage() + " " + name + " to the Java world !";
    }

    public static void main(String[] args) {
        System.out.println(new Main().sayHello("John"));
    }
}
