package com.company;

import java.util.ArrayList;

public class TodoFunction {
//    creating arraylist
    private ArrayList<String> todoList = new ArrayList<>();

//    adding item on todolist
    public void addItem(String item){
        todoList.add(item);
    }

//    remove item from todolist
    public void removeItem(int index){
        String myItem = todoList.get(index); // optional for now
        todoList.remove(index);
    }

//    print the list item
    public void printTodoList(){
        System.out.println("todo list has+"+ todoList.size() +" numbers of items!");
        for(int i=0; i < todoList.size(); i++){
            System.out.println("item at position "+ (i+1) + " is " +todoList.get(i));
        }
    }

//    edit item on TodoList
    public void editTodo(int index, String list){
//        todoList.add(index,list);
        todoList.set(index,list);
        System.out.println("updation has complated at position "+(index+1));
    }

//    search item on todolist
    public String findItem( String searchItem){
        int index = todoList.indexOf(searchItem);

        if(index < 0){
            return null;
        }else{
            return todoList.get(index);
        }
    }
}
