package design.adapter;

public class Rectangle implements Shape {
      @Override
      public void draw() {
      System.out.println("Desenhando o Retângulo");
      }

      @Override
      public void resize() {
      System.out.println("Redimensionando o Retângulo");
      }

      @Override
      public String description() {
      return "Retângulo";
      }

      @Override
      public boolean isHide() {
      return false;
      }

}