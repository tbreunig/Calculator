package lab2.model;

/**
 *
 * @author Tyler
 */
public class AreaOfSquare {

    private double lengthOfSide;
    private double totalArea;

    public AreaOfSquare(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double calculateAreaOfSquare(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
        totalArea = Math.pow(lengthOfSide,2);
        return totalArea;
    }
    /*
    public static void main(String[] args) {
       AreaOfSquare aos = new AreaOfSquare(5);
       
        System.out.println(aos.CalculateAreaOfSquare(5)); 
    }
    */
}
