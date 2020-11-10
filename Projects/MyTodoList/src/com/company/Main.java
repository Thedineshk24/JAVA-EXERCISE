package com.company;

import java.util.Scanner;

public class Main {
//    importing existing class
    private static TodoFunction myTodoList = new TodoFunction();
//    scanner
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int command = 0;
        boolean exit = false;
        printCommand();

        while (!exit){
            System.out.println("Enter your choices/command:- ");
            command = scan.nextInt();
            scan.nextLine();

            switch (command){
                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("only print betweeen given commands/choices");
            }
        }
    }

    public static void printCommand(){
        System.out.println("\n commands:"+
                "\n press 0: to print instruction"+
                "\n press 1: to print all-list"+
                "\n press 2: to add list in todo"+
                "\n press 3: to modify item in todo"+
                "\n press 4: to remove item from todo"+
                "\n press 5: to search an item from todo"+
                "\n press 6: to exit todo app!!!");

        }
//        addItem
    public static void addItem(){
        System.out.println("Enter Item to be added in todo-list...");
        myTodoList.addItem(scan.nextLine());
    }

//    updateItem
    public static void updateItem(){
        System.out.println("Enter the item number:- ");
        int index = scan.nextInt();
        scan.nextLine();
        System.out.println("enter new item to be added:- ");
        String myNewItem = scan.nextLine();
        // update
        myTodoList.editTodo(index -1,myNewItem);
    }

//    remove item
    public static void removeItem(){
        System.out.println("Enter the item number to be deleted");
        int index = scan.nextInt();
        scan.nextLine();
        myTodoList.removeItem(index - 1);
    }

//    search item
    public static void searchItem(){
        System.out.println("Enter String to be searched");
        String search = scan.nextLine();

        if(myTodoList.findItem(search) == null){
            System.out.println("item was not found in your todo-list");
        }else{
            System.out.println(search + " found in your todo-list");
        }
    }
}
