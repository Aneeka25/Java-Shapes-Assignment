// SquareBasePyramid.java
class SquareBasePyramid extends Shape {
    public SquareBasePyramid(double base, double height) {
        super(base, height, 0, 4);
    }

    public double calculateArea() {
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two);
        return (dim_one * dim_one) + 2 * dim_one * slantHeight;
    }

     public double calculateVolume() {
        return (1.0 / 3.0) * (dim_one * dim_one) * dim_two;
    }

      public double calculatePerimeter() {
        return 4 * dim_one;
    }
}

