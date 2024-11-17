package Repositories;

import Entities.TodoList;
import Services.TodoListServicesImpl;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import config.Database;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class TodoListDbImpl implements TodoListRepository {
    private final Database database;

    public TodoListDbImpl(Database database) {
        this.database = database;
    }

    @Override
    public TodoList[] getAll() {
        Connection connection = database.getConnection();
        String sqlStatement = "SELECT * FROM todos";
        List<TodoList> todolists = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sqlStatement);
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
            while (resultSet.next()){
                TodoList todoList = new TodoList();
                int id = resultSet.getInt(1);
                String todo = resultSet.getString(2);
                todoList.setId(id);
                todoList.setTodo(todo);
                todolists.add(todoList);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return todolists.toArray(TodoList[]::new);
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public Boolean remove(Integer id) {
        return null;
    }

    @Override
    public Boolean edit(TodoList todoList) {
        return null;
    }
}
