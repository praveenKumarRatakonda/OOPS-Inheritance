class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }

    public double volume() {
        return width*height*depth;
    }
}
class Solution {
    public static void main(String[] args) {
        Box b = new Box(10, 20, 30);
        System.out.println("Volume of the box is: " + b.volume());
    }
}
