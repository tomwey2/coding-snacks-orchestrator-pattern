package de.tomwey2.poc.orchestrator.example;

import de.tomwey2.poc.orchestrator.pattern.Task;

public class MyTaskC implements Task<ContextB> {
    public void execute(ContextB context) {
        System.out.println("TaskC - " + context.getValue());
    }
}
