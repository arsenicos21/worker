import java.util.function.Predicate;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;

    Predicate<Integer> isError = x -> x == 32;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error) {
        this.callback = callback;
        this.error = error;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (isError.test(i)) {
                error.onError("An error occurred while performing task " + (i + 1));
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }
}

