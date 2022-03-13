package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<>();

    public void addShape(Shape shape){
        this.list.add(shape);
    }

    public boolean removeShape(Shape shape){
        boolean remove = this.list.remove(shape);
        return remove;
    }

    public Shape getFigure(int n){
        if (list.isEmpty()){
            return null;
        } else {
            return list.get(n);
        }
    }

    public String showFigures(){
        String names = "";
        for (Shape shape:list) {
            if(names!=""){
                names += " ";
            }
            names += shape.toString();
        }
        return names;
    }

}
