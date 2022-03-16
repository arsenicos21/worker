public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener1 = System.out::println;
        OnTaskErrorListener listener2 = System.out::println;

        Worker worker = new Worker(listener1, listener2);
        worker.start();
    }
}
