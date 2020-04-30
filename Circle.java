package design.adapter;

public class Circle implements Shape {
      @Override
      public void draw() {
      System.out.println("Desenhando o Círculo");
      }
      @Override
      public void resize() {
      System.out.println("Redimensionando o círculo");
      }
      @Override
      public String description() {
      return "Círculo";
      }
      @Override
      public boolean isHide() {
      return false;
      }

}