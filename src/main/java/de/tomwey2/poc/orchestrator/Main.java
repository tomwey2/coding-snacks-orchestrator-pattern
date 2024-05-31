package de.tomwey2.poc.orchestrator;

import de.tomwey2.poc.orchestrator.example.*;
import de.tomwey2.poc.orchestrator.pattern.Orchestrator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Orchestrator orchestrator = new Orchestrator();
        orchestrator
                .setContext(new ContextA())
                .execute(new MyTaskA())
                .setContext(new ContextB())
                .parallel(List.of(new MyTaskB(), new MyTaskC()))
                ;
    }
}
