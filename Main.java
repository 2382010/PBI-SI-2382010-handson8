import Entities.TodoList;
import Repositories.TodoListDbImpl;
import Repositories.TodoListRepository;
import Repositories.TodoListRepositoryImpl;
import Services.TodoListServicesImpl;
import Services.TodoListServices;
import View.TodoListTerminalView;
import View.TodoListView;
import View.TodoListView;
import config.Database;

public class Main {
    public static void main(String[] args) {

        Database database = new Database("todo_si", "root", "", "localhost", "3306");
        database.setup();
          TodoListRepository todoListRepository = new TodoListDbImpl(database);

          TodoListServices todoListServices = new TodoListServicesImpl(todoListRepository);
          TodoListView todoListView = new TodoListTerminalView(todoListServices);
          todoListView.run();
    }
}
