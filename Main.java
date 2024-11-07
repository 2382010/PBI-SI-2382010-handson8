import Entities.TodoList;
import Repositories.TodoListRepository;
import Repositories.TodoListRepositoryImpl;
import Services.TodoListServicesImpl;
import Services.TodoListServices;
import View.TodoListTerminalView;
import View.TodoListView;
import View.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListServices todoListServices = new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListServices);
        todoListView.run();
    }
}
