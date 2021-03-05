package test.service;

import entity.TodoList;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TestTodoListService {
  public static void main(String[] args) {

    //testShowTodoList();

//    testAddTodoList();
    testRemoveTodoList();


  }

  public static void testShowTodoList(){
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new TodoList("belajar java");
    todoListRepository.data[1] = new TodoList("belajar php");

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    todoListService.showTodoList();
  }

  public static void testAddTodoList(){
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("belajar java");
    todoListService.addTodoList("belajar php");
    todoListService.showTodoList();
  }

  public static void testRemoveTodoList(){
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("belajar java");
    todoListService.addTodoList("belajar php");
    todoListService.addTodoList("belajar java oop");
    todoListService.showTodoList();
    todoListService.removeTodoList(4);
    todoListService.showTodoList();
    todoListService.removeTodoList(2);
    todoListService.showTodoList();

  }

}
