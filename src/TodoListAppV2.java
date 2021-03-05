import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.ViewTodoList;

public class TodoListAppV2 {
  public static void main(String[] args) {

    TodoListRepository todoListRepository = new TodoListRepositoryImpl();

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    ViewTodoList viewTodoList = new ViewTodoList(todoListService);
    viewTodoList.viewShowTodoList();

  }
}
