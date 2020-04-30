package design.adapter;

public class Circle implements Shape {
      @Override
      public void draw() {
      System.out.println("Desenhando o C�rculo");
      }
      @Override
      public void resize() {
      System.out.println("Redimensionando o c�rculo");
      }
      @Override
      public String description() {
      return "C�rculo";
      }
      @Override
      public boolean isHide() {
      return false;
      }

}