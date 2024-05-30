package de.tomwey2.poc.orchestrator;

import de.tomwey2.poc.orchestrator.example.*;
import de.tomwey2.poc.orchestrator.pattern.Orchestrator;

public class Main {

    public static void main(String[] args) {
        Orchestrator orchestrator = new Orchestrator();
        orchestrator
                .setContext(new ContextA())
                .execute(new MyTaskA())
                .setContext(new ContextB())
                .execute(new MyTaskB())
                .execute(new MyTaskC())
                ;
    }
}
