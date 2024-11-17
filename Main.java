import config.Database;
import Repositories.TodoListRepository;
import Repositories.TodoListDbImpl;
import Services.TodoListServices;
import Services.TodoListServiceImpl;
import View.TodoListTerminalViewImpl;
import View.TodoListView;

public class Main {
    public static void main(String[] args) {

        Database database = new Database("todo_si", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListDbImpl(database);
        TodoListServices todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalViewImpl(todoListService);
        todoListView.run();
    }
}