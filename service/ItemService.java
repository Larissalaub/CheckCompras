package service;

import model.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemService {

    // Lista para armazenar os itens
    private List<Item> itemList;

    // Construtor para inicializar a lista de itens
    public ItemService() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, int quatily, double price){
    Item newItem = new Item(name, quatily, price);
    itemList.add(newItem);
    System.out.println("Item adicionado:" + newItem);
    }
    public void removeItem(String name){
        itemList.removeIf(item -> item.getName().equalsIgnoreCase(name));
        System.out.println("Item Removido" + name);
    }
    public void listItems(){
        if (itemList.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Lista de Compras");
            for (Item item : itemList){
                System.out.println(item);
            }
        }
    }
    public double getTotal() {
        return itemList.stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
    }
}