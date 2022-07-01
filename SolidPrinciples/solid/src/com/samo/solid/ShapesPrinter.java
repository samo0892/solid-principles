package com.samo.solid;

import java.util.List;

public class ShapesPrinter {

    private IAreaCalculator iAreaCalculator;

    public ShapesPrinter(IAreaCalculator iAreaCalculator) {
        this.iAreaCalculator = iAreaCalculator;
    }
    public String json(List<Shape> shapes) {
        return String.format("{shapesSum: %s}", iAreaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return String.format("shapes_sum, %s", iAreaCalculator.sum(shapes));
    }
}
