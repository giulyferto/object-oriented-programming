package ar.com.ada.online.second.tesacamosunojo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cart shoppingCart = new Cart();
        Scanner keyboard = new Scanner(System.in);

        menu(shoppingCart,keyboard);
        shoppingCart.generateAndPrintTicket(keyboard);
    }
    static void menu (Cart shoppingCart, Scanner keyboard){
        int continueMenu;
        do {
            System.out.println("Por favor ingrese una categoria:\n\t1) Alimentos\n\t2) Ropa\n\t3) Juguetes\n\t4)Herramientas");
            int option = keyboard.nextInt();
            switch (option){
                case 1:
                    Foods foods = getFoodsItem(keyboard);
                    if (foods != null)
                        shoppingCart.addProduct(foods);
                    break;
                case 2:
                    Clothes clothes = getClothesItem(keyboard);
                    if (clothes != null)
                        shoppingCart.addProduct(clothes);
                    break;
                case 3:
                    Toys toys = getToysItem(keyboard);
                    if (toys != null)
                        shoppingCart.addProduct(toys);
                    break;
                case 4:
                    Tools tools = getToolsItem(keyboard);
                    if (tools != null)
                        shoppingCart.addProduct(tools);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");

            }

            System.out.println("Desea agregar otro producto?:\n\t1) Si\n\t2) No");
            continueMenu = keyboard.nextInt();

        }   while (continueMenu == 1);

    }
    static Foods getFoodsItem (Scanner keyboard){
        System.out.println("Seleccione un producto de la lista: ");
        System.out.println("\t1) Arroz\t\t $50");
        System.out.println("\t2) Fideos \t\t $45");
        System.out.println("\t3) Harina \t\t $60");
        System.out.println("\t4) Atun \t\t $90");

        Foods foods = new Foods();
        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                foods.setName("Arroz");
                foods.setPrice(50d);
                break;
            case 2:
                foods.setName("Fideos");
                foods.setPrice(45d);
                break;
            case 3:
                foods.setName("Harina");
                foods.setPrice(60d);
                break;
            case 4:
                foods.setName("Atun");
                foods.setPrice(90d);
                break;
            default:
                System.out.println("Debe elegir una opcion valida");
                foods = null;
        }
        return foods;
    }
    static Clothes getClothesItem (Scanner keyboard){
        System.out.println("Seleccione un producto de la lista: ");
        System.out.println("\t1) Zapatos niño \t\t $2000");
        System.out.println("\t2) Vestido \t\t $3500");
        System.out.println("\t3) Camisa hombre \t\t $1500");
        System.out.println("\t4) Sueter \t\t $1800");

        Clothes clothes = new Clothes();
        int option = keyboard.nextInt();
        switch (option){
            case 1:
                clothes.setName("Zapatos niño");
                clothes.setPrice(2000d);
                clothes.setDepartment("kids");
                break;
            case 2:
                clothes.setName("Vestido");
                clothes.setPrice(3500d);
                clothes.setDepartment("women");
                break;
            case 3:
                clothes.setName("Camisa hombre");
                clothes.setPrice(1500d);
                clothes.setDepartment("men");
                break;
            case 4:
                clothes.setName("Sueter");
                clothes.setPrice(1800d);
                clothes.setDepartment("unisex");
                break;
            default:
                System.out.println("Debe elegir una opcion valida");
                clothes = null;
        }
        return clothes;
    }

    static Toys getToysItem (Scanner keyboard){
        System.out.println("Seleccione un producto de la lista: ");
        System.out.println("\t1) Cartas UNO\t\t $600");
        System.out.println("\t2) Lego 1000 pzs \t\t $1250");
        System.out.println("\t3) PS4 \t\t $30000");
        System.out.println("\t4) Barbie \t\t $2000");

        Toys toys = new Toys();
        int option = keyboard.nextInt();

        switch (option){
            case 1:
                toys.setName("Cartas UNO");
                toys.setPrice(600d);
                break;
            case 2:
                toys.setName("Lego 1000 pzs");
                toys.setPrice(1250d);
                break;
            case 3:
                toys.setName("PS4");
                toys.setPrice(3000d);
                break;
            case 4:
                toys.setName("Barbie");
                toys.setPrice(2000d);
                break;
            default:System.out.println("Debe elegir una opcion valida");
                toys = null;
        }
        return toys;
    }
    static Tools getToolsItem (Scanner keyboard){
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Taladro\t\t$5000");
        System.out.println("\t2) Llave ajustable\t\t$950");
        System.out.println("\t3) Pala de Jardineria\t\t$700");
        System.out.println("\t4) Martillo\t\t$1500");

        Tools tool = new Tools();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                tool.setName("Taladro");
                tool.setPrice(5000d);
                break;
            case 2:
                tool.setName("Llave ajustable");
                tool.setPrice(950d);
                break;
            case 3:
                tool.setName("Pala de Jardineria");
                tool.setPrice(700d);
                break;
            case 4:
                tool.setName("Martillo");
                tool.setPrice(1500d);
                break;
            default:
                System.out.println("Debe elejir un opcion valida");
                tool = null;
        }
        return tool;
    }

}
