package view;

import service.TodoListService;
import util.InputUtil;

public class ViewTodoList {

  private TodoListService todoListService;

  public ViewTodoList (TodoListService todoListService){
    this.todoListService = todoListService;
  }

  public void viewShowTodoList(){
    while (true){
      todoListService.showTodoList();
      System.out.println("MENU : ");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var value = InputUtil.input("Pilih");

      if (value.equals("1")){
        //tambah
        addTodoList();
      } else if (value.equals("2")){
        //hapus
        removeTodoList();
      } else if (value.equals("x")){
        break;
      } else {
        System.out.println("Pilihan tidak dimengerti !!");
      }
    }
  }

  public void addTodoList(){
    System.out.println("Menambah TODO LIST");

    var value = InputUtil.input("Todo (x jika batal)");

    if(value.equals("x")){
      // batal
    } else {
      todoListService.addTodoList(value);
    }
  }

  public void removeTodoList(){
    System.out.println("Menghapus TODO LIST");

    var value = InputUtil.input("Nomor yang dihapus (x jika batal)");

    if (value.equals("x")){
      // batal
    } else {
      todoListService.removeTodoList(Integer.valueOf(value));
    }
  }

}
