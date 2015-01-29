package lab1.model;

/**
 *
 * @author Tyler
 */
public class AreaOfRectangle {
    
    private double lengthOfSide;
    private double widthOfSide;
    private double totalArea;

    public AreaOfRectangle(double lengthOfSide, double widthOfSide) {
        this.lengthOfSide = lengthOfSide;
        this.widthOfSide = widthOfSide;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public double getWidthOfSide() {
        return widthOfSide;
    }

    public void setWidthOfSide(double widthOfSide) {
        this.widthOfSide = widthOfSide;
    }
    
        public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double calculateAreaOfRectangle(double lengthOfSide, double widthOfSide) {
        this.lengthOfSide = lengthOfSide;
        totalArea = lengthOfSide * widthOfSide;
        return totalArea;
    }
    
    /*
    public static void main(String[] args) {
       AreaOfRectangle aor = new AreaOfRectangle(5,5);
       
        System.out.println(aor.calculateAreaOfSquare(5, 5)); 
    }
    */
}
