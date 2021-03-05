package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.ViewTodoList;

public class TestTodoListView {
  public static void main(String[] args) {

    //testAddTodoList();
    testRemoveTodoList();

  }

  public static void showTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    ViewTodoList viewTodoList = new ViewTodoList(todoListService);

    todoListService.addTodoList("belajar java");
    todoListService.addTodoList("belajar php");
    todoListService.addTodoList("belajar lain");

    viewTodoList.viewShowTodoList();
  }

  public static void testAddTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    ViewTodoList viewTodoList = new ViewTodoList(todoListService);

    viewTodoList.addTodoList();

    todoListService.showTodoList();
  }

  public static void testRemoveTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    ViewTodoList viewTodoList = new ViewTodoList(todoListService);


    todoListService.addTodoList("belajar java");
    todoListService.addTodoList("belajar php");
    todoListService.addTodoList("belajar lain");

    todoListService.showTodoList();
    viewTodoList.removeTodoList();
    todoListService.showTodoList();


  }
}

