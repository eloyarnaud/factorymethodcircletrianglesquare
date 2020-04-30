package design.adapter;

public class Rectangle implements Shape {
      @Override
      public void draw() {
      System.out.println("Desenhando o Ret�ngulo");
      }

      @Override
      public void resize() {
      System.out.println("Redimensionando o Ret�ngulo");
      }

      @Override
      public String description() {
      return "Ret�ngulo";
      }

      @Override
      public boolean isHide() {
      return false;
      }

}