package xx;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Restaurant re = new Restaurant(5);
        re.addDish("火锅",50.0);
        re.addDish("干锅",40.0);
        re.showMenu();
        System.out.println();
        re.deleteDish("火锅");
        re.showMenu();
        System.out.println();
        re.update("干锅",60);
        re.showMenu();
    }
}
class Food{
    String name;
    double price;
    public Food(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void introduce(){
        System.out.println("菜名为：" + name + " ，价格为：" + price);
    }
}
class Restaurant{
    Food[] menu;
    int count;
    public Restaurant(int numberOfDishes){
        menu = new Food[numberOfDishes];
        count = 0;
    }
    public Restaurant(){
        this(2);
    }
    public boolean addDish(String name,double price){

        menu[count] = new Food(name,price);

        count++;
        for (int i =0;i<menu.length;i++){
            if (menu[i].name == name){
                return true;
            }
        }
        return false;
    }
    public boolean update(String name,double newPrice){
        for (int i = 0;i<count;i++){
            if (name.equals(menu[i].name)){
                menu[i].price = newPrice;
                return true;
            }
        }
        return false;
    }
    public boolean deleteDish(String name){
        for (int i = 0;i<count;i++){
            if (name.equals(menu[i].name)){
                for (int j = i;j<count-1;j++){
                    menu[j] = menu[j+1];
                }
                count--;
                return true;
            }
        }
        return false;
    }
    public void showMenu(){
        for (int i = 0;i<count;i++){
           menu[i].introduce();
        }
    }
}
