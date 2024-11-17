package Entities;

public class TodoList {
    private String todo;
    private int id;

    public TodoList() {
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(final String todo) {
        this.todo = todo;
    }

    public int getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }
}
