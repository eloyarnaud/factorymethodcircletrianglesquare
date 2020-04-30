package design.adapter;

public class Main {

      public static void main(String[] args) {
            System.out.println("Criando desenho...");
            Drawing drawing = new Drawing();
            drawing.addShape(new Rectangle());
            drawing.addShape(new Circle());
            System.out.println("Desenhando...");
            drawing.draw();
            System.out.println("Redimensionando...");
            drawing.resize();

      }

}