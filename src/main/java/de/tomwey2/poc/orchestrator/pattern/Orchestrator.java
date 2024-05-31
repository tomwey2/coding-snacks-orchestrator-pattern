package de.tomwey2.poc.orchestrator.pattern;

import java.util.List;

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

    public <T extends Context> Orchestrator sequence(List<Task<T>> tasks) {
        tasks.forEach(this::execute);
        return this;
    }

    public <T extends Context> Orchestrator parallel(List<Task<T>> tasks) {
        tasks.stream().parallel().forEach(this::execute);
        return this;
    }
}
