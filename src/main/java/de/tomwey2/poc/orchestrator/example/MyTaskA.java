package de.tomwey2.poc.orchestrator.example;

import de.tomwey2.poc.orchestrator.pattern.Task;

public class MyTaskA implements Task<ContextA> {
    @Override
    public void execute(ContextA context) {
        System.out.println("TaskA - " + context.getValue());
    }
}
