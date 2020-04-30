package design.adapter;

import java.util.ArrayList;

import java.util.List;

public class Drawing {
    List<Shape> shapes = new ArrayList<Shape>();
    public Drawing() {
    super();
    }

    public void addShape(Shape shape) {
    shapes.add(shape);
    }

    public List<Shape> getShapes() {
    return new ArrayList<Shape>(shapes);
    }

    public void draw() {
          if (shapes.isEmpty()) {
          System.out.println("N�o tem o que desenhar!");
          } else {
          shapes.stream().forEach(shape -> shape.draw());
          }
    }

    public void resize() {

          if (shapes.isEmpty()) {

          System.out.println("Nada a redimensionar!");

          } else {

          shapes.stream().forEach(shape -> shape.resize());

          }

    }

}