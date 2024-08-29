package ThreadConcept;

import java.util.concurrent.Callable;

public class CallableMessage implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello from callable interface which return the value";
    }
}
