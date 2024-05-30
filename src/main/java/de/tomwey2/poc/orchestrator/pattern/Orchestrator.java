package de.tomwey2.poc.orchestrator.pattern;

public class Orchestrator {
    public Context context;

    public Orchestrator setContext(Context context) {
        this.context = context;
        return this;
    }

    public <T extends Context> Orchestrator execute(Task<T> task) {
        try {
            task.execute((T) context);
        } catch(ClassCastException e) {
            System.out.println("Error: " + e);
        }
        return this;
    }
}
