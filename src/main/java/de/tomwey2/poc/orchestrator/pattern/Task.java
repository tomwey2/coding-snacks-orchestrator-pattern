package de.tomwey2.poc.orchestrator.pattern;

public interface Task<T extends Context> {
    void execute(T context);
}
