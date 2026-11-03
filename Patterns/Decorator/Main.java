package Patterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Bebidas cafe = new Cafe();
        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());
        
        cafe = new Acucar(cafe);

        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());
        
        cafe = new Acucar(cafe);

        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());
        
    
    }
}
