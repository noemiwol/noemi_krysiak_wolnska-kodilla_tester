package homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;


public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.name = name;
        this.opened = opened;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(getName(), task.getName()) &&
                Objects.equals(getOpened(), task.getOpened()) &&
                Objects.equals(getDeadline(), task.getDeadline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOpened(), getDeadline());
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "(" +
                "Nazwa zadania='" + name + '\'' +
                ", Data rozpoczęcia zadania=" + opened +
                ", Data zakończenia zadania=" + deadline +
                ')';
    }
}
