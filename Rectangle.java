class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0, 4);
    }

    public double calculateArea() {
        return dim_one * dim_two;
    }

    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two);
    }

     public double calculateVolume() {
        return 0; // No volume for a rectangle
    }
}
