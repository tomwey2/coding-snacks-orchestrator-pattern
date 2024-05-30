package de.tomwey2.poc.orchestrator.example;

import de.tomwey2.poc.orchestrator.pattern.Task;

public class MyTaskB implements Task<ContextB> {
    @Override
    public void execute(ContextB context) {
        System.out.println("TaskB - " + context.getValue());
    }
}
